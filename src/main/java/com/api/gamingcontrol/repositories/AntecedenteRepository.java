package com.api.gamingcontrol.repositories;

import com.api.gamingcontrol.models.Antecedente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("antecedenteRepository")

public interface AntecedenteRepository extends JpaRepository<Antecedente, Integer> {


}


