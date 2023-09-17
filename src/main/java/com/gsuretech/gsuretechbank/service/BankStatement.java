package com.gsuretech.gsuretechbank.service;

import com.gsuretech.gsuretechbank.entity.Transaction;
import com.gsuretech.gsuretechbank.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Component
@AllArgsConstructor
public class BankStatement {

    @Autowired
    TransactionRepository transactionRepository;
    /**
     *retrieve list of transactions within a date range given an account number
     * generate a pdf file of transactions
     * send the file via email
     */

    public List<Transaction> generateStatement(String accountNumber, String startDate, String endDate){
        LocalDate start = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate end = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        List<Transaction> transactionList = transactionRepository.findAll().stream()
                .filter(transaction -> transaction.getAccountNumber().equals(accountNumber))
                .filter(transaction -> transaction.getCreatedAt().isEqual(start.atStartOfDay()))
                .filter(transaction -> transaction.getCreatedAt().isEqual(end.atStartOfDay()))
                .toList();
        return transactionList;
    }
}
