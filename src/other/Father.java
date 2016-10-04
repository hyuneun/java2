package other;
import pack2.*;
public class Father extends GrandFa { //상속(확장)		부모(슈퍼)클래스, 자식(서브)클래스
	public Father() {
		System.out.println("아버지 생성자");
	}
	public static void main(String[] args) {
		Father fa = new Father();
		System.out.println(fa.gabo);
	}
}
