package br.com.storm.clientes;

import br.com.storm.clientes.entity.Cliente;
import br.com.storm.clientes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@SpringBootApplication
@RestController
public class ClientesBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientesBackendApplication.class, args);
	}

}
