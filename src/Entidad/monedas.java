package Entidad;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class monedas {
	public BufferedImage mon;
	public String moned;
	public boolean recog = false;
	public int coorX, coorY;
	
	
	public monedas(int coorX, int coorY) {
		moned = "moneda";
		this.coorX = coorX;
		this.coorY = coorY;
		try {
			mon = ImageIO.read(getClass().getResource("/personajes/moneda.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	 public void draw(Graphics g) {
	        if (!recog) {
	            g.drawImage(mon, coorX,coorY, 25, 25, null);
	        }
	    }


}
