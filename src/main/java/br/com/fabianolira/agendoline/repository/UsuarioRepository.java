package br.com.fabianolira.agendoline.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fabianolira.agendoline.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByEmail(String email);

}
