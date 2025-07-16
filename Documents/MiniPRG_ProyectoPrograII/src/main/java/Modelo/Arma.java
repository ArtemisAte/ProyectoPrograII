/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Athenea
 */
public class Arma {
    private String nameArm;
    private int danno;

    public Arma() {
        this.danno = 0;
        this.nameArm = "";
    }

    public Arma(String nameArm, int danno) {
        this.nameArm = nameArm;
        this.danno = danno;
    }

    public String getNameArm() {
        return nameArm;
    }

    public void setNameArm(String nameArm) {
        this.nameArm = nameArm;
    }

    public int getDanno() {
        return danno;
    }

    public void setDanno(int danno) {
        this.danno = danno;
    }
    
}
