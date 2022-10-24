package com.opgg.opgg.controller;

import com.opgg.opgg.Dto.SummonerDto;
import com.opgg.opgg.Dto.SummonerResponseDto;
import com.opgg.opgg.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SummonerController {
    final SummonerService summonerService;
    @GetMapping("/summon")
    public SummonerResponseDto summonerController(@RequestBody @Validated SummonerDto summonerDto){
        SummonerResponseDto result=summonerService.find(summonerDto);
        return result;
    }
}
