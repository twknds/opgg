package com.opgg.opgg.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mapping.model.BasicPersistentEntity;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Summoner{
    private int profileIconId;
    private String name;
    private String puuid;
    private long summonerLevel;
    private long revisionDate;
    private String id;
    private String accountId;
}
