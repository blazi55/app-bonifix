package com.bonifix.application.company;

import com.bonifix.application.tables.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {
}
