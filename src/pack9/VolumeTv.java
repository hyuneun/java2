package pack9;

public class VolumeTv implements Volume {
	private int volLevel;

	public VolumeTv() {
		volLevel = 0;
	}
	
	
	@Override
	public void volumeUp(int level) {
		if(level > 0){
			volLevel += level;
			System.out.println("TV 소리 down" + volLevel);
		}else{
			System.out.println("TV 소리 실패");
		}

	}

	@Override
	public void volumeDown(int level) {
		if(level > 0){
			volLevel -= level;
			System.out.println("TV 소리 Up" + volLevel);
		}else{
			System.out.println("TV 소리 실패");
		}

	}

}
