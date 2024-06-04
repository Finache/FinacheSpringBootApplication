package com.flexidorm.artsch.security_management.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends User {
    @Column(length = 50)
    private String university;

    @Column(nullable = false, columnDefinition = "boolean default false")
    private boolean isVerified;
}
