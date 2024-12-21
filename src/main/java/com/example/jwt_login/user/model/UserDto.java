package com.example.jwt_login.user.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
public class UserDto {

    private String username;
    private String password;

    public User toEntity(String encodedPassword) {
        User user = new User();
        user.setUsername(this.username);
        user.setPassword(encodedPassword);
        user.setRoles(Set.of("USER")); // 기본적으로 사용자에게 ROLE_USER 부여
        return user;
    }
}
