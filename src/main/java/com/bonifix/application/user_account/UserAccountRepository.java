package com.bonifix.application.user_account;

import com.bonifix.application.tables.UserAccount;
import org.springframework.data.repository.CrudRepository;

public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {
}
