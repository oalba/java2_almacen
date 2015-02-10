class Lechuga {

	//propiedades
	private String tipoLechuga;
	private String procedencia;
	private String color;
	private Double eurosUnidad;
	private Distribuidor distribuidor;
	private int cod_barras;

	//métodos getter y setter
	void setTipoLechuga (String tl){
		tipoLechuga = tl;
	}
	String getTipoLechuga(){
		return tipoLechuga;
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
	void setEurosUnidad (Double eu){
		eurosUnidad = eu;
	}
	Double getEurosUnidad(){
		return eurosUnidad;
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