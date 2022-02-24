package com.bonifix.application.user;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateUserDto {

    private String login;
    private String password;
    private String firstname;
    private String lastname;
    private String pesel;
    private String email;

}
