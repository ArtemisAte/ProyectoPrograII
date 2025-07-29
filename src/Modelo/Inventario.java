package Modelo;

import java.util.ArrayList;

public class Inventario {
	 private ArrayList <Arma> listaArmas;
	    private Personaje proprietor;

	    public Inventario() {
	    }
	    
	    public Inventario(Personaje proprietor) {
	        this.proprietor = proprietor;
	        this.listaArmas = new ArrayList<>();
	    }

	    public Personaje getProprietor() {
	        return proprietor;
	    }

	    public void setProprietor(Personaje proprietor) {
	        this.proprietor = proprietor;
	    }
}
