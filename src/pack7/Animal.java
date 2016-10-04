package pack7;

public abstract class Animal {
	abstract public String name();
	abstract public String eat();	
	abstract public String action();
	
	public void print(){
		System.out.println("동물 추상클래스의 일반메소드");
	}
}
