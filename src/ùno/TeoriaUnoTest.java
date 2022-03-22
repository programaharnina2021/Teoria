package ùno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeoriaUnoTest {

	@Test
	void testAreaCirculo() {
		TeoriaUno instancia=new TeoriaUno();
		//pruebas de valores correctos
		int radius[]={0,1,2,-1};
		double expected[]={0,3.14,12.56,-1};
		double delta=.1;
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], instancia.areaCirculo(radius[i]),delta);
		}
	}

	@Test
	void testAreaCirculoDefensive() {
		TeoriaUno instancia=new TeoriaUno();
		//pruebas de valores correctos
		int radius[]={0,1,2,-1};
		double expected[]={0,3.14,12.56,-1};
		double delta=.1;
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], instancia.areaCirculoDefensive(radius[i]),delta);
		}
	}
	@Test
	void testAreaCirculoContract() {
		TeoriaUno instancia=new TeoriaUno();
		//pruebas de valores correctos
		int radius[]={0,1,2};
		double expected[]={0,3.14,12.56};
		double delta=.1;
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], instancia.areaCirculoContract(radius[i]),delta);
		}
	}

}
