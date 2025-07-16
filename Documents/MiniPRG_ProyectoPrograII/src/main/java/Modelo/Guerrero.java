/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Athenea
 */
public class Guerrero extends Personaje implements Ataque{
    private int fuerzaExtra;
    private ArrayList<Enemigo> listEnemigo;
    
/**
 * 
 */
    public Guerrero() {
        super ();
        this.fuerzaExtra = 0;
    }
/**
 * 
 * @param fuerzaExtra
 * @param name
 * @param level
 * @param lives
 * @param history 
 */
    public Guerrero(int fuerzaExtra, String name, int level, int lives, String history) {
        super(name, level, lives, history);
        this.fuerzaExtra = fuerzaExtra;
        this.listEnemigo = new ArrayList<>();
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
    public void ataque(Enemigo enemy) {
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
