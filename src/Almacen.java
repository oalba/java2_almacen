import java.util.*;
import java.io.*;

public class Almacen {
	public static void main(String[] args) throws IOException {
		ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();
		try {
			File archivo = new File("/home/zubiri/AriketakJava/java2_almacen/src/distribuidores.txt");
			FileReader fr = new FileReader(archivo);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();

			String [] parte = null;
			String [] parte1 = null;
			String [] parte2 = null;
			String [] parte3 = null;
			while (linea != null) {
				parte = linea.split(";");
				Distribuidor distribuidor = new Distribuidor();
				System.out.println(linea);
				parte1 = parte[0].split(",");
				distribuidor.setNombre(parte[0]);
				distribuidor.setCif(parte[1]);

				parte2 = parte[1].split(",");
				Direccion direccion = new Direccion();
				direccion.setPoblacion(parte1[0]);
				direccion.setLocalidad(parte1[1]);
				direccion.setCalle(parte1[2]);
				direccion.setNumero(Integer.parseInt(parte1[3]));
				distribuidor.setDireccion(direccion);

				parte3 = parte[2].split(",");
				Contacto contacto = new Contacto();
				contacto.setNombre(parte2[0]);
				contacto.setApellido(parte2[1]);
				contacto.setEmail(parte2[2]);
				contacto.setTelefono(Integer.parseInt(parte2[3]));
				distribuidor.setPersonaContacto(contacto);



				//System.out.println(distribuidor.getNombre());
				//System.out.println(distribuidor.getCif());


				distribuidores.add(distribuidor);
				linea = br.readLine();
			}

			/*Iterator<Distribuidor> itrDistribuidor = distribuidores.iterator();
			while(itrDistribuidor.hasNext()){
				Distribuidor distri = itrDistribuidor.next();
				
				System.out.println(": " + distri.getNombre());
				System.out.println(": " + distri.getCif());
				System.out.println();
				
			}*/


			for (int i = 0; i < distribuidores.size(); i++) {
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
				
			}

		 } catch (IOException ioe) {
			System.out.println("Error: " + ioe);
		}

	}
	
}