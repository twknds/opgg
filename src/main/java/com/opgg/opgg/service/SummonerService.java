package com.opgg.opgg.service;

import com.opgg.opgg.Dto.SummonerDto;
import com.opgg.opgg.Dto.SummonerRequestDto;


public interface SummonerService {
    SummonerDto find(SummonerRequestDto summonerRequestDto);
}
