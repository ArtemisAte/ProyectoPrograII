package Entidad;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import Modelo.Enemigo;
import Modelo.Heroe;
import poo.epn.com.proyecto.miniprg.*;
public class Player extends Entity{
	static Juego gp;
	KeyHandler keyT = new KeyHandler();
	private ArrayList<ataque_hechizo_tiro> elementos = new ArrayList<ataque_hechizo_tiro>();
	private Heroe he = new Heroe();
	private int tam = 100;
	private PantallaInicio perso= new PantallaInicio();

	/**
	 * 
	 */
	public Player() {
		super(gp);
		
	}
	
	/**
	 * 
	 * @param gp
	 * @param keyT
	 */
	public Player(Juego gp, KeyHandler keyT) {
		super(gp);
		this.gp = gp;
		this.keyT = keyT;
		PosicionPorDefecto();
		getPlayerImage();
		
	}
	
	


	/**
	 * 
	 */
	public void PosicionPorDefecto() {
	this.x = 350;
	this.y = 450;
	this.speed = 3;
		
	}
	/**
	 * 
	 */
	public void getPlayerImage() {

		try {
			String selec = MiniPRG_ProyectoPrograDos.persSelec;
			if(selec.equals("ARQUERO")) {
			arma = ImageIO.read(getClass().getResourceAsStream("/personajes/arquerpPin.png"));
			}
			else if(selec.equals("GUERRERO")) {
			arma = ImageIO.read(getClass().getResourceAsStream("/personajes/guerreroPin.png"));
			}
			else if(selec.equals("MAGO")) {
				arma = ImageIO.read(getClass().getResourceAsStream("/personajes/magoPin.png"));
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param width
	 * @param height
	 */
	public void colisiconPersonaje(int width, int height) {
		
		  if (x < 0) x = 0;
		  if (x + tam > width) x = width - tam;
		  if (y < 0) y = 0;
		  if (y + tam> height) y = height - tam;

		  
	}
/**
 * 	
 */
	public void update(JPanel panel) {
		if(keyT.upPreseed) y-=speed;
		if(keyT.downPreseed) y += speed;
		if (keyT.leftPreseed) x -= speed;
	    if (keyT.rightPreseed) x += speed;
	    if (keyT.spacePreseed) {
            lanzarProyectil();
        }
	    colisiconPersonaje(panel.getWidth(), panel.getHeight());

        // Actualizar posición de proyectiles
        for (ataque_hechizo_tiro p : elementos) {
            p.update();
        }
        
       
		
	}
	
	 
	 /**
	  * 
	  */
	 public void lanzarProyectil() {
	        if (elementos.size() < 5) { // Limitar cantidad en pantalla
	            elementos.add(new ataque_hechizo_tiro(x + 40, y, keyT));
	        }
	    }
	 
	 /**
	  * 
	  * @param g
	  */
	public void draw(Graphics g) {
		
	//	g.setColor(Color.red);
      //  g.fillRect(x, y, 100, 100);
        g.drawImage(arma, x, y, 100,100, null);
        for (ataque_hechizo_tiro p : elementos) {
            p.draw(g); // ¡Dibuja los proyectiles!
        }
	}
}
