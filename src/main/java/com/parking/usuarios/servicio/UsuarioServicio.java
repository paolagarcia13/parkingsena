package com.parking.usuarios.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.parking.usuarios.dto.UsuarioRegistroDTO;
import com.parking.usuarios.modelo.Usuario;

public interface UsuarioServicio extends UserDetailsService{

		public Usuario guardar(UsuarioRegistroDTO registroDTO);
		
		public List<Usuario> listarUsuarios();

}
