
public class Distribuidor {
	//propiedades
	private String nombre;
	private String CIF;
	private Direccion direccion;
	private Contacto personaContacto;

	//metodos getter y setter
	public void setNombre (String nom){
		nombre = nom;
	}
	public String getNombre(){
		return nombre;
	}
	public void setCIF (String cif){
		CIF = cif;
	}
	public String getCIF(){
		return CIF;
	}
	public void setDireccion (Direccion dir){
		direccion = dir;
	}
	public Direccion getDireccion(){
		return direccion;
	}
	public void setPersonaContacto (Contacto pc){
		personaContacto = pc;
	}
	public Contacto getPersonaContacto(){
		return personaContacto;
	}
}