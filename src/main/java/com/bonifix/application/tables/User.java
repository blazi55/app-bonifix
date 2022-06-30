package com.bonifix.application.tables;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Table(name = "USER")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    //TODO dodać musze unique do brakujących pól (pesel, login)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotNull
    private String login;

    @Column
    @NotNull
    private String password;

    @Column
    @NotNull
    private String firstname;

    @Column
    @NotNull
    private String lastname;

    @Column(unique = true)
    @NotNull
    private String pesel;

    @Column(unique = true)
    @NotNull
    private String email;

    @Column
    @NotNull
    private LocalDateTime creationDate;

    @OneToOne(mappedBy = "user", cascade = CascadeType.PERSIST)
    private UserAccount userAccount;

    @OneToOne(mappedBy = "user")
    private CompanyRole companyRole;

}
