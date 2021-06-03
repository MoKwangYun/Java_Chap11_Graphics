import java.awt.*;
import javax.swing.*;


public class DrawStringEx extends JFrame{
	DrawStringEx(){
		setTitle("JPanel�� String draw");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			g.setFont(new Font("Jokerman", Font.ITALIC, 50));
			g.drawString("Hello",70,70);
			
			g.drawLine(100,100,300,300);//(100,100)�� (300,300) �մ� �� �׸�
			
			g.drawOval(100,100,200,200);//({100,100)�� 200x200�簢���������ϴ� ���� �׸���.(�簢���� �𼭸� �� ���� ��� �𼭸��� (100,100)�� �ִٴ� ����
			
			g.drawArc(300,300,100,100,270,90);//(300,300)�� 100x100 �簢�� �����ϴ� ������ 270���� ����� 90���� �׸�
		
			
		}
	}
	
	public static void main(String[] args) {
		new DrawStringEx();
	}
}
