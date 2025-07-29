package Entidad;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import poo.epn.com.proyecto.miniprg.Juego;

public class Entity {
	Juego gp;
	public int x, y;
	public int speed;
	public BufferedImage arma;
	public String dic;
	public Rectangle areaSolid = new Rectangle(0, 0, 100, 100);
	public Entity (Juego gp) {
		this.gp=gp;
	}
	
	
}
