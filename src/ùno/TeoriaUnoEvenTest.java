package ùno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TeoriaUnoEvenTest {

	@Test
	void testAreYouEven() {
		TeoriaUno teoriauno = new TeoriaUno();
		float value[]={0,2,1};
		boolean expected[]= {true,true,false};
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], teoriauno.areYouEvenContract(value[i]));
		}
	}

}
