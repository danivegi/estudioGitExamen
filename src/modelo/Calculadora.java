package modelo;

public class Calculadora {
	private int mr;
	
	public Calculadora() {
		mr = 0;
	}
	
	public int suma(int x, int y) {
		mr = x + y;
		return mr;
	}
	
	public int resta (int x, int y) {
		mr = x - y;
		return mr;
	}

}
