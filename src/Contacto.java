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
	final String getNombre(){
		return nombre;
	}
	void setApellido (String ape){
		apellido = ape;
	}
	final String getApellido(){
		return apellido;
	}
	void setEmail (String em){
		email = em;
	}
	final String getEmail(){
		return email;
	}
	void setTelefono (int tlf){
		telefono = tlf;
	}
	final int getTelefono(){
		return telefono;
	}
}