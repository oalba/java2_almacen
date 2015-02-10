class Leche {

	//propiedades
	private String tipo;
	private String procedencia;
	private Double eurosLitro;
	private Distribuidor distribuidor;
	private int cod_barras;

	//métodos getter y setter
	void setTipo (String tip){
		tipo = tip;
	}
	String getTipo(){
		return tipo;
	}
	void setProcedencia (String pro){
		procedencia = pro;
	}
	String getProcedencia(){
		return procedencia;
	}
	void setEurosLitro (Double el){
		eurosLitro = el;
	}
	Double getEurosLitro(){
		return eurosLitro;
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
