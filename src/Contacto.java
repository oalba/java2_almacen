class Contacto {

	//añadid las propiedades convenientes
	private String nombre;
	private String apellido;
	private String email;
	private int telefono;
	//métodos getter y setter
	void setNombre (String nom){
		nombre = nom;
	}
	String getNombre(){
		return nombre;
	}
	void setApellido (String ape){
		apellido = ape;
	}
	String getApellido(){
		return apellido;
	}
	void setEmail (String em){
		email = em;
	}
	String getEmail(){
		return email;
	}
	void setTelefono (int tlf){
		telefono = tlf;
	}
	int getTelefono(){
		return telefono;
	}
}