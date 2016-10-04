package classsample;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.text.AttributeSet.FontAttribute;
import javax.swing.text.StyledEditorKit.FontSizeAction;
//import java.awt.event.*; 			위에 두개 대신 이렇게써도된다
public class Myframe5 extends Frame{
	private Wevent wevent = new Wevent();//내부클래스를 맴버화
	private Mevent mevent = new Mevent();
	private int x = 100, y = 100;
	private String[] ar1 = {"0","1","0","1","0"};
	public Myframe5() {
		super("내부클래스사용");
		setBounds(200, 200, 2000, 2000);
		setVisible(true);
		
		//wevent = new Wevent(); // 객체생성(인스턴스)
		addWindowListener(wevent);
		addMouseListener(mevent);
	}
	
	class Wevent extends WindowAdapter{//내부클래스
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(1);
			
		}
	}
	
	class Mevent extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			//setBackground(new Color(255, 0, 0));
			//int x = e.getX();
			//int y = e.getY();
			x = e.getX();
			y = e.getY();
			setTitle("x: " + x + " y: " + y);
			int r = (int)(Math.random() * 255);
			int g = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);
			setBackground(new Color(0, 0, 0));
			repaint(); //paint 를 호출하는 메소드
			
		}
	}
		
	
	
	@Override
	public void paint(Graphics g) { //frame 에 그림그리는 메소드, 최초에 1회 시스템에의해 호출
		/*
		int s = (int)(Math.random() * 5);
		int s1 = (int)(Math.random() * 5);
		int x = (int)(Math.random() * 400);
		int y = (int)(Math.random() * 400);
		int x1 = (int)(Math.random() * 400);
		int y1 = (int)(Math.random() * 400);
		int x2 = (int)(Math.random() * 400);
		int y2 = (int)(Math.random() * 400);
		int x3 = (int)(Math.random() * 400);
		int y3 = (int)(Math.random() * 400);
		int x4 = (int)(Math.random() * 400);
		int y4 = (int)(Math.random() * 400);
		int s2 = (int)(Math.random() * 5);
		int s3 = (int)(Math.random() * 5);
		int s4 = (int)(Math.random() * 5);
		g.drawString(ar1[s], x, y);
		g.drawString(ar1[s1], x1, y1);
		g.drawString(ar1[s2], x2, y2);
		g.drawString(ar1[s3], x3, y3);
		g.drawString(ar1[s4], x4, y4);
		*/
		
		int[] ar = new int[5000];
		for(int q : ar){
			int r = (int)(Math.random() * 255);
			int k = (int)(Math.random() * 255);
			int b = (int)(Math.random() * 255);
			int l = (int)(Math.random() * 30);
			
			int s = (int)(Math.random() * 5);
			int x = (int)(Math.random() * 2000);
			int y = (int)(Math.random() * 2000);
			g.drawString(ar1[s], x, y);
			setFont(getFont());
			g.setColor(new Color(10, 255, 10));
			g.setFont(new Font("고딕", Font.BOLD, l));
		}
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	new Myframe5();
	}
}
