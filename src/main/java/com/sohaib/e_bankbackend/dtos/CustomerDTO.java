package com.sohaib.e_bankbackend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sohaib.e_bankbackend.entities.BankAccount;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}
