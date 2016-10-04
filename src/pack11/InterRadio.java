package pack11;

public class InterRadio implements Intervol, InterAdvanceVol{
	private int v = 0;				//	└───┬────┘
									//		└다중상속
	@Override
	public void volup(int v) {
		this.v += v;
		
	}
	
	@Override
	public void voldown(int v) {
		this.v -= v;		
	}
	
	@Override
	public void volOff() {
		System.out.println("끔");
		
	}
	@Override
	public void volResume() {
		System.out.println("끔");
		
	}
}
