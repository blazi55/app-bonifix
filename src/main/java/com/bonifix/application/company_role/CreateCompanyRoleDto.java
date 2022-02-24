package com.bonifix.application.company_role;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCompanyRoleDto {

    private String userEmail;
    private Long companyId;

}
