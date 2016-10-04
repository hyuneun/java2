package classsample;

import java.awt.Frame;

public class Myframe1 {
	Frame frame; // 창을띄우는 클래스
	
	public Myframe1() {
		frame = new Frame("포함관계");
		display();
	}
	
	
	
	public void display(){
		frame.setSize(500, 300);
		frame.setLocation(200, 150);
		frame.setVisible(true);
		
	}
	public static void main(String[] args) {
		//Myframe1 frame1 = new Myframe1();
		//frame1.display();
		new Myframe1();
		
	}

}
