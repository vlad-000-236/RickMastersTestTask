package com.VladIltekov.RickMastersTestTask.repositories;

import com.VladIltekov.RickMastersTestTask.models.BrigadeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrigadeRepository extends JpaRepository <BrigadeModel, long> {
}
