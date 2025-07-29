package Entidad;
import Modelo.Enemigo;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import poo.epn.com.proyecto.miniprg.Juego;

public class enemigo extends Entity{
	public boolean movingRight = true;
	public int width = 800, height =600;
	private int dir=3;
	private int tam = 100;
	private Enemigo ene = new Enemigo();

	public enemigo(Juego gp) {
		super(gp);
		this.x = 100;
		this.y = 100;
		speed= 2;
		try {
		//	if(ene.getType().equals("Ogro")) {
			arma = ImageIO.read(getClass().getResourceAsStream("/personajes/ogro.png"));
		//	}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		areaSolid = new Rectangle(x,y,width,height);
	//	PosicionPorDefecto();
		//getEnemigoImage();
		
	}
	/**
	 * 
	 */
	public void moverEnemigoAleatorio() {
		if(dir==0) { y+=speed;}
		else if(dir == 1) { y-= speed;}
		else if(dir == 2) { x+= speed;}
		else if(dir == 3) {x-= speed;}
		else if(dir == 4) {y+= speed; x+=speed;} //diagonales
		else if(dir == 5) {y-= speed; x-=speed;}
		else if(dir == 6) {y+= speed; x-=speed;}
		else if(dir == 7) {y-= speed; x+=speed;}
	}
	
	/**
	 * 
	 * @param width
	 * @param height
	 */
	public void colisionEnemigo(int width, int height) {
		if(y<=0) {
			int c = (int) (Math.random()*3)+1; //genera un numero aleatorio entre 1 y 3
			dir = c;
			if(c==1) {
				dir=7;
			}else if(c==2) {
				dir=2;
			}else {
				dir=4;
			}
		}else if(x<=0) {
			int c = (int) (Math.random()*3)+1;
			dir = c == 1 ? 7 : c == 2 ? 2 : 4 ;

		}else if(y>= height - tam) {
			int c = (int) (Math.random()*3)+1;
			dir = c == 1 ? 5 : c ==2 ? 1 : 7; 
		}else if(x>= width - tam) {
			int c = (int) (Math.random()*3)+1;
			dir = c == 1 ? 6 : c ==2 ? 3 : 5; 
		}
	}
		
	
		
	
		public void draw(Graphics g) {
			
			//	g.setColor(Color.red);
		      //  g.fillRect(x, y, 100, 100);
		        g.drawImage(arma, x, y, 100,100, null);
		       
			}
		
		public Rectangle getBounds() {
		    return new Rectangle(x, y, 100, 100); // ancho y alto del enemigo
		}

		public void update(JPanel panel) {
	        //int panelWidth = panel.getWidth();
	        moverEnemigoAleatorio();
	        colisionEnemigo(panel.getWidth(), panel.getHeight());

	  
		}
}
/*
 * referecias: https://youtu.be/5EZw5DTIKjg?si=Zat2WF_uuYrKcMB-
 * */
