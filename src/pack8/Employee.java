package pack8;

public abstract class Employee{
	private String irum;//이름
	private int nai;//나이
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int nai, String irum) {
		this.irum = irum;
		this.nai = nai;
	}
	
	public abstract double pay();
	
	public abstract void print();
	
	void display(){
		System.out.print("이름 : " + irum + " 나이 : " + nai);
	}
}
