import java.awt.*;
import javax.swing.*;

public class FillEx extends JFrame{
	FillEx(){
		setTitle("도형 색 채우기");
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
			g.fillOval(100,100,200,200);//({100,100)에 200x200사각형에내접하는 원을 그린다.(사각형의 모서리 중 좌측 상단 모서리가 (100,100)에 있다는 느낌
			
			g.setColor(Color.GREEN);
			g.fillArc(300,300,100,100,90,270);//(300,300)에 100x100 사각형 내접하는 원에서 270도를 지우고 90도만 그림
			
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
