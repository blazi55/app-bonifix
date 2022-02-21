package com.bonifix.application.user;

import com.bonifix.application.tables.User;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {

    public UserDto toDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstname(user.getFirstname())
                .lastname(user.getLastname())
                .login(user.getLogin())
                .pesel(user.getPesel())
                .creationDate(user.getCreationDate())
                .build();
    }

}
