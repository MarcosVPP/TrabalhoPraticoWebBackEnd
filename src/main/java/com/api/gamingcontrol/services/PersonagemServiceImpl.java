package com.api.gamingcontrol.services;
import com.api.gamingcontrol.models.Personagem;
import com.api.gamingcontrol.repositories.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import java.util.List;
import java.util.Optional;

@Service("personagemService")
public class PersonagemServiceImpl implements PersonagemService {
    @Autowired
    PersonagemRepository personagemRepository;

    @Override
    public Optional<Personagem> getPersonagemById(Integer id) {
        return personagemRepository.findById(id);
    }

    @Override
    public List<Personagem> getAllPersonagens() {
        return personagemRepository.findAll();
    }

    @Override
    public void deleteAllPersonagens() {
        personagemRepository.deleteAll();
    }

    @Override
    public void deletePersonagemById(Integer id) {
        personagemRepository.deleteById(id);
    }

    @Override
    public void updatePersonagemById(Integer id, Personagem personagem) {
        personagemRepository.save(personagem);

    }

    @Override
    public void updatePersonagem(Personagem personagem) {
        personagemRepository.save(personagem);
    }

    @Override
    public void insertPersonagem(Personagem personagem) {
        personagemRepository.save(personagem);
    }
}

