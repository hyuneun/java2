package pack15;
public class SellCheck {
	
	
	public void jondonCheck(int money) {
		Machine m = new Machine();
		Custom c = new Custom();
		if(m.money >= money-200){
			jagoCheck();
		}else{
			System.out.println("잔돈이 없습니다");
		}
	}
	
	public void jagoCheck() {
		Machine m = new Machine();
		Custom c = new Custom();
		if(m.coffee >= 2 && m.cream >= 2 && m.cup >= 1){
			c.coffeeChoice();
		}else{
			System.out.println("재고가 부족합니다");
		}
	}
	
	public void insik(int money) {
	
	}
	
}
