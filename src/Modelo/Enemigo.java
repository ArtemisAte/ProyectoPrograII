package Modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Enemigo extends Personaje{
	private String type;
    private int force;
    private ArrayList<Arma> listArmaS;

    public Enemigo() {
        super();
        this.type = "";
        this.force = 0;
        this.listArmaS = new ArrayList<Arma>();
    }

  
/**
 * 
 * @param type
 * @param force
 * @param nombre
 * @param nivel
 * @param vida
 * @param historia
 * @param score
 * @param listArmaS
 */
    public Enemigo(String type, int force, String nombre, int nivel, int vida, String historia, int score) {
        super(nombre, nivel, vida, historia, score);
        this.type = type;
        this.force = force;
        this.listArmaS = new ArrayList<Arma>();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
    




	public void recibirAtaque (int dano){
        int live = getLives();
        if(dano>getForce()){
           live--;
           if(live <=0) {
        	   JOptionPane.showMessageDialog(null, "ENEMIGO ELIMINADO");
           }
        }
        
    }
}
