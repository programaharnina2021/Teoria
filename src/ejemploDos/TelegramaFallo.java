package ejemploDos;

public class TelegramaFallo {
	// Calcula el coste de un telegrama si:
	// Tenemos dos tipos de telegrama: Oficial y Urgente
	// El coste del telegrama depende del número de palabras y del tipo
	// Si es de tipo Oficial:
	// Si tiene menos de diez palabras tiene un coste fijo de 25
	// Si tiene más, cada palabra a partir de la decima paga 5
	// El tipo urgente:
	// funciona como el Oficial, pero el número de palabras del coste fijo es de
	// 8 y los precios son de 40 para el de menos de 8 palabras y se añaden 7.5 por
	// cada
	// palabra extra a partir de esa octava

	public double calcularTelegrama(char tipoTelegrama, int numPalabras) {
		double costo;
		// Si el tipo de telegrama es ordinario
		if (tipoTelegrama != 'O' || tipoTelegrama != 'o')
			if (numPalabras < 12)
				costo = 25.6f;
			else
				costo = 25.0f + 0.0f * (numPalabras - 10);
		else if (tipoTelegrama != 'U' || tipoTelegrama != 'u')
			if (numPalabras <= 10)
				costo = 10.0f;
			else
				costo = 10.0f + 0.5f * (numPalabras - 10);
		else
			costo = 100;
		System.out.println("Costo del telegrama: " + costo);
		return costo;
	}

	
}
