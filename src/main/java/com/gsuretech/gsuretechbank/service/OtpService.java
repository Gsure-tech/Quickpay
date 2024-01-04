package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.dto.BankResponse;
import com.gsuretech.gsuretechbank.dto.OtpRequest;

public interface OtpService {
    BankResponse sendOtp(OtpRequest otpRequest);
}
