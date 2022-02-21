package com.bonifix.application.user;

import com.bonifix.application.tables.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Transactional
    public UserDto createUser(CreateUserDto createUserDto) {
        final User user = create(createUserDto);
        userRepository.save(user);
        return userMapper.toDto(user);
    }

    private User create(CreateUserDto createUserDto) {
        return User.builder()
                .firstname(createUserDto.getFirstname())
                .lastname(createUserDto.getLastname())
                .login(createUserDto.getLogin())
                .password(createUserDto.getPassword())
                .pesel(createUserDto.getPesel())
                .creationDate(LocalDateTime.now())
                .build();
    }

}
