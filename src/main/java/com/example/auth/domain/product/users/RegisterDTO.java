package com.example.auth.domain.product.users;

public record RegisterDTO(String login, String password, UserRole role) {
}
