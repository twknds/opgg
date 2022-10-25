package com.opgg.opgg.Dto;

import com.sun.istack.NotNull;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class SummonerRequestDto {
    @NotBlank
    private String name;
}
