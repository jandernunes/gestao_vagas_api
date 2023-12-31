package com.jandersoares.gestao_vagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Entity(name = "company")
@Data
public class CompanyEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Pattern(regexp = "\\S+", message = "Username must not contain spaces")
    private String username;

    @Email(message = "Email is not valid")
    private String email;

    @Length(min = 3, max = 20, message = "Password must be between 3 and 20 characters")
    private String password;

    private String name;
    private String website;
    private String description;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
