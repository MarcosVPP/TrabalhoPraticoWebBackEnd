package com.api.gamingcontrol.repositories;

import com.api.gamingcontrol.models.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("personagemRepository")

public interface PersonagemRepository extends JpaRepository<Personagem, Integer> {


}


