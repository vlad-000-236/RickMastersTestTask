package com.VladIltekov.RickMastersTestTask.services;

import com.VladIltekov.RickMastersTestTask.models.SeedModel;
import org.springframework.stereotype.Component;

@Component
public interface SeedService {

    public SeedModel getSeedById(long id);

    public SeedModel removeSeed();

    public SeedModel getBrigade();
}
