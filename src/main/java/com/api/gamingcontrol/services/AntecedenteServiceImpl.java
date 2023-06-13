package com.api.gamingcontrol.services;
import com.api.gamingcontrol.models.Antecedente;
import com.api.gamingcontrol.repositories.AntecedenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import java.util.List;
import java.util.Optional;

@Service("antecedenteService")
public class AntecedenteServiceImpl implements AntecedenteService {
    @Autowired
    AntecedenteRepository antecedenteRepository;
    @Override
    public Optional<Antecedente> getAntecedenteById(Integer id) {
        return antecedenteRepository.findById(id);
    }
    @Override
    public List<Antecedente> getAllAntecedentes() {

        return antecedenteRepository.findAll();
    }
    @Override
    public void deleteAllAntecedentes() {

        antecedenteRepository.deleteAll();
    }
    @Override
    public void deleteAntecedenteById(Integer id) {

        antecedenteRepository.deleteById(id);
    }
    @Override
    public void updateAntecedenteById(Integer id, Antecedente antecedente) {
        antecedenteRepository.save(antecedente);
    }

    @Override
    public void updateAntecedente(Antecedente antecedente) {

        antecedenteRepository.save(antecedente);
    }

    @Override
    public void insertAntecedente(Antecedente antecedente) {
        antecedenteRepository.save(antecedente);
    }
}


