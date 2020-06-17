package br.com.bossini.veiculo2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.bossini.veiculo2.model.Veiculo;

@Repository
public interface VeiculosRepository extends JpaRepository <Veiculo, Long> {

}
