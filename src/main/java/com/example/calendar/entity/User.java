package com.example.calendar.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "사용자 이름은 필수입니다")
    @Column(unique = true)
    private String username;

    @NotBlank(message = "비밀번호는 필수입니다")
    private String password;
}
