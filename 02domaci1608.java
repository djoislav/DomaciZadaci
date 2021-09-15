import java.util.Scanner;

public class 02domaci1608 {

	public static void main(String[] args) {
		
/*
 Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!” onoliko puta koliko je korisnik zadao preko konzole.
Primer: ako korisnik unese broj 20, poruku Laku noc! treba ispisati 20 puta
 */
		
		Scanner s14 = new Scanner(System.in);
		
		System.out.print("Unesite broj ponavljanja: ");
		
		int n = s14.nextInt();
		
		int i = 0;

		while (i < n) {
			
		i++;
		System.out.println("Laku noc.");
		}

	}

}
