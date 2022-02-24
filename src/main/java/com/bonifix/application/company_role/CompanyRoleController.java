package com.bonifix.application.company_role;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("role")
public class CompanyRoleController {

    private final CompanyRoleService companyRoleService;

    @PostMapping("/admin")
    public CompanyRoleDto createAdminRole(@RequestBody CreateCompanyRoleDto createCompanyRoleDto) {
        return this.companyRoleService.registerAdminRole(createCompanyRoleDto);
    }

    @PostMapping("/user")
    public CompanyRoleDto createUserRole(@RequestBody CreateCompanyRoleDto createCompanyRoleDto) {
        return this.companyRoleService.registerUserRole(createCompanyRoleDto);
    }
}
