/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Athenea
 */
public class Personaje {
    private String name;
    private int level;
    private int lives;
    private String history;

    public Personaje() {
        this.name = "";
        this.level = 0;
        this.lives = 0;
        this.history = "";
    }

    public Personaje(String nombre, int nivel, int vida, String historia) {
        this.name = nombre;
        this.level = nivel;
        this.lives = vida;
        this.history = historia;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        if(lives>=3){
        this.lives = lives;
        }else{
            JOptionPane.showMessageDialog(null, "GAME OVER");
        }
    }
    
            
           
}
