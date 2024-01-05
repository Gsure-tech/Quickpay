package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.dto.*;
import com.gsuretech.gsuretechbank.entity.Otp;
import com.gsuretech.gsuretechbank.repository.OtpRepository;
import com.gsuretech.gsuretechbank.utils.AppUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Slf4j
@Service
public class OtpServiceImpl implements OtpService {
    private final OtpRepository otpRepository;
    private final EmailService emailService;

    @Override
    public BankResponse sendOtp(OtpRequest otpRequest) {
        //generate the otp
        //send the otp
        //save the otp

        String otp = AppUtils.generateOtp();
        log.info("Otp: {}", otp);

        otpRepository.save(Otp.builder()
                .email(otpRequest.getEmail())
                .otp(otp)
                .expiredAt(LocalDateTime.now().plusMinutes(2))
                .build());
        emailService.sendEmailAlert(EmailDetails.builder()
                .subject("DO NOT DISCLOSE")
                .recipient(otpRequest.getEmail())
                .messageBody("This organization has sent you an otp." +
                        "This otp expires in 2minutes. " + otp)
                .build());
        return BankResponse.builder()
                .responseCode("200")
                .responseMessage("SUCCESS")
                .build();
    }

    /**
     * ascertain that the user actually sent an otp
     * ascertain the otp hasn't expired
     * ascertain the otp is correct
     */

    @Override
    public BankResponse validateOtp(OtpValidationRequest otpValidationRequest) {
        Otp otp = otpRepository.findByEmail(otpValidationRequest.getEmail());
        log.info("Email; {}", otpValidationRequest.getEmail());
        if (otp == null) {
            return BankResponse.builder()
                    .responseCode("400")
                    .responseMessage("You have not sent an otp")
                    .build();
        }
        if (otp.getExpiredAt().isBefore(LocalDateTime.now())){
            return BankResponse.builder()
                    .responseCode("400")
                    .responseMessage("Expired otp")
                    .build();
        }
        if (!otp.getOtp().equals(otpValidationRequest.getOtp())) {
            return BankResponse.builder()
                    .responseCode("400")
                    .responseMessage("Invalid otp")
                    .build();
        }
        return BankResponse.builder()
                .responseCode("200")
                .responseMessage("SUCCESS")
                .otpResponse(OtpResponse.builder()
                        .isOtpValid(true)
                        .build())
                .build();
    }
}
