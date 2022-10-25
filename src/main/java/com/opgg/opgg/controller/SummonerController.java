package com.opgg.opgg.controller;

import com.opgg.opgg.Dto.SummonerDataDto;
import com.opgg.opgg.Dto.SummonerDto;
import com.opgg.opgg.Dto.SummonerRequestDto;
import com.opgg.opgg.Dto.VersionCheckDto;
import com.opgg.opgg.service.SummonerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

@RequestMapping("/summoner")
@RestController
@RequiredArgsConstructor
public class SummonerController {
    private final SummonerService summonerService;
    @GetMapping("/search")
    public void summonerController(HttpServletResponse response, Model model, SummonerRequestDto summonerRequestDto) throws IOException {
        SummonerDto summonerDto=summonerService.find(summonerRequestDto);
        SummonerDataDto summonerDataDto=summonerService.getData(summonerDto);
        VersionCheckDto versionCheckDto = summonerService.getVersion();

        model.addAttribute("summoner",summonerDto);
        model.addAttribute("profileImgURL", "http://ddragon.leagueoflegends.com/cdn/"+ versionCheckDto.getN().getProfileicon() +"/img/profileicon/"+summonerDto.getProfileIconId()+".png");
        model.addAttribute("leagueInfo", summonerDataDto);
        model.addAttribute("tierImgURL", "img/emblems/Emblem_"+summonerDataDto.getTier()+".png");
        //model.addAttribute("leagueName", );
        response.sendRedirect("http://localhost:8080/home/search");
    }
}
