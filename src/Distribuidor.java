import java.io.*;
import java.util.*;
class Distribuidor {
	//propiedades
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;

	//metodos getter y setter
	void setNombre (String nom){
		nombre = nom;
	}
	final String getNombre(){
		return nombre;
	}
	void setCif (String cf){
		cif = cf;
	}
	final String getCif(){
		return cif;
	}
	void setDireccion (Direccion dir){
		direccion = dir;
	}
	final Direccion getDireccion(){
		return direccion;
	}
	void setPersonaContacto (Contacto pc){
		personaContacto = pc;
	}
	final Contacto getPersonaContacto(){
		return personaContacto;
	}

	static ArrayList<Distribuidor> leerDistri(){
		try {
			
			File archivo = new File("/home/zubiri/AriketakJava/java2_almacen/src/distribuidores.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();

			ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
			String [] parte = null;
			String [] parte1 = null;
			String [] parte2 = null;
			String [] parte3 = null;
			while ((linea != null) || (linea == "")) {
				parte = linea.split(";");
				Distribuidor distribuidor = new Distribuidor();
				parte1 = parte[0].split(",");
				distribuidor.setNombre(parte1[0]);
				distribuidor.setCif(parte1[1]);

				parte2 = parte[1].split(",");
				Direccion direccion = new Direccion();
				direccion.setPoblacion(parte2[0]);
				direccion.setLocalidad(parte2[1]);
				direccion.setCalle(parte2[2]);
				direccion.setNumero(Integer.parseInt(parte2[3]));
				distribuidor.setDireccion(direccion);

				parte3 = parte[2].split(",");
				Contacto contacto = new Contacto();
				contacto.setNombre(parte3[0]);
				contacto.setApellido(parte3[1]);
				contacto.setEmail(parte3[2]);
				contacto.setTelefono(Integer.parseInt(parte3[3]));
				distribuidor.setPersonaContacto(contacto);

				distribuidores.add(distribuidor);
				linea = br.readLine();
			}
			return distribuidores;
		} catch (IOException ioe) {
			System.out.println("Error: " + ioe);
		}
		return null;
	}

}
