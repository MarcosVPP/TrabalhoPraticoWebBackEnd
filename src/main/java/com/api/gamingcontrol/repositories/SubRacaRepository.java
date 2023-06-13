package com.api.gamingcontrol.repositories;

import com.api.gamingcontrol.models.SubRaca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("subracaRepository")

public interface SubRacaRepository extends JpaRepository<SubRaca, Integer> {


}


