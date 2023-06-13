package com.api.gamingcontrol.services;
import com.api.gamingcontrol.models.Classe;
import com.api.gamingcontrol.repositories.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import java.util.List;
import java.util.Optional;

@Service("classeService")
public class ClasseServiceImpl implements ClasseService {
    @Autowired
    ClasseRepository classeRepository;
    @Override
    public Optional<Classe> getClasseById(Integer id) {
        return classeRepository.findById(id);
    }
    @Override
    public List<Classe> getAllClasses() {

        return classeRepository.findAll();
    }
    @Override
    public void deleteAllClasses() {

        classeRepository.deleteAll();
    }
    @Override
    public void deleteClasseById(Integer id) {

        classeRepository.deleteById(id);
    }
    @Override
    public void updateClasseById(Integer id, Classe classe) {
        classeRepository.save(classe);
    }

    @Override
    public void updateClasse(Classe classe) {
        classeRepository.save(classe);
    }

    @Override
    public void insertClasse(Classe classe) {
        classeRepository.save(classe);
    }
}

