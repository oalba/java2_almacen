public class Manzana {
	//propiedades
	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;

	//métodos getter y setter
	public void setTipoManzana (String tm){
		tipoManzana = tm;
	}
	public String getTipoManzana(){
		return tipoManzana;
	}
	public void setProcedencia (String pro){
		procedencia = pro;
	}
	public String getProcedencia(){
		return procedencia;
	}
	public void setColor (String col){
		color = col;
	}
	public String getColor(){
		return color;
	}
	public void setEurosKilo (Double ek){
		eurosKilo = ek;
	}
	public Double getEurosKilo(){
		return eurosKilo;
	}
	public void setDistribuidor (Distribuidor dis){
		distribuidor = dis;
	}
	public Distribuidor getDistribuidor(){
		return distribuidor;
	}

}