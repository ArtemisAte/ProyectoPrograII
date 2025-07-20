package poo.epn.com.proyecto.miniprg;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MiniPRG_ProyectoPrograDos extends JFrame {

	  public static int WIDTH = 800, HEIGHT = 600;
	    private Juego juego;
	    public static void main(String[] args) {
	       new MiniPRG_ProyectoPrograDos();
	                   
	    }
	    
	    public MiniPRG_ProyectoPrograDos(){
	        setTitle("MiniPRG");
	        setSize(WIDTH, HEIGHT);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setResizable(false);
	        setLocationRelativeTo(null); 
	        
	        
	       
	        juego = new Juego();
	        juego.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	        juego.setMaximumSize(new Dimension(WIDTH, HEIGHT));
	        juego.setMinimumSize(new Dimension(WIDTH, HEIGHT));
	       // juego.setBackground(Color.BLUE);
	        juego.requestFocusInWindow();
	        add(juego);
	        pack(); //ajusta el tamano segun el panel
	        setVisible(true);
	        juego.startGameThread();
	        
	    }
	}


