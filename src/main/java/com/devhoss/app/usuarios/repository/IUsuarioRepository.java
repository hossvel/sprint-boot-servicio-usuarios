package com.devhoss.app.usuarios.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;


import com.devhoss.app.usuarios.models.Usuario;


public interface IUsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{

	public Usuario findByUsername(@Param("username") String username);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario obtenerPorUsername(String username);
}
