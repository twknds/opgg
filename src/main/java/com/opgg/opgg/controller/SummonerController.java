package com.opgg.opgg.controller;

import com.opgg.opgg.Dto.SummonerDto;
import com.opgg.opgg.Dto.SummonerRequestDto;
import com.opgg.opgg.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
@RequestMapping("/summoner")
@RestController
@RequiredArgsConstructor
public class SummonerController {
    private final SummonerService summonerService;
    @GetMapping("/search")
    public SummonerDto summonerController(@RequestBody @Valid SummonerRequestDto summonerRequestDto){
        return summonerService.find(summonerRequestDto);
    }
}
