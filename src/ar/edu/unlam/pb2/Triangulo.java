package ar.edu.unlam.pb2;

public class Triangulo {
	private Double ladoUno = 0.0;
	private Double ladoDos = 0.0;
	private Double ladoTres = 0.0;
	private Double base = 0.0;
	private Double altura =0.0;

	public Triangulo(Double l1, Double l2, Double l3) {
		this.ladoUno = l1;
		this.ladoDos = l2;
		this.ladoTres = l3;
	}
	
	public Triangulo (Double base, Double altura){
		this.base = base;
		this.altura = altura;
	}

	public Double calcularPerimetro() {
		Double perimetro = this.ladoUno  + this.ladoDos + this.ladoTres;
		return perimetro;
	}
	
	public Double calcularArea(){
		Double area = (this.base * this.altura) / 2;
		return area;
	}
}
