package ùno;

public class TeoriaUno {
	public double areaCirculo(float radius) {
		return Math.PI * Math.pow(radius, 2);
	}

	// Solucion: defenderse poniendo clausula de guarda
	// Problema: uso un valor del dominio del retorno
	// para comunicar un fallo
	public double areaCirculoDefensive(float radius) {
		if (radius >= 0)
			return Math.PI * Math.pow(radius, 2);
		return -1;
	}

	public double areaCirculoContract(float radius) {
		// precondicion
		assert radius >= 0;
		return Math.PI * Math.pow(radius, 2);
	}

	// En este caso, no puedo usar un valor del dominio del retorno
	// para expresar que hay un fallo (a o/y b son negativos)
	public int restarNumerosPositivos(int a, int b) {
		if(a>=0&&b>=0)
			return a-b;
		//no se que retornar en caso de fallo
		return ?;
	}

	public boolean areYouEven(float value) {
		return value % 2 == 0;
	}

	public boolean areYouEvenDefensive(float value) {
		if (value % 1 == 0)
			return value % 2 == 0;
		return false;
	}
	public boolean areYouEvenContract(float value) {
		assert (value % 1 == 0):"valor no entero";
		return value % 2 == 0;
	}

	public static void main(String[] args) {
		TeoriaUno teoriauno = new TeoriaUno();
		System.out.println(teoriauno.areaCirculo(-5));
		// El cliente toma medidas porque el resultado es -1, un valor imposible
		// veamos las pruebas asociadas
		System.out.println(teoriauno.areaCirculoDefensive(-5));
		System.out.println(teoriauno.areaCirculoContract(-5));
		// el siguiente caso es peor porque no podemos contestar con
		// algun codigo de error o algo así
		System.err.println(teoriauno.areYouEven(2));
		// en este caso debería responder con algun codigo de error pero no puedo
		System.err.println(teoriauno.areYouEven(2.4f));
		// he controlado el error pero no me comunico bien
		System.err.println(teoriauno.areYouEvenDefensive(2.4f));
		System.err.println(teoriauno.areYouEvenContract(2.4f));
	}
}
