package br.bossini.veiculos2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.bossini.veiculo2.model.Veiculo;
import br.bossini.veiculo2.service.VeiculosService;

public class VeiculosController {

	@Autowired
	private VeiculosService veicService;
	@GetMapping("/veiculos")
	public ModelAndView listarVeiculos() {
		List <Veiculo> veiculos = veicService.listarTodosCalculaKM();
		ModelAndView mv = new ModelAndView("Veiculos");
		mv.addObject(new Veiculo());
		mv.addObject("veiculos", veiculos);
		return mv;
	}
	
	@PostMapping("/veiculos")
	public String salvar (Veiculo veiculo) {
		veicService.salvar(veiculo);
		return "redirect:/veiculos";
	}
}
