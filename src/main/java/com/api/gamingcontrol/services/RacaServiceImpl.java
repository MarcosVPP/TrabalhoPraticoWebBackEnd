package com.api.gamingcontrol.services;
import com.api.gamingcontrol.models.Raca;
import com.api.gamingcontrol.repositories.RacaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service("racaService")
public class RacaServiceImpl implements RacaService {
    @Autowired
    RacaRepository racaRepository;
    @Override
    public Optional<Raca> getRacaById(Integer id) {
        return racaRepository.findById(id);
    }
    @Override
    public List<Raca> getAllRacas() {

        return racaRepository.findAll();
    }
    @Override
    public void deleteAllRacas() {
        racaRepository.deleteAll();
    }
    @Override
    public void deleteRacaById(Integer id) {
        racaRepository.deleteById(id);
    }
    @Override
    public void updateRacaById(Integer id, Raca raca) {
        Optional<Raca> getRaca = getRacaById(id);
        getRaca.get().setNome(raca.getNome());
        getRaca.get().setIdioma(raca.getIdioma());
        racaRepository.save(raca);
        /* id_habilidade e id_subraca virão de outra model*/
    }

    @Override
    public void updateRaca(Raca raca) {
    }

    @Override
    public void insertRaca(Raca raca) {
        racaRepository.save(raca);
    }
}

