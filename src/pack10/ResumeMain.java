package pack10;

public class ResumeMain {

	public static void main(String[] args) {
	Resume resume = null;
	
	R_Tom r_Tom = new R_Tom();
	r_Tom.setIrum("탐");
	r_Tom.setPhone("1234-5678");
	r_Tom.setJuso("강남");
	r_Tom.print();
	r_Tom.playJava(false);
	Resume.changeData();//스테틱이라 클래스이름으로 부름
	r_Tom.abc();//톰고유메소드
	System.out.println("__________");
	
	R_James r_jame = new R_James();
	r_jame.setIrum("제임스");
	r_jame.setPhone("456-546");
	r_jame.setskill("잠자기");
	r_jame.print();
	r_jame.playJava(true);
	
	System.out.println("이력서확인_______");
	Resume[] resBox = new Resume[2];
	resBox[0] = r_Tom;
	resBox[1] = r_jame;
	
	for(Resume r:resBox){
		r.print();
		System.out.println();
	}
	
	
	
	
	
	
	
	
	}
}
