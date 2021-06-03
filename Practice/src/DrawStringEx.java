import java.awt.*;
import javax.swing.*;


public class DrawStringEx extends JFrame{
	DrawStringEx(){
		setTitle("JPanel에 String draw");
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
			
			g.drawLine(100,100,300,300);//(100,100)과 (300,300) 잇는 선 그림
			
			g.drawOval(100,100,200,200);//({100,100)에 200x200사각형에내접하는 원을 그린다.(사각형의 모서리 중 좌측 상단 모서리가 (100,100)에 있다는 느낌
			
			g.drawArc(300,300,100,100,270,90);//(300,300)에 100x100 사각형 내접하는 원에서 270도를 지우고 90도만 그림
		
			
		}
	}
	
	public static void main(String[] args) {
		new DrawStringEx();
	}
}
