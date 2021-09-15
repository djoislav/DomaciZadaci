import java.util.Scanner;

public class 01domaci1908 {

	public static void main(String[] args) {
		/*
		 * Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan
		 * broj prikaze mu se suma svih prethodno unetih brojeva i na kraju
		 * zakomentarisati koje ste brojeve sve unosili po testu
		 */

		Scanner sc = new Scanner(System.in);

		int x = 0;
		int zbir = 0;

		do {
			zbir = zbir + x;
			System.out.println("Unesi broj: ");
			x = sc.nextInt();

		} while (x >= 0);
		System.out.println("Zbir je: " + zbir);
		sc.close();
	}

}

//Uneo 5, 3, 4, 7, -1, dobio zbir 19.