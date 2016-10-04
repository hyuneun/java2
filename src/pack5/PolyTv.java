package pack5;

public class PolyTv extends PolyProduct{
		
	@Override
	public void volumeControl() {
		System.out.println("tv사운드 변경후" + getValume());
		System.out.println("TV 제품에 맞게 메소드 작성");
	}
	
	public void tvshow(){
		System.out.println("tv만의 고유메소드");
	}
}
