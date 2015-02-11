import java.util.*;
class Lechuga extends Producto {

	//propiedades
	private String tipoLechuga;
	private Double eurosUnidad;

	//métodos getter y setter
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

	static ArrayList<Lechuga> añaLechu(){

		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		distribuidores = Distribuidor.leerDistri();
		ArrayList<Lechuga> alechuga = new ArrayList<Lechuga>();
			String nombred;
			Lechuga lechuga = new Lechuga();
			//Tipo de lechuga
			lechuga.setTipoLechuga("Normal");
			//procedencia
			lechuga.setProcedencia("francia");
			//color
			lechuga.setColor("verde");
			//precio
			lechuga.setEurosUnidad(1.0);
			//codigo de barras
			lechuga.setCod_Barras(2001);
			//distribuidor
			nombred = "telmo";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					lechuga.setDistribuidor(distribuidores.get(i));
				}
			}
			alechuga.add(lechuga);
		return alechuga;
	}


}