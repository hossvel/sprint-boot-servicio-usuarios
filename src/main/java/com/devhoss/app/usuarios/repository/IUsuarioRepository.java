package com.devhoss.app.usuarios.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.devhoss.app.usuarios.models.Usuario;



@RepositoryRestResource(path="usuarios", collectionResourceRel = "usuarios")
public interface IUsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{

	@RestResource(path="buscar-username")
	public Usuario findByUsername(@Param("username") String username);
	
	@Query("select u from Usuario u where u.username=?1")
	public Usuario obtenerPorUsername(String username);
	

	 @RestResource
	 Usuario findById(Long aLong);
	 
	 @RestResource
	 Usuario save(Usuario u);
}
