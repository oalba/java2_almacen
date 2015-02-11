import java.util.*;
class Leche extends Producto {

	//propiedades
	private String tipo;
	private Double eurosLitro;

	//métodos getter y setter
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
	static ArrayList<Leche> añaLeche(){
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		distribuidores = Distribuidor.leerDistri();
		ArrayList<Leche> aleche = new ArrayList<Leche>();
			String nombred;
			Leche leche = new Leche();
			//Tipo de leche
			leche.setTipo("vaca");
			//Procedencia
			leche.setProcedencia("Asturias");
			//precio
			leche.setEurosLitro(1.0);
			//codigo de barras
			leche.setCod_Barras(3001);
			//distribuidor
			nombred = "jon";
			for (int i = 0; i < distribuidores.size(); i++) {
				if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
					leche.setDistribuidor(distribuidores.get(i));
				}
			}
			aleche.add(leche);
			return aleche;

		}

}
