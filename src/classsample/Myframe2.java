package classsample;

import java.awt.Frame;

public class Myframe2 extends Frame {

	public Myframe2() {
		super("상속사용");
		display();
	}
	void display(){
		//setSize(300, 200);
		//setLocation(200, 150);
		setBounds(200, 150, 300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		//Myframe2 frame2 = new Myframe2();
		//frame2.display();
		new Myframe2();
	}

}
