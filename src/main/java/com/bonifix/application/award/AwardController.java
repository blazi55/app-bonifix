package com.bonifix.application.award;

import com.bonifix.application.tables.Award;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("award")
@RequiredArgsConstructor
public class AwardController {

    private final AwardService awardService;

    @PostMapping
    public AwardDto create(@RequestBody AwardDto awardDto) {
        return this.awardService.createAward(awardDto);
    }

    @PutMapping
    public AwardDto update(@RequestBody AwardDto awardDto) {
        return this.awardService.updateAward(awardDto);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id) {
        this.awardService.deleteAward(id);
    }
}
