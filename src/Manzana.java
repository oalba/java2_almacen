class Manzana {
	//propiedades
	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;
	private int cod_barras;

	//métodos getter y setter
	void setTipoManzana (String tm){
		tipoManzana = tm;
	}
	String getTipoManzana(){
		return tipoManzana;
	}
	void setProcedencia (String pro){
		procedencia = pro;
	}
	String getProcedencia(){
		return procedencia;
	}
	void setColor (String col){
		color = col;
	}
	String getColor(){
		return color;
	}
	void setEurosKilo (Double ek){
		eurosKilo = ek;
	}
	Double getEurosKilo(){
		return eurosKilo;
	}
	void setDistribuidor (Distribuidor dis){
		distribuidor = dis;
	}
	Distribuidor getDistribuidor(){
		return distribuidor;
	}
	void setCod_Barras (Integer cb){
		cod_barras = cb;
	}
	Integer getCod_Barras(){
		return cod_barras;
	}

}