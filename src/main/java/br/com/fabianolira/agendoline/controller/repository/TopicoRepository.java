package br.com.fabianolira.agendoline.controller.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabianolira.agendoline.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
	
	List<Topico> findByCursoNome(String nomeCurso);

}