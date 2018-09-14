package ar.edu.unlam.pb2;

public class Circulo {

private Double radio = 0.0;
	
	
	public Circulo(double pi, double radio ) {
		
		this.radio = radio;
		
		
	}

	public Double calcularArea() {
		
		Double area = java.lang.Math.PI * this.radio;
		
		return area;
	}
	
	public Double calcularPerimetro() {
		
		Double perimetro = 2*(java.lang.Math.PI) * (this.radio);
		
		return perimetro;
		
	}
	
}
