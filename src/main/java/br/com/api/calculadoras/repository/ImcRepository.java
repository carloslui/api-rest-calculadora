package br.com.api.calculadoras.repository;

import br.com.api.calculadoras.model.Imc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImcRepository extends JpaRepository <Imc, Integer>{

}

