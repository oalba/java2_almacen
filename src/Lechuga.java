public class Lechuga {

	//propiedades
	private String tipoLechuga;
	private String procedencia;
	private String color;
	private Double eurosUnidad;
	private Distribuidor distribuidor;

	//métodos getter y setter
	public void setTipoLechuga (String tl){
		tipoLechuga = tl;
	}
	public String getTipoLechuga(){
		return tipoLechuga;
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
	public void setEurosUnidad (Double eu){
		eurosUnidad = eu;
	}
	public Double getEurosUnidad(){
		return eurosUnidad;
	}
	public void setDistribuidor (Distribuidor dis){
		distribuidor = dis;
	}
	public Distribuidor getDistribuidor(){
		return distribuidor;
	}

}