package pack;

public class Production {
public String name;
private int price;
private int productionDay;
	public Production(){
		
	}
	public Production(int price, String name){
		this.price = price;
		this.name = name;
		
	}
	
	public void display(){
		
		System.out.println("상품명: " + name + " 가격: " + price + " 생산일: " + productionDay);
	}
	public void setProductionDay(int productionDay){
		this.productionDay = productionDay;
	}

}
