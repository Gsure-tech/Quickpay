package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.dto.BankResponse;
import com.gsuretech.gsuretechbank.dto.OtpRequest;
import com.gsuretech.gsuretechbank.dto.OtpValidationRequest;

public interface OtpService {
    BankResponse sendOtp(OtpRequest otpRequest);
    BankResponse validateOtp(OtpValidationRequest otpValidationRequest);

}
