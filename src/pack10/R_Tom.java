package pack10;

public class R_Tom implements Resume{
	String irum, phone, Juso;
	
	 public R_Tom() {
	
	}
	 
	 @Override
	public void setIrum(String Irum) {
		this.irum = Irum;
	}
	 
	 @Override
	public void setPhone(String Phone) {
		this.phone = Phone;
		
	}
	 
	 public void setJuso(String juso) {
		this.Juso = juso;
	}
	 
	 @Override
	public void print() {
		//Resume.SIZE = "b5"; 인터페이스의 필드는 final이기때문에 수정불가
		System.out.println("용지규격은" + Resume.SIZE);
		System.out.println(irum + " " + phone + " " + Juso);
		playJava(true);
		Resume.changeData();
		
	}
	 
	 void abc(){ //톰만가지고있는 일반메소드
		 	System.out.println("용지규격은" + Resume.SIZE);
			System.out.println(irum + " " + phone + " " + Juso);
			playJava(true);
			Resume.changeData();
	 }
}
