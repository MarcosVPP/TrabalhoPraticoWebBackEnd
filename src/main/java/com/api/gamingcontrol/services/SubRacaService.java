package com.api.gamingcontrol.services;

import com.api.gamingcontrol.models.SubRaca;

import java.util.List;
import java.util.Optional;

public interface SubRacaService {

    Optional<SubRaca> getASubRacaById(Integer id);
    List<SubRaca> getAllSubRacas();
    void deleteAllSubRacas();
    void deleteSubRacaById(Integer id);
    void updateSubRacaById(Integer id, SubRaca subRaca);
    void updateSubRaca(SubRaca subRaca);
    void insertSubRaca(SubRaca subRaca);
}

