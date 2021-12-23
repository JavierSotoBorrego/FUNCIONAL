package funcional.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import funcional.persona.persona;

@RestController
public class controller {
	
	private List<persona> listUsuarios= List.of(new persona("Javi","Soto","0000"),
			new persona("Elena","Rivas","1111"),
			new persona("Hugo","Marte","2222")
			);
	
	@GetMapping("/login")
	public String login(@RequestParam(value = "usuario") String usuario,@RequestParam(value = "password") String password) {
		List<persona> user = listUsuarios.stream().filter(usur -> (usur.getUsuario().equals(usuario)) && (usur.getPassword().equals(password))).collect(Collectors.toList());
		return "Hola " + user.get(1).getNombre();
	}

			}
			
			
