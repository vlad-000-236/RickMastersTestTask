package com.VladIltekov.RickMastersTestTask.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Table(name = "brigade")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class BrigadeModel {

    long UUID;

    int brigadeNumber;

    int lostPercent;
}
