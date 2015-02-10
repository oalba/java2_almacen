class Cliente {
	//propiedades

	private String nombre;
	private String apellidos;
	private String DNI;
	private Direccion direccion;
	private int num_socio;
	private Double dto;

	//métodos getter y setter
	void setNombre (String nom){
		nombre = nom;
	}
	String getNombre(){
		return nombre;
	}
	void setApellidos (String ape){
		apellidos = ape;
	}
	String getApellidos(){
		return apellidos;
	}
	void setDNI (String dn){
		DNI = dn;
	}
	String getDNI(){
		return DNI;
	}
	void setDireccion (Direccion dir){
		direccion = dir;
	}
	Direccion getDireccion(){
		return direccion;
	}
	void setNum_Socio (int ns){
		num_socio = ns;
	}
	int getNum_Socio(){
		return num_socio;
	}
	void setDto (Double dt){
		dto = dt;
	}
	Double getDto(){
		return dto;
	}
}