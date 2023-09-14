package com.devhoss.app.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EntityScan({"com.devhoss.app.usuarioscommons.models.entity"})
public class SprintBootServicioUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootServicioUsuariosApplication.class, args);
	}

}
