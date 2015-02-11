class Producto{
	private String procedencia;
	private int cod_barras;
	private Distribuidor distribuidor;
	private String color;

	void setProcedencia (String pro){
		procedencia = pro;
	}
	final String getProcedencia(){
		return procedencia;
	}
	void setCod_Barras (Integer cb){
		cod_barras = cb;
	}
	final Integer getCod_Barras(){
		return cod_barras;
	}
	void setDistribuidor (Distribuidor dis){
		distribuidor = dis;
	}
	final Distribuidor getDistribuidor(){
		return distribuidor;
	}
	void setColor (String col){
		color = col;
	}
	final String getColor(){
		return color;
	}

}