import java.util.*;
class Producto{
	private String procedencia;
	private int cod_barras;
	private Distribuidor distribuidor;
	private String color;

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

	static Iterator<Manzana> impriManza() {
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
	}
	static Iterator<Lechuga> impriLechu() {
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
	}
	static Iterator<Leche> impriLeche() {
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
	}



}