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

	//método calcular importe compra

}