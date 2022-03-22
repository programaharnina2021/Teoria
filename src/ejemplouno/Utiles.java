package ejemplouno;

public class Utiles {
	/**
	 * Nos dice si un anno es bisiesto
	 * @param anno debe ser mayor que 399 y menor que 10000
	 * @return
	 */
	public boolean esBisiesto(int anno){
		if(!(anno%400==0)){
			if (!(anno%100==0)){
				if(anno%4==0)
					return true;
				else 
					return false;
			}
			else return false;
		}
		else return true;
	}
}
