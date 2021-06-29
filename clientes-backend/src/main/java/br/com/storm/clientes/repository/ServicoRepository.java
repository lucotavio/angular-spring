package br.com.storm.clientes.repository;

import br.com.storm.clientes.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
