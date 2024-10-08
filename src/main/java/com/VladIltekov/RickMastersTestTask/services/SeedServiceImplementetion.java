package com.VladIltekov.RickMastersTestTask.services;

import com.VladIltekov.RickMastersTestTask.models.SeedModel;
import com.VladIltekov.RickMastersTestTask.repositories.SeedRepository;
import org.hibernate.Session;
import org.hibernate.SessionBuilder;


public class SeedServiceImplementetion implements SeedService{

    private final SeedModel seedModel;
    private final SeedRepository seedRepository;

    public SeedServiceImplementetion(SeedModel seedModel, SeedRepository seedRepository){
        this.seedModel = seedModel;
        this.seedRepository = seedRepository;
    }
    @Override
    public SeedModel getSeedById(long id) {
        return seedRepository.getById(id);
    }

    @Override
    public SeedModel removeSeed() {
        return null;
    }

    @Override
    public SeedModel getBrigade() {
        return null;
    }
}
