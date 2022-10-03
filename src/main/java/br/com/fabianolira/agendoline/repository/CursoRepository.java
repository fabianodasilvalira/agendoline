package br.com.fabianolira.agendoline.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabianolira.agendoline.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
