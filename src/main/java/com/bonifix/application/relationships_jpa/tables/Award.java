package com.bonifix.application.relationships_jpa.tables;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "AWARD")
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Award {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private Long price;

    @Column
    @NotNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_award_id", referencedColumnName = "id")
    private UserAward userAward;
}
