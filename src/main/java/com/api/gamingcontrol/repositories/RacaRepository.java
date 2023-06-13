package com.api.gamingcontrol.repositories;

import com.api.gamingcontrol.models.Raca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("racaRepository")

public interface RacaRepository extends JpaRepository<Raca, Integer> {


}



