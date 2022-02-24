package com.bonifix.application.company_role;

import com.bonifix.application.company.CompanyDto;
import com.bonifix.application.company.CompanyMapper;
import com.bonifix.application.tables.CompanyRole;
import com.bonifix.application.user.UserDto;
import com.bonifix.application.user.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CompanyRoleMapper {

    private final CompanyMapper companyMapper;
    private final UserMapper userMapper;

    public CompanyRoleDto toDto(CompanyRole companyRole) {
        final CompanyDto companyDto = companyMapper.toDto(companyRole.getCompany());
        final UserDto userDto = userMapper.toDto(companyRole.getUser());
        return CompanyRoleDto.builder()
                .id(companyRole.getId())
                .role(companyRole.getRole())
                .companyId(companyDto.getId())
                .userId(userDto.getId())
                .build();
    }
}
