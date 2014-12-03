import java.util.Scanner;

public class Matrica {

	/**
	 * Funkcija kreira matricu za zadani broj redova i kolona
	 * @param redovi
	 * @param kolone
	 * @return matrica 
	 */
	
	private static int[][] kreirajMatricu(int redovi, int kolone) {
		Scanner unos = new Scanner(System.in);
		int[][] matrica = new int [redovi][kolone];
		for (int i=0; i<redovi; i++)
		{
			for (int j=0; j<kolone; j++)
			{
				System.out.println("Unesite (" + (i+1) + ", " + (j+1) + ") član matrice: ");
				matrica[i][j] = unos.nextInt();
			}
		}
		return matrica;
	}
	
	/**
	 * Funkcija ispisuje zadanu matricu
	 * @param matrica
	 */
	
	private static void ispisiMatricu(int[][] matrica) {
		for (int i=0; i<matrica.length; i++)
		{
			for (int j=0; j<matrica[i].length; j++)
			{
				System.out.printf("%3d ", matrica[i][j]);
			}
			System.out.println();
		}
		
	}

	/**
	 * Funkcija sabira dvije zadane matrice i vraća njihov zbir
	 * @param matrica1
	 * @param matrica2
	 * @return suma
	 */
	
	private static int[][] sabiranje(int[][] matrica1, int[][] matrica2) {
		int[][] suma = new int [matrica1.length][matrica1[0].length];
		try
		{
			for (int i=0; i<matrica1.length; i++)
			{
				for (int j=0; j<matrica1[i].length; j++)
				{
					suma[i][j] = matrica1[i][j] + matrica2[i][j];
				}
			}
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Matrice nije moguće sabrati");
		}
		return suma;
	}

	/**
	 * Funkcija oduzima dvije zadana matrice i vraća njihovu razliku
	 * @param matrica1
	 * @param matrica2
	 * @return razlika
	 */
	
	private static int[][] oduzimanje(int[][] matrica1, int[][] matrica2) {
		int[][] razlika = new int [matrica1.length][matrica1[0].length];
		try
		{
			for (int i=0; i<matrica1.length; i++)
			{
				for (int j=0; j<matrica1[i].length; j++)
				{
					razlika[i][j] = matrica1[i][j] - matrica2[i][j];
				}
			}
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Matrice nije moguće sabrati");
		}
		return razlika;
	}

	/**
	 * Funkcija množi dvije zadane matrice i vraća njihov proizvod
	 * @param matrica1
	 * @param matrica2
	 * @return proizvod
	 */
	
	private static int[][] mnozenje(int[][] matrica1, int[][] matrica2) {
		int[][] proizvod = new int [matrica1.length][matrica2[0].length];
		try
		{
			for (int i=0; i<matrica1.length; i++)
			{
				for (int j=0; j<matrica2[0].length; j++)
				{
					for (int k=0; k<matrica1[0].length; k++)
					{
						proizvod[i][j] += matrica1[i][k]*matrica2[k][j];
					}
				}
			}
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Matrice nije moguće pomnožiti");
		}
		return proizvod;
	}
	
	public static void main(String[] args) {
		System.out.println("Unesi broj redova matrice: ");
		Scanner unos = new Scanner(System.in);
		int redovi = unos.nextInt();
		System.out.println("Unesi broj kolona matrice: ");
		int kolone = unos.nextInt();
		int[][] matrica1 = kreirajMatricu(redovi, kolone);
		ispisiMatricu(matrica1);
		int[][] matrica2 = kreirajMatricu(redovi, kolone);
		ispisiMatricu(matrica2);
		int[][] zbir = sabiranje(matrica1, matrica2);
		System.out.println("Suma matrica: ");
		ispisiMatricu(zbir);
		int[][] razlika = oduzimanje(matrica1, matrica2);
		System.out.println("Razlika matrica: ");
		ispisiMatricu(razlika);
		int[][] proizvod = mnozenje(matrica1, matrica2);
		System.out.println("Proizvod matrica: ");
		ispisiMatricu(proizvod);
	}


}
