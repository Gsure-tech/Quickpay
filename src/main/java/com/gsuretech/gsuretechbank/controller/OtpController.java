package com.gsuretech.gsuretechbank.controller;

import com.gsuretech.gsuretechbank.dto.BankResponse;
import com.gsuretech.gsuretechbank.dto.OtpRequest;
import com.gsuretech.gsuretechbank.dto.OtpValidationRequest;
import com.gsuretech.gsuretechbank.service.OtpService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/otp")
@AllArgsConstructor
public class OtpController {

    private final OtpService otpService;

    @PostMapping("/sendOtp")
    public BankResponse sendOtp(@RequestBody OtpRequest otpRequest){
        return otpService.sendOtp(otpRequest);
    }

    @PostMapping("/validateOtp")
    public BankResponse validateOtp(@RequestBody OtpValidationRequest otpValidationRequest){
        return otpService.validateOtp(otpValidationRequest);
    }
}
