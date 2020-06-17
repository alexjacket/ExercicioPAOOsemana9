package br.bossini.veiculo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.bossini.veiculo2.model.Veiculo;
import br.bossini.veiculo2.utils.CalculadoraKM;
import br.com.bossini.veiculo2.repository.VeiculosRepository;

@Service
public class VeiculosService {
	@Autowired
	private VeiculosRepository veiculosRepo;
	@Autowired
	private CalculadoraKM calcKm;
	
	public void salvar (Veiculo veiculo) {
		veiculosRepo.save(veiculo);
	}
	public List <Veiculo> listarTodosCalculaKM(){
		List <Veiculo> veiculos = veiculosRepo.findAll();
		for (Veiculo veiculo : veiculos) {
			calcKm.CalculaAutonomia(veiculo.getLitros(), veiculo.getKm());
		}
		return veiculos;
	}
}
