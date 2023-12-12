package com.cardManagement;

import com.cardManagement.model.Card;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

@SpringBootApplication
public class CrudCardManagementApplication  {

	private JdbcTemplate jdbcTemplate;
	public static void main(String[] args) {
		System.out.println("app is about to start.............................");
		SpringApplication.run(CrudCardManagementApplication.class, args);
		System.out.println("app is ending....................................................");
	}

}
