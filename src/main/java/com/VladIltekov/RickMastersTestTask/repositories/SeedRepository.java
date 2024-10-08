package com.VladIltekov.RickMastersTestTask.repositories;

import com.VladIltekov.RickMastersTestTask.models.SeedModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface SeedRepository extends JpaRepository <SeedModel, Long> {
}
