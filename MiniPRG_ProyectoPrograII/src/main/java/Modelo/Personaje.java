/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Athenea
 */
public class Personaje {
    private String nombre;
    private int nivel;
    private int vida;
    private String historia;

    public Personaje() {
        this.nombre = "";
        this.nivel = 0;
        this.vida = 0;
        this.historia = "";
    }

    public Personaje(String nombre, int nivel, int vida, String historia) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.historia = historia;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
            
           
}
