package pack2;

public class Father extends GrandFa { //상속(확장)		부모(슈퍼)클래스, 자식(서브)클래스
	private int nai = 55;  //은닉화(자식과부모가 같은 맴버를가질때 부모의 맴버는 가려진다)
	private int house = 1; //father 고유 맴버
	public String gabo = "물병";
	public Father() {
		super(); //부모생성자호출(생략가능)
		System.out.println("아버지 생성자");
	}

	
	@Override //정보제공목적으로 쓰인다
	public int getnai(){ //메소드 오버라이드(method Override)
						 // 부모와 완전히 같은 메소드가 자식에게있을때
		return nai;
	}
	
	public int getHouse(){
		return house;
	}
	@Override
	public String say(){
		return "아버지말씀 : 일해!";
	}
	public void showData(){
		System.out.println(gabo);
		System.out.println(this.gabo);//맴버필드와 지역필드가 겹쳐서 구분할때만 this사용
		System.out.println(super.gabo);
		System.out.println();
		System.out.println(getnai());
		System.out.println(this.getnai());
		System.out.println(super.getnai());
		System.out.println();
		System.out.println(this.say());
		System.out.println(super.say());
	}

}

