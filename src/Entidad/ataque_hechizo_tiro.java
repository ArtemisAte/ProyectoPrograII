package Entidad;
import Modelo. *;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.IOException;

import javax.imageio.ImageIO;

import poo.epn.com.proyecto.miniprg.Juego;
import poo.epn.com.proyecto.miniprg.KeyHandler;
import Modelo.*;
public class ataque_hechizo_tiro extends Entity {
	int x, y;
	int speed = 10;
	public static Juego gp;
	Heroe lisArmas = new Heroe();
	KeyHandler keyH = new KeyHandler();
	public ataque_hechizo_tiro(int x, int y, KeyHandler keyH) {
		super(gp);
		this.x = x;
		this.y = y;
		this.keyH = keyH;
		getataqueImage();
	}
	public void getataqueImage() {
		try {
			
			int imAle = (int)(Math.random()*3)+1;
			String ruta = "/armas/"+imAle +".png";
			arma = ImageIO.read(getClass().getResourceAsStream(ruta));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void update() {
		//y-=speed;
		if (keyH.spacePreseed) y -= speed;
	}
	
	public void draw (Graphics g) {
	//	g.setColor(Color.black);
		//g.fillRect(x, y, 10, 50);
		g.drawImage(arma, x, y, 100,100, null);
	}
	
	public Rectangle getBounds() {
	    return new Rectangle(x, y, 100, 100); 
	}

	
	/*
	 * referencias: https://smallbusiness.chron.com/make-random-images-appear-java-27933.html
	 */
	
}
