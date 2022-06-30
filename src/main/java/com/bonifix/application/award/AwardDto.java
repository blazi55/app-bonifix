package com.bonifix.application.award;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AwardDto {

    private Long id;
    private Long price;
    private String name;
}
