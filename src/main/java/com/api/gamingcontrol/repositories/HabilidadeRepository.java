package com.api.gamingcontrol.repositories;

import com.api.gamingcontrol.models.Habilidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("habilidadeRepository")

public interface HabilidadeRepository extends JpaRepository<Habilidade, Integer> {


}


