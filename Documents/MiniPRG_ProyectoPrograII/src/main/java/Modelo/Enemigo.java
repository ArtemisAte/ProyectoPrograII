/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Athenea
 */
public class Enemigo extends Personaje {
    private String type;
    private int force;

    public Enemigo() {
        super();
        this.type = "";
        this.force = 0;
    }

    public Enemigo(String type, String name, int level, int lives, String history, int force) {
        super(name, level, lives, history);
        this.type = type;
        this.force = force;
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

    public int recibirAtaque (int dano){
        int live = getLives();
        if(dano>getForce()){
           live--;
        }
        return dano-=getForce();
    }

 
 
    
    
    
}
