package com.api.gamingcontrol.services;
import com.api.gamingcontrol.models.Habilidade;
import com.api.gamingcontrol.repositories.HabilidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("habilidadeService")
public class HabilidadeServiceImpl implements HabilidadeService {

    @Autowired
    HabilidadeRepository habilidadeRepository;

    @Override
    public Optional<Habilidade> getHabilidadeById(Integer id) {

        return habilidadeRepository.findById(id);
    }

    @Override
    public List<Habilidade> getAllHabilidades() {

        return habilidadeRepository.findAll();
    }

    @Override
    public void deleteAllHabilidades() {

        habilidadeRepository.deleteAll();
    }

    @Override
    public void deleteHabilidadeById(Integer id) {

        habilidadeRepository.deleteById(id);
    }

    @Override
    public void updateHabilidadeById(Integer id, Habilidade habilidade) {

        habilidadeRepository.save(habilidade);
    }

    @Override
    public void updateHabilidade(Habilidade habilidade) {

        habilidadeRepository.save(habilidade);
    }

    @Override
    public void insertHabilidade(Habilidade habilidade) {

        habilidadeRepository.save(habilidade);
    }
}


