package com.TurismoReal.ProyectoTurismo;



import com.TurismoReal.ProyectoTurismo.persistence.entity.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class ProyectoTurismoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoTurismoApplication.class, args);
	}


}
