package com.api.gamingcontrol.services;

import com.api.gamingcontrol.models.Raca;

import java.util.List;
import java.util.Optional;

public interface RacaService {

    Optional<Raca> getRacaById(Integer id);
    List<Raca> getAllRacas();
    void deleteAllRacas();
    void deleteRacaById(Integer id);
    void updateRacaById(Integer id, Raca raca);
    void updateRaca(Raca raca);
    void insertRaca(Raca raca);
}

