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
public class Mago extends Personaje implements Ataque{
    private int poderMagico;
    private ArrayList<Enemigo> listEne = new ArrayList();

    public Mago() {
        super();
        this.poderMagico = 0;
    }

    public Mago(int poderMagico, String nombre, int nivel, int vida, String historia) {
        super(nombre, nivel, vida, historia);
        this.poderMagico = poderMagico;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }
    
    public void agregarEnemigo(Enemigo enemy){
        this.listEne.add(enemy);
    }
    /**
     * 
     * @param enemy 
     */
    public void lanzarHechizo (Enemigo enemy){
        enemy.recibirAtaque(poderMagico);
    }

    @Override
    public void ataque(Enemigo enemy) {
       for(Enemigo e : this.listEne ){
           if(e.equals(enemy)){
               lanzarHechizo(e);
           }
       }
    }

    @Override
    public void vida(int dano) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void nivel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
