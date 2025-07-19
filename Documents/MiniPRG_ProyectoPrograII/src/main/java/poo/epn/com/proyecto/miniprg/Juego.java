/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.epn.com.proyecto.miniprg;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Athenea
 */
public class Juego extends JPanel implements Runnable{
    //Ajustes de pantalla
    static int originalTileSize = 16;
    static int scale = 3;
    static int tileSize = originalTileSize*scale; //
    static int maxScreenCol = 16;
    static int maxScreenRow = 12;
    static int screenWidth = tileSize*maxScreenCol; //760 pixels
    static int screenHeight = tileSize*maxScreenRow; //576 pixels
    
    KeyHandler keyH = new KeyHandler();
    Thread gameThread; //crea un hilo
    
    //posicion principal o por defecto del jugador
    int posX = 100;
    int posY = 100;
    int posSpeed = 4;
    
 
  /**
   * 
   */  
    public Juego(){
        this.setPreferredSize(new Dimension (screenWidth, screenHeight));
        this.setBackground(Color.red);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);
 
    }
   /**
    *  /**
     * inicia el hilo
     */
    public void startGameThread(){
        gameThread = new Thread(this);
        gameThread.start();
    }
    
   // public void stopGameThread(){
     //   try {
       //     gameThread.join();
        //} catch (InterruptedException e) {
          //  e.printStackTrace();
        //}
    //}
    /**
     * 
     */
    @Override
    public void run() {
        while (gameThread != null){
            upDate();
            
            repaint();
        }
       // stopGameThread();
    }
    
    public void upDate(){
        if ( keyH.upPreseed == true){
            posY -= posSpeed;
        }else if(keyH.downPreseed == true){
            posX += posSpeed;
        }else if( keyH.leftPreseed == true){
            posX-= posSpeed;
        }else if ( keyH.rightPreseed == true){
            posX+=posSpeed;
        }
    }
    
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.setColor(Color.BLUE);
        g2.fillRect(posX, posY, tileSize, tileSize);
        g2.dispose();
    }
    
    
    
   
}
