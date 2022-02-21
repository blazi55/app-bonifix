package com.bonifix.application.user;

import com.bonifix.application.tables.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
