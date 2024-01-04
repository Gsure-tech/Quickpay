package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.dto.BankResponse;
import com.gsuretech.gsuretechbank.dto.OtpRequest;
import com.gsuretech.gsuretechbank.repository.OtpRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Slf4j
@Service
public class OtpServiceImpl implements OtpService{
    private final OtpRepository otpRepository;
    private final EmailService emailService;
    @Override
    public BankResponse sendOtp(OtpRequest otpRequest) {
        return null;
    }
}
