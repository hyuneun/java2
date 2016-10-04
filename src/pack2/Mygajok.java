package pack2;

public class Mygajok {

	public static void main(String[] args) {
		GrandFa gr = new GrandFa();
		System.out.println("가보 : " + gr.gabo);
		System.out.println("가훈 : " + gr.gahun);
		System.out.println("말씀 : " + gr.say());
		gr.eat();
		System.out.println("할아버지나이" + gr.getnai());
		System.out.println();
		
		GrandFa gr1 = new GrandFa(88);
		System.out.println(gr1.getnai());
		
		
		System.out.println("--------------------");
		Father fa = new Father();//아들생성자를 부를때 부모생성자를 먼저부른다
		System.out.println("가보 : " + fa.gabo);
		System.out.println("가훈 : " + fa.gahun);
		System.out.println("말씀 : " + fa.say());
		gr.eat();
		System.out.println("아버지나이" + fa.getnai());
		System.out.println("집" + fa.getHouse() + "채");
		fa.showData();
		
		System.out.println("--------------------------");
		
		Me me = new Me();
		System.out.println("가보 : " + me.gabo);
		System.out.println("가훈 : " + me.gahun);
		System.out.println("말씀 : " + me.say());
		me.eat();
		System.out.println("아버지나이" + me.getnai());
		System.out.println("집" + me.getHouse() + "채");
		System.out.println(me.Biking());
		System.out.println();
		fa.showData();
		
		
	}

}
