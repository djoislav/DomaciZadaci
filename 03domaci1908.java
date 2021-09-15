import java.util.Scanner;

public class 03domaci1908 {

	public static void main(String[] args) {
		/* Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik preko skenera.
		(Koristiti for petlju)
		Na primer N: 5
		*
		**
		***
		****
		*****
*/
		System.out.println("Unesi broj: ");
		Scanner sc = new Scanner(System.in);

		String star = "*";
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(star);
			star = star + "*";
		}
		sc.close();
	}

}
