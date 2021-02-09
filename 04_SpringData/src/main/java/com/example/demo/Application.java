package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entidad.Coche;
import com.example.demo.persistencia.DaoCoche;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		DaoCoche daoCoche = context.getBean("daoCoche", DaoCoche.class);
		Coche coche = new Coche();
		coche.setMatricula("CMD-2456");
		coche.setMarca("Ferrari");
		coche.setPotencia(1100);
		
		//daoCoche.save(coche);
		
		Coche c2 = new Coche();
		c2.setId(1);
		c2.setMatricula("FDR-9876");
		c2.setMarca("Ferrari");
		c2.setPotencia(1200);
		//sobreescribimos
		daoCoche.save(c2);
		Coche c3 = daoCoche.findById(1).get();
		System.out.println(c3);
		Optional<Coche> cocheOptional = daoCoche.findById(2);
		if(cocheOptional.isPresent()) {
			System.out.println("Existe el coche");
			System.out.println(cocheOptional.get());
			
		}else {
			System.out.println(" No existe");
		}
		
		//Recuperar todos los coches
		List<Coche> listaCoches = daoCoche.findAll();
		System.out.println("Lista de coches");
		
		
		
	}

}
