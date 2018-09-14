package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCirculo {

	@Test
	public void testQuePermiteCrearCirculos() {
		
		Circulo miCirculo = new Circulo (java.lang.Math.PI, 4);
		assertNotNull(miCirculo);
		
		Circulo otroCirculo = new Circulo (java.lang.Math.PI, 19);
		assertNotNull(otroCirculo);
		
		
	}
	
	@Test 
	public void testQueMuestraElAreaDelCirculo(){
		
		Circulo miCirculo = new Circulo (java.lang.Math.PI, 3);
		/*Double valorEsperado = 9.42477796076938;*/
		Double valorEsperado = java.lang.Math.PI * 3;
		
		Double actual = miCirculo.calcularArea();
		assertEquals(valorEsperado, actual);
		
		
	}
	
	@Test
	public void testQueMuestraElPerimetroDelCirculo(){
		
		Circulo miCirculo = new Circulo (java.lang.Math.PI, 5);
		Double valorEsperado = 31.41592653589793;

		Double actual = miCirculo.calcularPerimetro();
		assertEquals(valorEsperado, actual);
		
	}

}
