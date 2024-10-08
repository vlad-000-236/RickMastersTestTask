package com.VladIltekov.RickMastersTestTask.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Table (name = "seed")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class SeedModel {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    long id;

    String sort;

    int weight;

    String country;

    int robustaPercent;

    int arabicaPercent;

}