package poo.epn.com.proyecto.miniprg;
import Entidad.*;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import Entidad.Player;

public class MiniPRG_ProyectoPrograDos extends JFrame {

	  public static int WIDTH = 800, HEIGHT = 600;
	    private Juego juego;
	    public static String persSelec = " ";
	 //   private Player pl = new Player();
	    public static void main(String[] args) {
	       new MiniPRG_ProyectoPrograDos();
	                   
	    }
	    
	    public MiniPRG_ProyectoPrograDos(){
	        setTitle("MiniPRG");
	        setSize(WIDTH, HEIGHT);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setResizable(false);
	        setLocationRelativeTo(null); 
	       PantallaInicio ini= new PantallaInicio();
	        ini.setPreferredSize(new Dimension(WIDTH, HEIGHT));
	        ini.setMaximumSize(new Dimension(WIDTH, HEIGHT));
	        ini.setMinimumSize(new Dimension(WIDTH, HEIGHT));
	        ini.setBackground(Color.getHSBColor(267f/360f, 0.97f, 0.37f));
	        requestFocusInWindow();
	        add(ini);
	        pack(); //ajusta el tamano segun el panel
	        setVisible(true);
	        
	       
	        ini.getMago().addActionListener(e ->{persSelec = "MAGO";
	        iniciarJuego();});
	        ini.getArquero().addActionListener(e -> {persSelec = "ARQUERO";
	        iniciarJuego();});
	        ini.getGuerrero().addActionListener(e -> {persSelec = "GUERRERO";
	        iniciarJuego();});
	
	    
	        
	    }
	    private void iniciarJuego() {
	    	 getContentPane().removeAll(); // elimina el panel anterior
		        juego = new Juego();
		        juego.setPreferredSize(new Dimension(WIDTH, HEIGHT));
		        juego.setMaximumSize(new Dimension(WIDTH, HEIGHT));
		        juego.setMinimumSize(new Dimension(WIDTH, HEIGHT));
		        juego.setBackground(Color.getHSBColor(138f/360f, 0.97f, 0.48f));
		       

		        add(juego);
		        revalidate(); // actualiza el layout
		        repaint();    // repinta la ventana
		        juego.requestFocusInWindow();
		        pack();
		        setVisible(true);
		        juego.startGameThread();
	    }

	}





