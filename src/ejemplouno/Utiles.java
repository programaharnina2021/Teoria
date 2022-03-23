package ejemplouno;

public class Utiles {
	/**
	 * Nos dice si un anno es bisiesto
	 * 
	 * @param anno
	 *            debe ser mayor que 399 y menor que 10000
	 * @return
	 */
	public boolean esBisiesto(int anno) {
		if (!(anno % 400 == 0)) {
			if (!(anno % 100 == 0)) {
				if (anno % 4 == 0)
					return true;
				else
					return false;
			} else
				return false;
		} else
			return true;
	}

	public boolean esBisiestoContract(int anno) {
		assert (anno > 399) : "Año inferior";
		assert (anno < 10000) : "Año superior";
		if (!(anno % 400 == 0)) {
			if (!(anno % 100 == 0)) {
				if (anno % 4 == 0)
					return true;
				else
					return false;
			} else
				return false;
		} else
			return true;
	}

	public boolean esBisiestoClause(int anno) throws Exception {
		if (anno > 399)
			if (anno < 10000) {
				if (!(anno % 400 == 0)) {
					if (!(anno % 100 == 0)) {
						if (anno % 4 == 0)
							return true;
						else
							return false;
					} else
						return false;
				} else
					return true;
			} else {

				throw new Exception("anno muy grande");
			}
		else {
			throw new Exception("anno muy inferior");
		}
	}

}
