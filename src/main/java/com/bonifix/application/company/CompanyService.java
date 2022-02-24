package com.bonifix.application.company;

import com.bonifix.application.tables.Company;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyMapper companyMapper;

    @Transactional
    public CompanyDto createCompany(CompanyDto companyDto) {
        //TODO Sprawdzic czy id jest null, w przeciwnym wypadku wyrzucic wyjatek.
        final Company company = this.companyMapper.toEntity(companyDto);
        this.companyRepository.save(company);
        return this.companyMapper.toDto(company);
    }

    @Transactional
    public CompanyDto updateCompany(CompanyDto companyDto) {
        if (companyDto.getName() == null) {
            throw new IllegalArgumentException("CompanyDto shouldn't contain null. " + companyDto);
        }

        if (!this.companyRepository.existsById(companyDto.getId())) {
            throw new IllegalArgumentException("Company with id" + companyDto.getId() +
                    " doesn't exist. ");
        }
        final Company company = companyMapper.toEntity(companyDto);
        this.companyRepository.save(company);
        return this.companyMapper.toDto(company);
    }

    @Transactional
    public void deleteCompany(Long id) {
        this.companyRepository.deleteById(id);
    }
}
