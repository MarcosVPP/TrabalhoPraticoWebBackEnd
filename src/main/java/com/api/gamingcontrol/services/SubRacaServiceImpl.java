package com.api.gamingcontrol.services;
import com.api.gamingcontrol.models.SubRaca;
import com.api.gamingcontrol.repositories.SubRacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import java.util.List;
import java.util.Optional;

@Service("subRacaService")
public class SubRacaServiceImpl implements SubRacaService {
    @Autowired
    SubRacaRepository subRacaRepository;

    @Override
    public Optional<SubRaca> getASubRacaById(Integer id) {
        return subRacaRepository.findById(id);
    }

    @Override
    public List<SubRaca> getAllSubRacas() {
        return subRacaRepository.findAll();
    }

    @Override
    public void deleteAllSubRacas() {
        subRacaRepository.deleteAll();
    }

    @Override
    public void deleteSubRacaById(Integer id) {
        subRacaRepository.deleteById(id);
    }

    @Override
    public void updateSubRacaById(Integer id, SubRaca subRaca) {
        subRacaRepository.save(subRaca);
    }

    @Override
    public void updateSubRaca(SubRaca subRaca) {
        subRacaRepository.save(subRaca);
    }

    @Override
    public void insertSubRaca(SubRaca subRaca) {
        subRacaRepository.save(subRaca);
    }
}

