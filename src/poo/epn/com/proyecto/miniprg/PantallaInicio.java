package poo.epn.com.proyecto.miniprg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * 
 */
public class PantallaInicio extends JPanel {
	private JLabel iniEti = new JLabel("--------------BIENVENIDO AL JUEGO-----------");
	private JLabel mensajePersonaje =  new JLabel("Elige un Personaje");
	private JButton mago;
	private JButton arquero;
	private JButton guerrero;
	public static int WIDTH = 800, HEIGHT = 600;
	

	public JButton getMago() {
		return mago;
	}


	public void setMago(JButton mago) {
		this.mago = mago;
	}


	public JButton getArquero() {
		return arquero;
	}


	public void setArquero(JButton arquero) {
		this.arquero = arquero;
	}


	public JButton getGuerrero() {
		return guerrero;
	}


	public void setGuerrero(JButton guerrero) {
		this.guerrero = guerrero;
	}


	public PantallaInicio() {
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		gbc.insets = new Insets(20, 0, 10, 0);
		gbc.anchor = GridBagConstraints.CENTER;
		add(iniEti, gbc);
		
		
		gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 20, 0);
		mensajePersonaje.setForeground(Color.GREEN);
		mensajePersonaje.setFont(new Font("Arial", Font.BOLD, 24));
		add(mensajePersonaje, gbc);
		
		
		//botones
		 // Botón Mago (izquierda)
        gbc.gridwidth = 1;
        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.insets = new Insets(0, 10, 0, 10);
        ImageIcon iconMago = new ImageIcon(new ImageIcon(getClass().getResource("/personajes/magoPin.png")).getImage()
				.getScaledInstance(80, 80, Image.SCALE_SMOOTH));
		iniEti.setForeground(Color.GREEN);
		iniEti.setFont(new Font("Arial", Font.BOLD, 24));
        mago = new JButton("MAGO",iconMago);
        mago.setBackground(Color.GRAY);
        add(mago, gbc);

        // Botón Arquero (centro)
        gbc.gridx = 1;
        ImageIcon iconArquero = new ImageIcon(new ImageIcon(getClass().getResource("/personajes/arquerpPin.png")).getImage()
				.getScaledInstance(80, 80, Image.SCALE_SMOOTH));
		iniEti.setForeground(Color.GREEN);
		iniEti.setFont(new Font("Arial", Font.BOLD, 24));
        arquero = new JButton("ARQUERO",iconArquero);
        arquero.setBackground(Color.WHITE);
        add(arquero, gbc);

        // Botón Guerrero (derecha)
        gbc.gridx = 2;
        ImageIcon iconGuerrero = new ImageIcon(new ImageIcon(getClass().getResource("/personajes/guerreroPin.png")).getImage()
				.getScaledInstance(80, 80, Image.SCALE_SMOOTH));
		iniEti.setForeground(Color.GREEN);
		iniEti.setFont(new Font("Arial", Font.BOLD, 24));
        guerrero = new JButton("GUERRERO", iconGuerrero);
		guerrero.setBackground(Color.BLUE);
        add(guerrero, gbc);
		
	}
	
	
	
	
	
	
}
