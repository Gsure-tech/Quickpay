package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.dto.TransactionDto;
import com.gsuretech.gsuretechbank.entity.Transaction;
import com.gsuretech.gsuretechbank.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TransactionImpl implements TransactionService{

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
        Transaction transaction = Transaction.builder()
                .transactionType(transactionDto.getTransactionType())
                .accountNumber(transactionDto.getAccountNumber())
                .amount(transactionDto.getAmount())
                .status("SUCCESS")
        .build();
        transactionRepository.save(transaction);
        System.out.println("Transaction saved successfully");

    }
}
