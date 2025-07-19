/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.epn.com.proyecto.miniprg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Athenea
 */
public class KeyHandler implements KeyListener{
    public boolean upPreseed, downPreseed, leftPreseed, rightPreseed;

    @Override
    public void keyTyped(KeyEvent e) {
     
    }

    @Override
    public void keyPressed(KeyEvent e) {
       int code = e.getKeyCode();
       if (code == KeyEvent.VK_W){
           upPreseed=true;
       }
        if (code == KeyEvent.VK_S){
           downPreseed=true;
       }
         if (code == KeyEvent.VK_A){
           leftPreseed=true;
       }
          if (code == KeyEvent.VK_D){
           rightPreseed=true;
       }
    }

    @Override
    public void keyReleased(KeyEvent e) {
           int code = e.getKeyCode();
        if (code == KeyEvent.VK_W){
           upPreseed=false;
       }
        if (code == KeyEvent.VK_S){
           downPreseed=false;
       }
         if (code == KeyEvent.VK_A){
          leftPreseed=false;
       }
          if (code == KeyEvent.VK_D){
           rightPreseed=false;
       }
    }
    
}
