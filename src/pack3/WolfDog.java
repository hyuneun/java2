package pack3;

public class WolfDog extends Dog{
	private String where = "산";
	public String what = "d";
	public WolfDog(String name) {
		super(name);
	}
	
	@Override
	public void print() {
		System.out.println(getName() + "어디사니?" + where);
	}
	
	public void display(){
		print();
		this.print();
		super.print();
	}
}

