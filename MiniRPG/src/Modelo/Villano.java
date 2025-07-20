/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Modelo.Ataque;
import Modelo.Enemigo;
import Modelo.Personaje;
import java.util.ArrayList;

/**
 *
 * @author Athenea
 */
public class Villano extends Personaje implements Ataque{
    private int fuerzaExtra;
    private String type;
    private ArrayList<Enemigo> listEnemigo;
    
/**
 * 
 */
    public Villano() {
        super ();
        this.fuerzaExtra = 0;
    }
/**
 * 
 * @param fuerzaExtra
 * @param nombre
 * @param nivel
 * @param vida
 * @param historia
 * @param score 
 */
    public Villano(int fuerzaExtra, String nombre, int nivel, int vida, String historia, int score, String type) {
        super(nombre, nivel, vida, historia, score);
        this.fuerzaExtra = fuerzaExtra;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    
    public int getFuerzaExtra() {
        return fuerzaExtra;
    }

    public void setFuerzaExtra(int fuerzaExtra) {
        this.fuerzaExtra = fuerzaExtra;
    }
    /**
     * 
     * @param enemy 
     */
    public void agregarEnemigo (Enemigo enemy){
        this.listEnemigo.add(enemy);
    }
/**
 * 
 * @param enemy 
 */
    public void golgeFuerte (Enemigo enemy){
        enemy.recibirAtaque(fuerzaExtra);
    }
    
   
    @Override
    public void usarHabilidad(Enemigo enemy) {
        for (Enemigo e : listEnemigo){
            if(e.equals(enemy)){
                 golgeFuerte(e);
            }
        }
    }

    @Override
    public void vida(int dano) {
        
    }

    @Override
    public void nivel() {
        
        
    }
    
    
}
