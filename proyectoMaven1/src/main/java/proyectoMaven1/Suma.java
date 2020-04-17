package proyectoMaven1;

public class Suma {
	private int num1;
	private int num2;
	
	public Suma(int n1, int n2) {
		this.num1 = n1;
		this.num2 = n2;
	}
	
	public int sumar() {
		return getNum1() + getNum2();
	}
	
	public int getNum1() {
		return this.num1;
	}
	
	public int getNum2() {
		return this.num2;
	}
	
	public void setNum1(int n1) {
		this.num1 = n1;
	}
	
	public void setNum2(int n2) {
		this.num2 = n2;
	}
}
