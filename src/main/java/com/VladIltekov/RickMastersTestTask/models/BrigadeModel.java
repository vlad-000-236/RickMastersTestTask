package com.VladIltekov.RickMastersTestTask.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Setter
@Getter
public class BrigadeModel {

    long UUID;

    int brigadeNumber;

    int lostPercent;
}
