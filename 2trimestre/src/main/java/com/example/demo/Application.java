package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.entidad.VideoJuego;
import com.example.demo.persistencia.DaoVideojuegos;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		//DaoVideojuegos daoJuegos = context.getBean("daoJuegos", DaoVideojuegos.class);
		DaoVideojuegos daoVideojuegos = context.getBean("daoVideojuegos", DaoVideojuegos.class);
		VideoJuego videojuego = new VideoJuego();
		videojuego.setNombre("FIFA 21");
		videojuego.setCompania("EA");
		videojuego.setPuntuacion(8.7);
		
		
		
		VideoJuego v2 = new VideoJuego();
		v2.setId(1);
		v2.setNombre("Assasins Creed");
		v2.setCompania("SEGA");
		v2.setPuntuacion(8.4);
		//sobreescribimos
		daoVideojuegos.save(v2);
		VideoJuego v3 = daoVideojuegos.findById(1).get();
		System.out.println(v3);
		Optional<VideoJuego> videojuegoOptional = daoVideojuegos.findById(2);
		if(videojuegoOptional.isPresent()) {
			System.out.println("Existe el videojuego");
			System.out.println(videojuegoOptional.get());
			
		}else {
			System.out.println(" No existe");
		}
		
		
		List<VideoJuego> listaVideojuegos = daoVideojuegos.findAll();
		System.out.println(listaVideojuegos);
		VideoJuego v4 = new VideoJuego();
		v4.setId(1);
		v4.setNombre("Fall guys");
		v4.setCompania("Diversity");
		v4.setPuntuacion(7.7);
		//sobreescribimos
		daoVideojuegos.save(v4);
		
		VideoJuego v5 = new VideoJuego();
		v5.setId(2);
		v5.setNombre("NHL21");
		v5.setCompania("SEGA");
		v5.setPuntuacion(8.1);
		//sobreescribimos
		daoVideojuegos.save(v5);
		
		VideoJuego v6 = new VideoJuego();
		v6.setId(3);
		v6.setNombre("Warzone");
		v6.setCompania("sar");
		v6.setPuntuacion(6.9);
		//sobreescribimos
		daoVideojuegos.save(v6);
		
		List<VideoJuego> listaVideojuegos2 = daoVideojuegos.findAll();
		System.out.println(listaVideojuegos2);
		
		
	}

}
