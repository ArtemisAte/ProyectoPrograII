package poo.epn.com.proyecto.miniprg;


import java.awt.Graphics;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import Entidad.*;
import javax.swing.JPanel;


public class Juego extends JPanel implements Runnable{
	 private boolean running=false; 
	 private Graphics g;
	 private KeyHandler keyT = new KeyHandler();

	//posicion principal del jugador
	   int posiX = 350;
	   int posiY = 450;
	   int posiSpeed = 2;  
	 //crear hilo
	    private Thread thread;
	    
	    Player player = new Player(this, keyT);
	    enemigo enemigo = new enemigo(this);
	    public ArrayList<monedas> monedas = new ArrayList<>();	    		
	    public ColocacionMonedas mon = new ColocacionMonedas(this);
	  
	  
	   
	    
	    public Juego (){
	   
	        setFocusable(true);
	      //  requestFocusInWindow();
	        addKeyListener(keyT);
	        generarMonedas();
	    }
	    /**
	     * 
	     */
	    private void generarMonedas() {
			for (int i=0; i<10; i++) {
				//ThreadLocalRandom colocara las monedas en lugares aleatorios de la pantalla
				int x = ThreadLocalRandom.current().nextInt(0, 700);
				int y = ThreadLocalRandom.current().nextInt(0, 500);
				monedas.add(new monedas(x, y));
			}
			
		}
		/**
	     * 
	     */
	    public void startGameThread(){
	         thread = new Thread(this);
	         thread.start();
	         running = true;
	    }
	    
	
	    /**
	     * inicia el hilo
	     */
	    @Override
	    public void run() {
	        while (running) {                 
	            upDate();
	            repaint();
	        //    paintComponent();
	            try {
	                Thread.sleep(16); // ≈ 60 FPS
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    
	    
	    /**
	     * 
	     */
	    public void stopGameThread(){
	        try {
	            thread.join();
	            running = false;
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	    /**
	     * 
	     */
	    public void upDate(){
	//     if (keyT.upPreseed) posiY -= posiSpeed;
	//    if (keyT.downPreseed) posiY += posiSpeed;
	  // if (keyT.leftPreseed) posiX -= posiSpeed;
	//   if (keyT.rightPreseed) posiX += posiSpeed;
	    	player.update(this);
	    	enemigo.update(this);
	    	
	    }
	    
	  
	    
	    
	    /**
	     * 
	     */
	    public void paintComponent(Graphics g){
	        super.paintComponent(g);
	       // g.setColor(Color.red);
	       // g.fillRect(posiX, posiY, 100, 100);
	       // g.drawImage(imagenJugador, 100, 100, null);
	     
	       // g.setColor(Color.red);
	        //g.fillRect(posiX, posiY, 100, 100);
	        for (monedas m : monedas) {
	        	m.draw(g);
	        }
            player.draw(g);
	        enemigo.draw(g);
	    }
}
