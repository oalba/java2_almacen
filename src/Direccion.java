class Direccion {

	//añadid las propiedades convenientes
	private String poblacion;
	private String localidad;
	private String calle;
	private int numero;

	//métodos getter y setter
	void setPoblacion (String pob){
		poblacion = pob;
	}
	String getPoblacion(){
		return poblacion;
	}
	void setLocalidad (String pueblo){
		localidad = pueblo;
	}
	String getLocalidad(){
		return localidad;
	}
	void setCalle (String cal){
		calle = cal;
	}
	String getCalle(){
		return calle;
	}
	void setNumero (int num){
		numero = num;
	}
	int getNumero(){
		return numero;
	}
}