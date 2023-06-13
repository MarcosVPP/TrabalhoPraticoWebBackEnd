package com.api.gamingcontrol.repositories;

import com.api.gamingcontrol.models.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("classeRepository")

public interface ClasseRepository extends JpaRepository<Classe, Integer> {


}


