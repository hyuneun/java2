package pack9;

public class VolumeRadio implements Volume{
	private int volLevel;
	
	public VolumeRadio() {
		volLevel = 1;
	}
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("Up" + volLevel);
		
	}
	
	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("Down" + volLevel);
		
	}
}
