package pack8;

import pack7.animalFind;

public class Regular extends Employee {

	private int salary;// 급여

	public Regular(String irum, int nai, int salary) {
		super(nai, irum);
		this.salary = salary;
	}

	public Regular(int salary) {

	}

	@Override
	public double pay() {
		return salary;
	}

	@Override
	public void print() {
		display();
		System.out.println("고정급 : " + salary);

	}

}
