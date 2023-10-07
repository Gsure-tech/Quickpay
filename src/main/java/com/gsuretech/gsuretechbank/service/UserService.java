package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.dto.*;

import java.util.List;

public interface UserService {
    BankResponse createAccount(UserRequest userRequest);
    BankResponse balanceEnquiry(EnquiryRequest request);
    String nameEnquiry(EnquiryRequest request);
    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transfer(TransferRequest request);
    BankResponse login(LoginDto loginDto);

    List<UsersDto> getUsers();
    UsersDto getUser(long id);
}
