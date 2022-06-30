package com.bonifix.application.award;

import com.bonifix.application.tables.Award;
import org.springframework.data.repository.CrudRepository;

public interface AwardRepository extends CrudRepository<Award, Long> {
}
