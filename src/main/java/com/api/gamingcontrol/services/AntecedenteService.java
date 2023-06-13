package com.api.gamingcontrol.services;

import com.api.gamingcontrol.models.Antecedente;

import java.util.List;
import java.util.Optional;

public interface AntecedenteService {

    Optional<Antecedente> getAntecedenteById(Integer id);
    List<Antecedente> getAllAntecedentes();
    void deleteAllAntecedentes();
    void deleteAntecedenteById(Integer id);
    void updateAntecedenteById(Integer id, Antecedente antecedente);
    void updateAntecedente(Antecedente antecedente);
    void insertAntecedente(Antecedente antecedente);
}

