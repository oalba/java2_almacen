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

//{
		/*static Iterator<Leche> impriLeche() {
		ArrayList<Leche> aleche = new ArrayList<Leche>();
		aleche = Leche.añaLeche();
		Iterator<Leche> itrLeche = aleche.iterator();
			while(itrLeche.hasNext()){
				Leche leche = itrLeche.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Tipo de leche: " + leche.getTipo());
				System.out.println("Procedencia: " + leche.getProcedencia());
				System.out.println("Precio (€ por L): " + leche.getEurosLitro());
				System.out.println("Código de barras: " + leche.getCod_Barras());
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + leche.getDistribuidor().getNombre());
				System.out.println("CIF: " + leche.getDistribuidor().getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + leche.getDistribuidor().getDireccion().getPoblacion());
				System.out.println("Localidad: " + leche.getDistribuidor().getDireccion().getLocalidad());
				System.out.println("Calle: " + leche.getDistribuidor().getDireccion().getCalle());
				System.out.println("Número: " + leche.getDistribuidor().getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + leche.getDistribuidor().getPersonaContacto().getNombre());
				System.out.println("Apellido: " + leche.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println("E-mail: " + leche.getDistribuidor().getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + leche.getDistribuidor().getPersonaContacto().getTelefono());
				System.out.println();	
			}
			return itrLeche;
		}*/
//}

}
