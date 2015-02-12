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
	/*static Iterator<Manzana> impriManza() {
		ArrayList<Manzana> amanzana = new ArrayList<Manzana>();
		amanzana = Manzana.añaManza();
		Iterator<Manzana> itrManzana = amanzana.iterator();
			while(itrManzana.hasNext()){
				Manzana manza = itrManzana.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Tipo de manzana: " + manza.getTipoManzana());
				System.out.println("Procedencia: " + manza.getProcedencia());
				System.out.println("Color: " + manza.getColor());
				System.out.println("Precio (€ por Kg): " + manza.getEurosKilo());
				System.out.println("Código de barras: " + manza.getCod_Barras());
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + manza.getDistribuidor().getNombre());
				System.out.println("CIF: " + manza.getDistribuidor().getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + manza.getDistribuidor().getDireccion().getPoblacion());
				System.out.println("Localidad: " + manza.getDistribuidor().getDireccion().getLocalidad());
				System.out.println("Calle: " + manza.getDistribuidor().getDireccion().getCalle());
				System.out.println("Número: " + manza.getDistribuidor().getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + manza.getDistribuidor().getPersonaContacto().getNombre());
				System.out.println("Apellido: " + manza.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println("E-mail: " + manza.getDistribuidor().getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + manza.getDistribuidor().getPersonaContacto().getTelefono());
				System.out.println();
				
			}
			return itrManzana;
	}*/

}