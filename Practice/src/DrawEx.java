import java.awt.*;
import javax.swing.*;

public class DrawEx extends JFrame{
	DrawEx(){
		setTitle("JPanel?? ???? draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(500,500);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.drawRect(10,10,30,30);
			g.drawRect(50,50,30,30);
			
			g.setColor(Color.MAGENTA);
			g.drawRect(100,100,30,30);
			
		}
	}
	
	public static void main(String[] args) {
		new DrawEx();
	}
}
