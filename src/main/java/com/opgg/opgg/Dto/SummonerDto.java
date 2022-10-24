package com.opgg.opgg.Dto;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SummonerDto {
    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private long revisionDate;
    private String id;
    private String accountId;

}
