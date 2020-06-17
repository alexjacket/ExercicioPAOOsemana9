package br.bossini.veiculo2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.bossini.veiculo2.utils.CalculadoraKM;

@Configuration
public class AppConfig {
	@Bean
	public CalculadoraKM getCalculadora() {
		return new CalculadoraKM();
	}

}
