package ejercicioUno;


public class AleatorioFallo {
/**
 * Genera un numero aleatorio entre min y max, ambos incluidos
 * Los numeros deben ser positivos y el max debe ser mayor que el min 
 * @param min el menor numero que puede salir
 * @param max el mayor numero que puede salir
 * @return el numero int generado
 */
public int generarAleatorio(int min, int max){
	return (int) (Math.random()*(max-min));
	
}
}
