package com.VladIltekov.RickMastersTestTask.repositories;

import com.VladIltekov.RickMastersTestTask.models.SeedModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BagRepository extends JpaRepository<SeedModel, Long> {
}
