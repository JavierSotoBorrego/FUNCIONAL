package funcional.persona;

public class persona {
	private String Nombre;
	private String Usuario;
	private String Password;
	
	public persona() {
		super();
	}
	public persona(String nombre, String usuario, String password) {
		super();
		Nombre = nombre;
		Usuario = usuario;
		Password = password;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getUsuario() {
		return Usuario;
	}
	public void setUsuario(String usuario) {
		Usuario = usuario;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
	

}
