package com.bonifix.application.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private Long id;
    private String login;
    private String firstname;
    private String lastname;
    private String pesel;
    private LocalDateTime creationDate;

}
