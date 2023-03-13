import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

 public class BallMove extends JFrame{
	MyPanel mp =null;
	
	public static void main(String[]args) {
		BallMove ball = new BallMove();
		
	}
	
	public BallMove() {
		mp = new MyPanel();
		this.add(mp);
		this.setSize(400 ,300);
		this.addKeyListener(mp);//窗口JFrame 对象可以监听键盘事件，即可以监听到面板发生的键盘事件。
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	
}

//KeyListener是一个监听器，可以监听键盘事件。
class MyPanel extends JPanel implements KeyListener{
	int x =10;
	int y =10 ;
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, 20, 20);
		
	}
	
	//有字符输出时，该方法就会触发。
	public void keyTyped(KeyEvent e) {
		
	}
	
	//当某一个键按下去的时候，该方法会触发。
	public void keyPressed(KeyEvent e) {
		//根据按下不同键，来处理小球的的移动（上下左右）
		//在java中会给每个键分配一个值（int）类型
		if(e.getKeyCode()== KeyEvent.VK_DOWN) {
			y++;
		}else if(e.getKeyCode() == KeyEvent.VK_UP) {
			y--;
		}else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			x++;
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			x--;
		}
		
		this.repaint();
	}
	//当某一个建释放了，就会触发该方法。
	public void keyReleased(KeyEvent e) {
		
	}
	  
	
}