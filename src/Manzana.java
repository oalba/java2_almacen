import java.util.*;

class Manzana extends Producto {
	//propiedades
	private String tipoManzana;
	private Double eurosKilo;

	//métodos getter y setter
	void setTipoManzana (String tm){
		tipoManzana = tm;
	}
	final String getTipoManzana(){
		return tipoManzana;
	}
	void setEurosKilo (Double ek){
		eurosKilo = ek;
	}
	final Double getEurosKilo(){
		return eurosKilo;
	}

	static ArrayList<Manzana> añaManza() {

		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		distribuidores = Distribuidor.leerDistri();
		ArrayList<Manzana> amanzana = new ArrayList<Manzana>();
			String nombred;
			Manzana manzana = new Manzana();
			//tipo de manzana
			manzana.setTipoManzana("Golden");
			//procedencia
			manzana.setProcedencia("EEUU");
			//color
			manzana.setColor("Verde");
			//precio
			manzana.setEurosKilo(3.0);
			//codigo de barras
			manzana.setCod_Barras(1001);
			//distribuidor
			nombred = "odei";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					manzana.setDistribuidor(distribuidores.get(i));
				}
			}
			amanzana.add(manzana);
			//System.out.println(manzana);

			Manzana manzana2 = new Manzana();
			//tipo de manzana
			manzana2.setTipoManzana("Red");
			//procedencia
			manzana2.setProcedencia("España");
			//color
			manzana2.setColor("Rojo");
			//precio
			manzana2.setEurosKilo(2.0);
			//codigo de barras
			manzana2.setCod_Barras(1002);
			//distribuidor
			nombred = "odei";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					manzana2.setDistribuidor(distribuidores.get(i));
				}
			}
			amanzana.add(manzana2);
			//System.out.println(manzana);
			return amanzana;
	}

}