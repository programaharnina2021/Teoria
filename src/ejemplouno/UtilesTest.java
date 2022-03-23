package ejemplouno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilesTest {

	@Test
	void testEsBisiesto() {
		//creo un array para las pruebas que deben dar true y otroo para las
				//que deben dar false
				int[] bisis={400,2008,2012,2016};
				int[] nobisis={2007,2009,2010,2011,2013,2014,2015};		
				int[] invalid= {-1,4,399,10000};
				Utiles instancia=new Utiles();
				//con dos bucles for pruebo los diferentes elementos de cada
				//array
				for(int x=0;x<bisis.length;x++)
					assertTrue(instancia.esBisiesto(bisis[x]));
				for(int x=0;x<nobisis.length;x++)
					assertFalse(instancia.esBisiesto(nobisis[x]));	
				//No se diferenciar entre invalido y no bisiesto
				for(int x=0;x<invalid.length;x++)
					assertFalse(instancia.esBisiesto(nobisis[x]));		
			}
	@Test
	void testEsBisiestoContract() {
		//creo un array para las pruebas que deben dar true y otroo para las
		//que deben dar false
		int[] bisis={400,2008,2012,2016};
		int[] nobisis={2007,2009,2010,2011,2013,2014,2015};		
	
		Utiles instancia=new Utiles();
		//con dos bucles for pruebo los diferentes elementos de cada
		//array
		for(int x=0;x<bisis.length;x++)
			assertTrue(instancia.esBisiesto(bisis[x]));
		for(int x=0;x<nobisis.length;x++)
			assertFalse(instancia.esBisiesto(nobisis[x]));	
			
	}

}
