package com.bonifix.application.company;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("company")
@RequiredArgsConstructor
public class CompanyController {
    
    private final CompanyService companyService;

    @PostMapping
    public CompanyDto create(@RequestBody CompanyDto companyDto) {
        return this.companyService.createCompany(companyDto);
    }

    @PutMapping
    public CompanyDto update(@RequestBody CompanyDto companyDto) {
        return this.companyService.updateCompany(companyDto);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        this.companyService.deleteCompany(id);
    }

}
