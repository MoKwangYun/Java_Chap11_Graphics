import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLineEX extends JFrame{
	GraphicsDrawLineEX(){
		setTitle("마우스로 여러 개 선 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		Vector<Point> vStart = new Vector<Point>();
		Vector<Point> vEnd = new Vector<Point>();
		
		public MyPanel() {
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					Point sp = e.getPoint();
					vStart.add(sp);
				}
				public void mouseReleased(MouseEvent e) {
					Point ep = e.getPoint();
					vEnd.add(ep);
					
					repaint();
				}
			});
		
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.CYAN);
			
			for(int i = 0; i<vStart.size();i++) {
				Point s = vStart.elementAt(i);
				Point e = vEnd.elementAt(i);
				
				g.drawLine((int)s.getX(),(int)s.getY(),(int)e.getX(),(int)e.getY());
			}
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawLineEX();
	}
}
