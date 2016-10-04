package pack8;

public class Temporart extends Employee{
	private int ilsu;//일수
	private int ildang;//일당
	
	public Temporart(int ilsu, int ildang, int nai, String irum) {//생성자로 값을 받음
		super(nai, irum);
		this.ilsu = ilsu;
		this.ildang = ildang;
	}
	
	@Override
	public double pay() {
		return ilsu * ildang;
		
	}
	
	@Override
	public void print() {
		display();
		System.out.print(" 월급 : " + pay());
		
	}
}
