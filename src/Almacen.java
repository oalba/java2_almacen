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
				//linea = br.readLine();
				//System.out.println("kk");
				parte = linea.split(";");
				Distribuidor distribuidor = new Distribuidor();
				//System.out.println(linea);
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



				//System.out.println(distribuidor.getNombre());
				//System.out.println(distribuidor.getCif());


				distribuidores.add(distribuidor);
				linea = br.readLine();
			}

			Iterator<Distribuidor> itrDistribuidor = distribuidores.iterator();
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
				
			}
			//System.out.println("aaa");

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