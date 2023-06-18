package com.sohaib.e_bankbackend.dtos;

import com.sohaib.e_bankbackend.entities.BankAccount;
import com.sohaib.e_bankbackend.enums.OperationType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;

}
