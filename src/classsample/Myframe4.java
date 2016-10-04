package classsample;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Myframe4  extends WindowAdapter{//implements WindowListener대신 사용 다 오버로딩안해도된다
		private Frame frame;//											
		public Myframe4() {
			frame = new Frame("dd");
			frame.setBounds(200, 120, 500, 400);
			frame.setVisible(true);
			
			frame.addWindowListener(this);
		}
	
		
		
		
		@Override
		public void windowClosing(WindowEvent e) {
		System.exit(0);
		}
		
		
		public static void main(String[] args) {
		new Myframe4();		
	}
}
