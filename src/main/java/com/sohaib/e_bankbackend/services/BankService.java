package com.sohaib.e_bankbackend.services;

import com.sohaib.e_bankbackend.entities.BankAccount;
import com.sohaib.e_bankbackend.entities.CurrentAccount;
import com.sohaib.e_bankbackend.entities.SavingAccount;
import com.sohaib.e_bankbackend.repositories.BankAccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BankService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consulter(){
        BankAccount bankAccount = bankAccountRepository.findById("1a244055-b02d-43af-8b03-c644be5c58f2").orElse(null);
        if (bankAccount != null) {
            System.out.println("*************************");
            System.out.println(bankAccount.getId());
            System.out.println(bankAccount.getBalance());
            System.out.println(bankAccount.getStatus());
            System.out.println(bankAccount.getCreatedAt());
            System.out.println(bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if (bankAccount instanceof CurrentAccount) {
                System.out.println(((CurrentAccount) bankAccount).getOverDraft());
            } else {
                System.out.println(((SavingAccount) bankAccount).getInterestRate());
            }

            bankAccount.getAccountOperations().forEach(op -> {
                System.out.println(op.getType() + "\t" + op.getOperationDate() + "\t" + op.getAmount());
            });
        }
    }
}
