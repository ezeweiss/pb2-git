package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestTriangulo {

	@Test
	public void sePuedenCrearTriangulos(){
        
        Triangulo unTriangulo =  new Triangulo(3.0, 2.0, 4.0);
        assertNotNull(unTriangulo); 
        
        Triangulo otroTriangulo = new Triangulo(4.0, 5.0, 3.0);
        assertNotNull(otroTriangulo);    
    }
    
    @Test
    public void elPerimetroDeUnTrianguloDebeSerLaSumaDeSusLados(){
        
        Triangulo unTriangulo2 = new Triangulo(4.0, 2.0, 5.0);
        Double esperado = 11.0;
        
        Double actual = unTriangulo2.calcularPerimetro();
        
        /*
          El tercer parametro es un delta. Quiere decir que solamente
          nos van a importar los primeros dos decimales para la comparacion
        */
        assertEquals(esperado, actual, 0.01); 
    }
    
    @Test
    public void elAreaDeUnTrianguloDebeSerLaBasePorSuAlturaSobreDos(){
    	 Triangulo unTriangulo3 = new Triangulo(9.0, 5.0);
         Double esperado = 22.5;
         
         Double actual = unTriangulo3.calcularArea();
         
         /*
           El tercer parametro es un delta. Quiere decir que solamente
           nos van a importar los primeros dos decimales para la comparacion
         */
         assertEquals(esperado, actual, 0.01); 
    }
}
