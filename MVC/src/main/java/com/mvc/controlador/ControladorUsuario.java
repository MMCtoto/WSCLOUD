package com.mvc.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.mvc.modelo.entidad.Usuario;
import com.mvc.modelo.negocio.GestorUsuario;


@Controller

public class ControladorUsuario {
@Autowired
private GestorUsuario gestorUsuario;
@PostMapping("doLogin")
public String logarse(@RequestParam("usuario") String nombre, @RequestParam("pass") String password, Model model) {
	Usuario usuario = new Usuario();
	usuario.setNombre(nombre);
	usuario.setPassword(password);
	
	boolean validado = gestorUsuario.validarUsuario(usuario);
	
	if(validado) {
		
		model.addAttribute("usuario", nombre);
		
		return "search";
	}else {
		model.addAttribute("error", "No se encuentra el usuario");
		String msg = "usuario [" + nombre + "] no encontrado o contraseña incorrecta";
		model.addAttribute("path", msg);
		return "error";
	}
	
}

}






/*import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
*/


	

		


