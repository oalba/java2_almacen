class Producto{
	private String procedencia;
	private int cod_barras;
	private Distribuidor distribuidor;
	private String color;
	private Double eurosKilo;
	private String tipoManzana;
	private String tipoLechuga;
	private Double eurosUnidad;
	private String tipo;
	private Double eurosLitro;
	
	void setTipo (String tip){
		tipo = tip;
	}
	final String getTipo(){
		return tipo;
	}
	void setEurosLitro (Double el){
		eurosLitro = el;
	}
	final Double getEurosLitro(){
		return eurosLitro;
	}
	void setTipoLechuga (String tl){
		tipoLechuga = tl;
	}
	final String getTipoLechuga(){
		return tipoLechuga;
	}
	void setEurosUnidad (Double eu){
		eurosUnidad = eu;
	}
	final Double getEurosUnidad(){
		return eurosUnidad;
	}

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
	void setEurosKilo (Double ek){
		eurosKilo = ek;
	}
	final Double getEurosKilo(){
		return eurosKilo;
	}
	void setTipoManzana (String tm){
		tipoManzana = tm;
	}
	final String getTipoManzana(){
		return tipoManzana;
	}
}