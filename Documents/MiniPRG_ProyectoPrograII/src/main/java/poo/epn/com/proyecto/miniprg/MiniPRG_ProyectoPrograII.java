/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.epn.com.proyecto.miniprg;

import javax.swing.JFrame;

/**
 *
 * @author Athenea
 */
public class MiniPRG_ProyectoPrograII extends JFrame{
    public static int WIDTH = 800, HEIGHT = 600;
    public static void main(String[] args) {
       
        
       MiniPRG_ProyectoPrograII ventanPrincipal= new MiniPRG_ProyectoPrograII();
       Juego panel = new Juego();
       ventanPrincipal.add(panel);
       panel.startGameThread();
        
                
    }
    /**
     * 
     */
    public MiniPRG_ProyectoPrograII(){
        setTitle("MiniPRG");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null); 
        setVisible(true);
    }
}
