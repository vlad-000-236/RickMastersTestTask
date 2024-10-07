package com.VladIltekov.RickMastersTestTask.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class BalanceDto {

    private String sort;

    private String country;

    private int balance;

    public BalanceDto(String country, int balance){
        this.country = country;
        this.balance = balance;

        sort = "none";
    }

   public BalanceDto(int balance, String sort){
        this.sort = sort;
        this.balance = balance;

        country = "none";
    }
}
