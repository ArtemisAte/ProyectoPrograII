package poo.epn.com.proyecto.miniprg;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Juego extends JPanel implements Runnable{
	 private boolean running=false; 
	   private Graphics g;
	   private KeyHandler keyT = new KeyHandler();
	   
	   //posicion principal del jugador
	   int posiX = 100;
	   int posiY = 100;
	   int posiSpeed = 4;
	  
	    //crear hilo
	    private Thread thread;
	    
	    
	    public Juego (){
	   
	        setFocusable(true);
	      //  requestFocusInWindow();
	        addKeyListener(keyT);
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
	       long now = 0;
	       long lastTime = System.nanoTime();
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

	    public void stopGameThread(){
	        try {
	            thread.join();
	            running = false;
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public void upDate(){
	      if (keyT.upPreseed) posiY -= posiSpeed;
	      if (keyT.downPreseed) posiY += posiSpeed;
	      if (keyT.leftPreseed) posiX -= posiSpeed;
	      if (keyT.rightPreseed) posiX += posiSpeed;
	    }
	    public void paintComponent(Graphics g){
	        super.paintComponent(g);
	        g.setColor(Color.red);
	        g.fillRect(posiX, posiY, 100, 100);
	        
	      //  g.clearRect(posiX, posiY, 100, 100);
	       
	    }
}
