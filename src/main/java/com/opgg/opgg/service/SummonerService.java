package com.opgg.opgg.service;

import com.opgg.opgg.Dto.SummonerDataDto;
import com.opgg.opgg.Dto.SummonerDto;
import com.opgg.opgg.Dto.SummonerRequestDto;
import com.opgg.opgg.Dto.VersionCheckDto;
import com.opgg.opgg.entity.Summoner;
import org.springframework.web.client.RestTemplate;


public interface SummonerService {
    SummonerDto find(SummonerRequestDto summonerRequestDto);
    SummonerDataDto getData(SummonerDto summonerDto);
    VersionCheckDto getVersion();

}
