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
	String getNombre(){
		return nombre;
	}
	void setCif (String cf){
		cif = cf;
	}
	String getCif(){
		return cif;
	}
	void setDireccion (Direccion dir){
		direccion = dir;
	}
	Direccion getDireccion(){
		return direccion;
	}
	void setPersonaContacto (Contacto pc){
		personaContacto = pc;
	}
	Contacto getPersonaContacto(){
		return personaContacto;
	}
}
