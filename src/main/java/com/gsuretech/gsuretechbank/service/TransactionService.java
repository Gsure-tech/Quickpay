package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.dto.EmailDetails;
import com.gsuretech.gsuretechbank.dto.TransactionDto;
import com.gsuretech.gsuretechbank.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
