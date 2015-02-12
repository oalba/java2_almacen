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
	/*static Iterator<Lechuga> impriLechu() {
		ArrayList<Lechuga> alechuga = new ArrayList<Lechuga>();
		alechuga = Lechuga.añaLechu();
		Iterator<Lechuga> itrLechuga = alechuga.iterator();
			while(itrLechuga.hasNext()){
				Lechuga lechu = itrLechuga.next();
				System.out.println("#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#@#");
				System.out.println("Tipo de lechuga: " + lechu.getTipoLechuga());
				System.out.println("Procedencia: " + lechu.getProcedencia());
				System.out.println("Color: " + lechu.getColor());
				System.out.println("Precio (€ por unidad): " + lechu.getEurosUnidad());
				System.out.println("Código de barras: " + lechu.getCod_Barras());
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + lechu.getDistribuidor().getNombre());
				System.out.println("CIF: " + lechu.getDistribuidor().getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + lechu.getDistribuidor().getDireccion().getPoblacion());
				System.out.println("Localidad: " + lechu.getDistribuidor().getDireccion().getLocalidad());
				System.out.println("Calle: " + lechu.getDistribuidor().getDireccion().getCalle());
				System.out.println("Número: " + lechu.getDistribuidor().getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + lechu.getDistribuidor().getPersonaContacto().getNombre());
				System.out.println("Apellido: " + lechu.getDistribuidor().getPersonaContacto().getApellido());
				System.out.println("E-mail: " + lechu.getDistribuidor().getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + lechu.getDistribuidor().getPersonaContacto().getTelefono());
				System.out.println();
				
			}
			return itrLechuga;
	}*/


}