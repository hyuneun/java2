package pack9;

public class VolumeMain {

	public static void main(String[] args) {
			Volume volume;
			
			VolumeRadio radio = new VolumeRadio();

			VolumeTv tv = new VolumeTv();
			radio.volumeUp(5);
			radio.volumeDown(2);
			
			System.out.println();
			
			tv.volumeUp(7);
			tv.volumeDown(2);
			
			System.out.println();
			volume = radio;
			volume.volumeUp(10);
			volume.volumeDown(7);
			System.out.println();
			volume = tv;
			volume.volumeUp(10);
			volume.volumeDown(7);
			
			System.out.println();
			Volume[] v = new Volume[2];
			v[0] = radio;
			v[1] = tv;
			
			
		
					
					
					
					
					
					
				
				
				
			
	}

}
