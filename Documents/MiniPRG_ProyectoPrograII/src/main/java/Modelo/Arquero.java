/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Athenea
 */
public class Arquero extends Personaje implements Ataque{
    private int availableArrows;
    private int precision;
    private ArrayList<Enemigo> listEne= new ArrayList();

    public Arquero() {
        super();
        this.availableArrows = 3;
    }

    public Arquero(int availableArrows, String name, int level, int lives, String history, int precision) {
        super(name, level, lives, history);
        this.availableArrows = availableArrows;
        this.precision = precision;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getAvailableArrows() {
        return availableArrows;
    }

    public void setAvailableArrows(int availableArrows) {
        this.availableArrows = availableArrows;
    }
    /**
     * 
     * @param enemy 
     */
    public void agregarEnemigos (Enemigo enemy){
        this.listEne.add(enemy);
    }
    /**
     * 
     * @param enemy 
     */
    public void disparoPreciso (Enemigo enemy){
        if(availableArrows>0){
            enemy.recibirAtaque(precision);
            availableArrows--;
        }else{
            JOptionPane.showMessageDialog(null, "Sin Flechas");
        }
    }

    @Override
    public void ataque(Enemigo enemy) {
        for( Enemigo e : this.listEne){
            if (enemy.equals(e)){
                disparoPreciso(enemy);
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
