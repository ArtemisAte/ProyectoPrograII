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
