package poo.epn.com.proyecto.miniprg;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{
	 public boolean upPreseed, downPreseed, leftPreseed, rightPreseed, spacePreseed;

	    @Override
	    public void keyTyped(KeyEvent e) {
	     
	    }

	    @Override
	    public void keyPressed(KeyEvent e) {
	       int code = e.getKeyCode();
	   if (code == KeyEvent.VK_W||(code == KeyEvent.VK_UP)){
	           upPreseed=true;
	       }
	        if (code == KeyEvent.VK_S ||(code == KeyEvent.VK_DOWN)){
	           downPreseed=true;
	       }

	         if ((code == KeyEvent.VK_SPACE)){
	           spacePreseed=true;
	       }
	       
	         if ((code == KeyEvent.VK_A)||(code == KeyEvent.VK_LEFT)){
	           leftPreseed=true;
	       }
	          if (code == KeyEvent.VK_D || (code == KeyEvent.VK_RIGHT)){
	           rightPreseed=true;
	       }
	    }

	    @Override
	    public void keyReleased(KeyEvent e) {
	           int code = e.getKeyCode();
	 if (code == KeyEvent.VK_W||(code == KeyEvent.VK_UP)){
	           upPreseed=false;
	       }
	        if (code == KeyEvent.VK_S||(code == KeyEvent.VK_DOWN)){
	           downPreseed=false;
	       }
	         if (code == KeyEvent.VK_A||(code == KeyEvent.VK_LEFT)){
	          leftPreseed=false;
	       }
	          if (code == KeyEvent.VK_D||(code == KeyEvent.VK_RIGHT)){
	           rightPreseed=false;
	       }

		   if ((code == KeyEvent.VK_UP)){
		       spacePreseed=false;
		   }
	    }
}
