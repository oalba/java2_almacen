import java.util.*;
import java.io.*;
class Cliente {
	//propiedades

	private String nombre;
	private String apellidos;
	private String DNI;
	private Direccion direccion;
	private int num_socio;
	private Double dto;

	//métodos getter y setter
	void setNombre (String nom){
		nombre = nom;
	}
	final String getNombre(){
		return nombre;
	}
	void setApellidos (String ape){
		apellidos = ape;
	}
	final String getApellidos(){
		return apellidos;
	}
	void setDNI (String dn){
		DNI = dn;
	}
	final String getDNI(){
		return DNI;
	}
	void setDireccion (Direccion dir){
		direccion = dir;
	}
	final Direccion getDireccion(){
		return direccion;
	}
	void setNum_Socio (int ns){
		num_socio = ns;
	}
	final int getNum_Socio(){
		return num_socio;
	}
	void setDto (Double dt){
		dto = dt;
	}
	final Double getDto(){
		return dto;
	}

	static ArrayList<Cliente> leerClientes(){
		try {
			
			File archivo2 = new File("/home/zubiri/AriketakJava/java2_almacen/src/clientes.txt");
			FileReader fr2 = new FileReader(archivo2);
			BufferedReader br2 = new BufferedReader(fr2);
			String linea2 = br2.readLine();

			ArrayList<Cliente> clientes = new ArrayList<Cliente>();
			String [] partec = null;
			String [] partec1 = null;
			String [] partec2 = null;
			while ((linea2 != null) || (linea2 == "")) {
				partec = linea2.split(";");
				Cliente cliente = new Cliente();
				partec1 = partec[0].split(",");
				cliente.setNombre(partec1[0]);
				cliente.setApellidos(partec1[1]);
				cliente.setDNI(partec1[2]);
				cliente.setNum_Socio(Integer.parseInt(partec1[3]));
				cliente.setDto(Double.parseDouble(partec1[4]));

				partec2 = partec[1].split(",");
				Direccion direccion = new Direccion();
				direccion.setPoblacion(partec2[0]);
				direccion.setLocalidad(partec2[1]);
				direccion.setCalle(partec2[2]);
				direccion.setNumero(Integer.parseInt(partec2[3]));
				cliente.setDireccion(direccion);

				clientes.add(cliente);
				linea2 = br2.readLine();
			}
			return clientes;
		} catch (Exception ioe) {
			System.out.println("\n¡El archivo indicado no existe! \nError: " + ioe);
		}
		return null;
	}
}