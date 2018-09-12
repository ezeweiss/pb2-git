package ar.edu.unlam.pb2;

public class Rectangulo {
	private Double ladoUno = 0.0;
	private Double ladoDos = 0.0;

	public Rectangulo(double l1, double l2) {
		this.ladoUno = l1;
		this.ladoDos = l2;
	}

	public Double calcularPerimetro() {
		Double perimetro = (this.ladoUno *2) + (this.ladoDos * 2);
		return perimetro;
	}
	
	public Double calcularArea(){
		Double area = (this.ladoUno * this.ladoDos);
		return area;
	}
}
