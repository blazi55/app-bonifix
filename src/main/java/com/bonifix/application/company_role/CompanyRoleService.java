package com.bonifix.application.company_role;
import com.bonifix.application.company.CompanyRepository;
import com.bonifix.application.tables.Company;
import com.bonifix.application.tables.CompanyRole;
import com.bonifix.application.tables.Role;
import com.bonifix.application.tables.User;
import com.bonifix.application.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.bonifix.application.tables.Role.ADMINISTRATOR;
import static com.bonifix.application.tables.Role.USER;

@Service
@RequiredArgsConstructor
public class CompanyRoleService {

    private final CompanyRoleRepository companyRoleRepository;
    private final CompanyRepository companyRepository;
    private final UserRepository userRepository;
    private final CompanyRoleMapper companyRoleMapper;


    @Transactional
    public CompanyRoleDto registerAdminRole(CreateCompanyRoleDto createCompanyRoleDto) {
        return registerUserRole(createCompanyRoleDto, ADMINISTRATOR);

    }

    @Transactional
    public CompanyRoleDto registerUserRole(CreateCompanyRoleDto createCompanyRoleDto) {
        return registerUserRole(createCompanyRoleDto, USER);
    }

    private CompanyRoleDto registerUserRole(CreateCompanyRoleDto createCompanyRoleDto, Role role) {
        final Company company = findCompany(createCompanyRoleDto.getCompanyId());
        final User user = findUser(createCompanyRoleDto.getUserEmail());
        final CompanyRole companyRole = CompanyRole.builder()
                .role(String.valueOf(role))
                .user(user)
                .company(company)
                .build();
        companyRoleRepository.save(companyRole);
        return companyRoleMapper.toDto(companyRole);
    }

    private Company findCompany(Long companyId) {
        return companyRepository.findById(companyId)
                .orElseThrow(() -> new IllegalArgumentException("Company with Id "
                        + companyId + " doesn't exist. " ));

    }

    private User findUser(String userEmail) {
        return userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new IllegalArgumentException("User with Email " +
                        userEmail + " doesn't exist. " ));

    }
}
