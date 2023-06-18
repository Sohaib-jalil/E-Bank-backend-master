package com.sohaib.e_bankbackend.repositories;

import com.sohaib.e_bankbackend.entities.BankAccount;
import com.sohaib.e_bankbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, String> {
}
