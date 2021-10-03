package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		for (int i: tabell) {
			System.out.println(i);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tabellTilStreng = "[";
		for (int i = 0; i < tabell.length; i++) {
			tabellTilStreng += tabell[i];
			if (i == tabell.length-1) {
				break;
			}
			tabellTilStreng += ",";
			}
		tabellTilStreng += "]";
		return tabellTilStreng;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean finnes = false;
		for (int i: tabell) {
			if (i == tall) {
				finnes = true;
			}
		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int posisjon = -1;
		for(int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				posisjon = i;
				break;
			}
		}
		return posisjon;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		int[] nyTabell = new int[tabell.length];
		int tempCount = 0;
		for (int i = tabell.length-1; i >= 0; i--) {
			nyTabell[tempCount] = tabell[i];
			tempCount++;
		}
		return nyTabell;
		
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		for (int i = 0; i < tabell.length-1; i++) {
			if (tabell[i] > tabell[i+1]) {
				sortert = false;
			}
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int nyLengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int[nyLengde];
		int counter = 0;
		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
			counter++;
		}
		for (int i = 0; i < tabell2.length; i++) {
			nyTabell[counter] = tabell2[i];
			counter++;
		}
		return nyTabell;
	}
}
