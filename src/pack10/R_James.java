package pack10;

public class R_James implements Resume{
	String irum, phone, skill;
	
	 public R_James() {
	
	}
	 
	 @Override
	public void setIrum(String irum) {
		if(irum.equals(null)){
			irum = "무명";
		}else{
			this.irum = irum;
		}
	}
	 
	 @Override
	public void setPhone(String Phone) {
		this.phone = Phone;
		
	}
	 
	 public void setskill(String skill) {
		this.skill = skill;
	}
	 
	 @Override
	public void print() {
		//Resume.SIZE = "b5"; 인터페이스의 필드는 final이기때문에 수정불가
		System.out.println("용지규격은" + Resume.SIZE);
		System.out.println(irum + " " + phone + " " + skill);
		playJava(true);
		Resume.changeData();
		
	}
	 
}
