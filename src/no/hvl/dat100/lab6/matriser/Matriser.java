package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] i : matrise) {
			for (int p : i) {
				System.out.print(p + " ");
			}
			System.out.println("");
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String matriseTilStreng = "";
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseTilStreng += matrise[i][j] + " ";
			}
			matriseTilStreng += "\n";
		}
		return matriseTilStreng;
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] metodeMatrise = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			metodeMatrise[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				metodeMatrise[i][j] = matrise[i][j] *tall;
			}
		}
		return  metodeMatrise;
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean erLik = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					erLik = false;
				}
			}
		}
		return erLik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int[][] nyMatrise = new int[matrise.length][];
		for (int i = 0; i < matrise.length; i++) {
			nyMatrise[i] = new int[matrise[i].length];
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[j][i];
			}
		}
		return nyMatrise;
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
		int[][] multiplisertMatrise = new int[a.length][];
		for (int i = 0; i < a.length; i++) {
			multiplisertMatrise[i] = new int[a[i].length];
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i].length; k++) {
					if (a.length == b.length) {
						multiplisertMatrise[i][j] += a[i][k] * b[k][j];
					}
				}
			}
		}
		return multiplisertMatrise;
	}
}
