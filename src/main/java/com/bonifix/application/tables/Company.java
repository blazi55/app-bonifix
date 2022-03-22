package com.bonifix.application.tables;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "COMPANY")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Company {

    //TODO 16.03 dodać musze unique do brakujących pól

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotNull
    private String name;

    @OneToMany(mappedBy = "company")
    private List<CompanyRole> companyRole;

    @OneToMany(mappedBy = "company")
    private List<Award> awards;
}
