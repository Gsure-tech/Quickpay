package com.gsuretech.gsuretechbank.repository;

import com.gsuretech.gsuretechbank.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
