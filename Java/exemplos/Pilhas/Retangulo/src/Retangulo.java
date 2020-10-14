public class Retangulo {

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Retangulo() {
		this.base = 0.0;
		this.altura = 0.0;
	}
	
	public double getBase() {
		return this.base;
	}
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Retangulo clone() {
		
		Retangulo copia;
		copia = new Retangulo();
		copia.base = this.base;
		copia.altura = this.altura;
		
		return copia;
	}
	
	public void imprimir() {
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
	}
	
	public double getArea() {
		return base*altura;
	}
	
	public double getPerimetro() {
		return (altura*2 + base*2);
	}
	
}
