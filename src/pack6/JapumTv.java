package pack6;

public class JapumTv extends Japum {
	
	public JapumTv() {
		System.out.println("tv 생성자");
	}
	
	@Override//오버라이딩 하지않으면 에러(필수) (빈삼각형)
	public void volumeControl() {
		System.out.println("tv 소리조절");
	}
	
	@Override//선택
	public void volumeshow() {
		volume = 10;
		System.out.println("티비 소리크기 : " + volume);
	}
	
	
	
	
	
	
	
	
	
	
}
