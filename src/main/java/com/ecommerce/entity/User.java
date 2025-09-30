package com.ecommerce.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username is mandatory")
    @Size(min = 3,max = 50, message = "Username must be between 3 and 50 characters")
    @Column(unique = true,nullable = false)
    private String username;

    @NotBlank(message = "Password is mandatory")
    @Size(min = 6,max = 100, message = "Password must be between 6 and 100 characters")
    private String password;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email is not valid")
    @Column(unique = true,nullable = false)
    private String email;

    @NotNull(message = "Role is mandatory")
    @Column(nullable = false)
    private String role;

    @NotNull(message = "Status is mandatory")
    @Column(nullable = false)
    private String status;

    @NotNull(message = "Created At is mandatory")
    @Column(nullable = false)
    private LocalDateTime createdAt;

    @NotNull(message = "Updated At is mandatory")
    @Column(nullable = false)
    private LocalDateTime updatedAt;

}