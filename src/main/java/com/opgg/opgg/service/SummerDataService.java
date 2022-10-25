package com.opgg.opgg.service;

import com.opgg.opgg.Dto.SummonerDto;
import com.opgg.opgg.Dto.SummonerRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
@RequiredArgsConstructor
public class SummerDataService implements SummonerService{
    @Value("${riot.key}")
    private String API_KEY;

    @Override
    public SummonerDto find(SummonerRequestDto summonerRequestDto){
        String urlstr = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/" + summonerRequestDto.getName() +"?api_key="+ API_KEY;
        RestTemplate restTemplate = new RestTemplate();
            //System.out.println(summonerDto);
            /*URL url = new URL(urlstr);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(),"UTF-8"));

            String result = "";
            String line;*/
        return restTemplate.getForObject(urlstr,SummonerDto.class);
    }
}
