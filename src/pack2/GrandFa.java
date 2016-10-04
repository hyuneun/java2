package pack2;

public class GrandFa {
	private int nai = 80;
	public String gabo = "상감청자";
	protected final String gahun = "자바를 공부하라"; //final은 대문자(수정불가) 클래스에 final을주면
	String imsi = "보이나요";                         //최종클래스가됨 상속이 불가능하다.
	
	// protect - 자식이 있을때만 사용하는 제한자
	// 같은패키지에서만(frendly) 쓸수있지만 자식은 프로젝트내에서(public) 쓸수있다.
	public GrandFa() {
		System.out.println("할아버지 생성자");
	}
	public GrandFa(int nai){
		this();//생성자가 생성자를 호출할수있다(가장먼저적을것!(약속))
		this.nai = nai;
	}
	
	public String say(){
		return "할아버지 말씀 : 졸지마!";
	}
	
	public void eat(){
		System.out.println("밥은 맛있게?");
	}
	
	public int getnai(){
		return nai;
	}
	
	
	
}
