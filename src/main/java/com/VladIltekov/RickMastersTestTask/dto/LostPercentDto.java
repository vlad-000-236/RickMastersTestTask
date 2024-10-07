package com.VladIltekov.RickMastersTestTask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class LostPercentDto {

    private int percent;

    private String typeLost;

    private int brigadeNumber;

    private String country;

    public LostPercentDto(String typeLost, String country, int percent){
        this.typeLost = typeLost;
        this.country = country;
        this.percent = percent;

        brigadeNumber = 0;
    }

    public LostPercentDto(String typeLost, int brigadeNumber, int percent){
        this.typeLost = typeLost;
        this.brigadeNumber = brigadeNumber;
        this.percent = percent;

        country = "none";
    }
}
