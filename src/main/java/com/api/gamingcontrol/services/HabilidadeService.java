package com.api.gamingcontrol.services;

import com.api.gamingcontrol.models.Habilidade;

import java.util.List;
import java.util.Optional;

public interface HabilidadeService {

    Optional<Habilidade> getHabilidadeById(Integer id);
    List<Habilidade> getAllHabilidades();
    void deleteAllHabilidades();
    void deleteHabilidadeById(Integer id);
    void updateHabilidadeById(Integer id, Habilidade habilidade);
    void updateHabilidade(Habilidade habilidade);
    void insertHabilidade(Habilidade habilidade);
}

