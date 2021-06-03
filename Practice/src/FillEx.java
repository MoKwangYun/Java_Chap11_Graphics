import java.awt.*;
import javax.swing.*;

public class FillEx extends JFrame{
	FillEx(){
		setTitle("���� �� ä���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(500,500);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			g.setColor(Color.BLUE);
			g.fillRect(10,10,50,50);
			
			g.setColor(Color.RED);
			g.fillOval(100,100,200,200);//({100,100)�� 200x200�簢���������ϴ� ���� �׸���.(�簢���� �𼭸� �� ���� ��� �𼭸��� (100,100)�� �ִٴ� ����
			
			g.setColor(Color.GREEN);
			g.fillArc(300,300,100,100,90,270);//(300,300)�� 100x100 �簢�� �����ϴ� ������ 270���� ����� 90���� �׸�
			
			g.setColor(Color.GRAY);
			int []x = {30,10,30,60,70};
			int []y= {300,350,400,390,330};
			g.fillPolygon(x,y,5);
		}
	}
	
	public static void main(String[] args) {
		new FillEx();
	}
}