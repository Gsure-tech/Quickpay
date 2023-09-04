package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.dto.BankResponse;
import com.gsuretech.gsuretechbank.dto.CreditDebitRequest;
import com.gsuretech.gsuretechbank.dto.EnquiryRequest;
import com.gsuretech.gsuretechbank.dto.UserRequest;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
}
