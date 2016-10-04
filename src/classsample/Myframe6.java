package classsample;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Myframe6 extends Frame {

	public Myframe6() {
		super("내부무명클래스");
		setBounds(200, 200, 400, 400);
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
		
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				
			}
		});
		
		addMouseListener(new MouseAdapter() {
			
			@Override
		
			public void mouseClicked(MouseEvent e) {
				setBackground(Color.YELLOW);
			}
			
		});
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new Myframe6();
	}

}
