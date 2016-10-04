package pack14;

import java.net.StandardSocketOptions;

public class SaramTom {
	public Saram getSaram(){
		
		return new Saram() //사람을 리턴하면서 무명클래스를 부를수잇다
				{	//무명 클래스(이벤트처리할때사용)생성자x
					@Override
					public String getIr(){ //사람클래스의 메소드를 오버라이딩 할수있다
						return "홍길동";
					}
					
				
					
				};
		
	}
}
