import java.awt.*;
import javax.swing.*;

public class ImageDrawEx extends JFrame{
	ImageDrawEx(){
	setTitle("도형 색 채우기");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setContentPane(new MyPanel());
	
	setSize(250,250);
	setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			ImageIcon icon = new ImageIcon("images/Lebron.jpg");
			Image img = icon.getImage();
			
			g.drawImage(img, 0,0,this.getWidth(),this.getHeight(),this);
		}
	}
	public static void main(String[] args) {
		new ImageDrawEx();
	}
}
