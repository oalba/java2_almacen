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
	final String getPoblacion(){
		return poblacion;
	}
	void setLocalidad (String pueblo){
		localidad = pueblo;
	}
	final String getLocalidad(){
		return localidad;
	}
	void setCalle (String cal){
		calle = cal;
	}
	final String getCalle(){
		return calle;
	}
	void setNumero (int num){
		numero = num;
	}
	final int getNumero(){
		return numero;
	}
}