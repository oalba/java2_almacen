class Distribuidor {
	//propiedades
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;

	//metodos getter y setter
	void setNombre (String nom){
		nombre = nom;
	}
	final String getNombre(){
		return nombre;
	}
	void setCif (String cf){
		cif = cf;
	}
	final String getCif(){
		return cif;
	}
	void setDireccion (Direccion dir){
		direccion = dir;
	}
	final Direccion getDireccion(){
		return direccion;
	}
	void setPersonaContacto (Contacto pc){
		personaContacto = pc;
	}
	final Contacto getPersonaContacto(){
		return personaContacto;
	}

	
}
