package es.medac.tdd.example;

public class Calc {
	
	int a;
	int b;
	
	public Calc(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public Integer sumar() {
		return this.a + this.b;
	}
	
	public Integer restar() {
		return this.a - this.b;
	}

	public Integer mult() {
		return this.a * this.b;
	}

	public Integer div() {
		return this.a / this.b;
	}
	
}