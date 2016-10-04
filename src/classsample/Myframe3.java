package classsample;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Myframe3 extends Frame implements WindowListener, MouseListener{

	public Myframe3() {
		//이벤트프로그램
		//1.visual object 작성
		setTitle("인터페이스 연습");
		setBounds(200, 150, 1000, 1200);
		setVisible(true);
		
		//2.Listener를 장착
		addWindowListener(this);
		addMouseListener(this);
		//3.해당 이벤트핸들러 메소드에 프로그래밍 
	}
	
	//마우스관련 메소드_____________________
	@Override
	public void mouseClicked(MouseEvent e) {
		//setBackground(new Color(255, 255, 0));
		//System.out.println((int)(Math.random() * 255));
		int r = (int)(Math.random() * 255);
		int g = (int)(Math.random() * 255);
		int b = (int)(Math.random() * 255);
		setBackground(new Color(r, g, b));
		setBackground(Color.black);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

	//__________________________________________
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		//System.out.println("종료");
		System.exit(0);
	}
	
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("윈고우 복원 됨");
		
	}
	
	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("아이콘화 됨");
		
	}
	
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	//________________________________________
	
	
	public static void main(String[] args) {
		new Myframe3();

	}

}
