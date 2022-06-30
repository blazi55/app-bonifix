package com.bonifix.application.award;

import com.bonifix.application.tables.Award;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AwardService {

    private final AwardRepository awardRepository;
    private final AwardMapper awardMapper;

    @Transactional
    public AwardDto createAward(AwardDto awardDto) {
        if (awardDto.getId() != null) {
            throw new IllegalArgumentException("Id should be null. Id= " + awardDto.getId());
        }

        final Award award = this.awardMapper.toEntity(awardDto);
        this.awardRepository.save(award);
        return this.awardMapper.toDto(award);
    }

    @Transactional
    public AwardDto updateAward(AwardDto awardDto) {
        if (awardDto.getId() == null) {
            throw new IllegalArgumentException("Id shouldn't be null. Id= " + awardDto.getId());
        }

        final Award award = awardMapper.toEntity(awardDto);
        this.awardRepository.save(award);
        return this.awardMapper.toDto(award);
    }

    @Transactional
    public void deleteAward(Long id) {
        this.awardRepository.deleteById(id);
    }
}
