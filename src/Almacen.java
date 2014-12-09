import java.util.*;
import java.io.*;

public class Almacen {
	public static void main(String[] args) throws IOException {
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		try {
			File archivo = new File("./distribuidores.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();

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

			ArrayList<Manzana> amanzana = new ArrayList<Manzana>();
			Scanner scm = new Scanner(System.in);
			String nombred;
			for (int m = 0; m < 2; m++) {
				Manzana manzana = new Manzana();
				System.out.println("Tipo manzana");
				manzana.setTipoManzana(scm.next());
				System.out.println();
				manzana.setProcedencia(scm.next());
				System.out.println();
				manzana.setColor(scm.next());
				System.out.println();
				manzana.setEurosKilo(scm.nextDouble());
				System.out.println();
				nombred = scm.next();
				for (int i = 0; i < distribuidores.size(); i++) {
					if (nombred.equalsIgnoreCase(distribuidores.get(i).getNombre())) {
						manzana.setDistribuidor(distribuidores.get(i));
					}
				}
				amanzana.add(manzana);
			}
			Iterator<Manzana> itrManzana = amanzana.iterator();
			while(itrManzana.hasNext()){
				Manzana manza = itrManzana.next();
				
				System.out.println(": " + manza.getTipoManzana());
				System.out.println("" + manza.getProcedencia());
				System.out.println("" + manza.getColor());
				System.out.println("" + manza.getEurosKilo());
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






















			/*Iterator<Distribuidor> itrDistribuidor = distribuidores.iterator();
			while(itrDistribuidor.hasNext()){
				Distribuidor distri = itrDistribuidor.next();
				
				System.out.println("********Distribuidor********");
				System.out.println("--Datos--");
				System.out.println("Nombre: " + distri.getNombre());
				System.out.println("CIF: " + distri.getCif());
				System.out.println("--Direccion--");
				System.out.println("Población: " + distri.getDireccion().getPoblacion());
				System.out.println("Localidad: " + distri.getDireccion().getLocalidad());
				System.out.println("Calle: " + distri.getDireccion().getCalle());
				System.out.println("Número: " + distri.getDireccion().getNumero());
				System.out.println("--Contacto--");
				System.out.println("Nombre: " + distri.getPersonaContacto().getNombre());
				System.out.println("Apellido: " + distri.getPersonaContacto().getApellido());
				System.out.println("E-mail: " + distri.getPersonaContacto().getEmail());
				System.out.println("Teléfono: " + distri.getPersonaContacto().getTelefono());
				System.out.println();
				
			}*/

			/*for (int i = 0; i < distribuidores.size(); i++) {
				System.out.println(distribuidores.get(i).getNombre());
				System.out.println(distribuidores.get(i).getCif());

				System.out.println(distribuidores.get(i).getDireccion().getPoblacion());
            	System.out.println(distribuidores.get(i).getDireccion().getLocalidad());
            	System.out.println(distribuidores.get(i).getDireccion().getCalle());
            	System.out.println(distribuidores.get(i).getDireccion().getNumero());
  
            	System.out.println(distribuidores.get(i).getPersonaContacto().getNombre());
            	System.out.println(distribuidores.get(i).getPersonaContacto().getApellido());
            	System.out.println(distribuidores.get(i).getPersonaContacto().getEmail());
            	System.out.println(distribuidores.get(i).getPersonaContacto().getTelefono());
				
			}*/

		 } catch (IOException ioe) {
			System.out.println("Error: " + ioe);
		}

	}
	
}