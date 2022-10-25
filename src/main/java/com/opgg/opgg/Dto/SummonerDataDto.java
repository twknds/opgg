package com.opgg.opgg.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SummonerDataDto {
    int wins;
    int losses;
    String summonerId;
    String summonerName;
    boolean veteran;
    boolean inactive;
    boolean freshBlood;
    boolean hotStreak;
    String rank;
    String tier;
    String queueType;
    int leaguePoints;
    String leagueId;
}
