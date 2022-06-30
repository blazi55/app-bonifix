package com.bonifix.application.award;

import com.bonifix.application.tables.Award;
import org.springframework.stereotype.Component;

@Component
public class AwardMapper {

    public Award toEntity(AwardDto awardDto) {
        return Award.builder()
                .id(awardDto.getId())
                .name(awardDto.getName())
                .price(awardDto.getPrice())
                .build();
    }

    public AwardDto toDto(Award award) {
        return AwardDto.builder()
                .id(award.getId())
                .name(award.getName())
                .price(award.getPrice())
                .build();
    }
}
