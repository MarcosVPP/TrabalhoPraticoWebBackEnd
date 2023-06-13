package com.api.gamingcontrol.services;

import com.api.gamingcontrol.models.Personagem;

import java.util.List;
import java.util.Optional;

public interface PersonagemService {

    Optional<Personagem> getPersonagemById(Integer id);
    List<Personagem> getAllPersonagens();
    void deleteAllPersonagens();
    void deletePersonagemById(Integer id);
    void updatePersonagemById(Integer id, Personagem personagem);
    void updatePersonagem(Personagem personagem);
    void insertPersonagem(Personagem personagem);
}

