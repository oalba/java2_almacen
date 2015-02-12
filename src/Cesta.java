import java.util.*;
class Cesta {

	//propiedades
	//Cliente
	//ArrayList de cada producto
	private ArrayList<Manzana> amanzana;
	private ArrayList<Lechuga> alechuga;
	private ArrayList<Leche> aleche;

	//métodos getter y setter
	void setAmanzana (ArrayList<Manzana> manza){
		amanzana = manza;
	}
	final ArrayList<Manzana> getAmanzana(){
		return amanzana;
	}
	void setAlechuga (ArrayList<Lechuga> lechu){
		alechuga = lechu;
	}
	final ArrayList<Lechuga> getAlechuga(){
		return alechuga;
	}
	void setAleche (ArrayList<Leche> leche){
		aleche = leche;
	}
	final ArrayList<Leche> getAleche(){
		return aleche;
	}
	/*static ArrayList<Cesta> crearCesta(){
		Scanner sc = new Scanner(System.in);
					int socio;
					int cant_prod;
					int cod_barras;
					Double ptotal = 0.0;
					Double mtotal = 0.0;
					Double lutotal = 0.0;
					Double letotal = 0.0;
					Double desc;
					Cesta cesta = new Cesta();
					System.out.println("\nIntroduce tu número de socio: ");
					socio = sc.nextInt();
					System.out.println("¿Cuantos productos quieres añadir?");
					cant_prod = sc.nextInt();
					for (int c = 0; c < cant_prod; c++) {
						System.out.println("Introduce el código de barras del producto: ");
						cod_barras = sc.nextInt();
						ArrayList<Cesta> acesta = new ArrayList<Cesta>();
						for (int m = 0; m < amanzana.size(); m++) {
							if(cod_barras == amanzana.get(m).getCod_Barras()){
								cesta.setAmanzana(amanzana);
								acesta.add(cesta);
								mtotal = mtotal + amanzana.get(m).getEurosKilo();
								//System.out.println(mtotal);
							}
							//System.out.println(ptotal);
						}
						for (int le = 0; le < alechuga.size(); le++) {
							if(cod_barras == alechuga.get(le).getCod_Barras()){
								cesta.setAlechuga(alechuga);
								acesta.add(cesta);
								lutotal = lutotal + alechuga.get(le).getEurosUnidad();
								//System.out.println(lutotal);
							}
							//System.out.println(ptotal);
						}
						for (int lee = 0; lee < aleche.size(); lee++) {
							if(cod_barras == aleche.get(lee).getCod_Barras()){
								cesta.setAleche(aleche);
								acesta.add(cesta);
								letotal = letotal + aleche.get(lee).getEurosLitro();
								//System.out.println(letotal);
							}
						}	
						ptotal = mtotal + lutotal + letotal;
						//System.out.println(ptotal);			
					}
					//System.out.println("Tu pedido contiene: ");

					System.out.println("El precio total sin el descuento es: " + ptotal);

					for (int so = 0; so < clientes.size(); so++){
						if(socio == clientes.get(so).getNum_Socio()){
							desc = clientes.get(so).getDto();
							ptotal = ptotal - ((ptotal*desc)/100);
							System.out.println("Tu descuento es del " + desc + "%");
						}
					}
					//ptotal = (ptotal-desc);

					System.out.println("El precio total con el descuento es: " + ptotal);
					return acesta;
	}*/

}