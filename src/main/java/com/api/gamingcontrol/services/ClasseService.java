package com.api.gamingcontrol.services;

import com.api.gamingcontrol.models.Classe;

import java.util.List;
import java.util.Optional;

public interface ClasseService {

    Optional<Classe> getClasseById(Integer id);
    List<Classe> getAllClasses();
    void deleteAllClasses();
    void deleteClasseById(Integer id);
    void updateClasseById(Integer id, Classe classe);
    void updateClasse(Classe classe);
    void insertClasse(Classe classe);
}


