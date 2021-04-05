package mjv.devschool.sistemalivaria;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import mjv.devschool.sistemalivaria.sample.ApplicationSample;

@SpringBootApplication
@EnableFeignClients
public class SistemalivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemalivrariaApplication.class, args);
	}
	@Bean
	public CommandLineRunner run(ApplicationSample bean) throws Exception{
		return args ->{
		//bean.usuarioPadrao();
		};
	}

}
