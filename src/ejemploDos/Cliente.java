package ejemploDos;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char tipoTelegrama = 0;
		int numPalabras;
		String sTipoTelegrama;
		System.out.println("Tipo de telegrama o/u? ");
		sTipoTelegrama = entrada.next();
		// Obten el primer caracter de la cadena
//		tipoTelegrama = Character.toUpperCase(sTipoTelegrama.charAt(0));
		// Lee el n�mero de palabras del telegrama
		System.out.println("N�mero de palabras? ");
		numPalabras = entrada.nextInt();
		new TelegramaFallo().calcularTelegrama(tipoTelegrama, numPalabras);
	}

}
