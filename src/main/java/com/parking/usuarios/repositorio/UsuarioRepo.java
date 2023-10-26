package com.parking.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parking.usuarios.modelo.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {

	public Usuario findByEmail(String email);

}
