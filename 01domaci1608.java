import java.util.Scanner;

public class 01domaci1608 {

	public static void main(String[] args) {
		
		/*
		 :Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11
		 */

		Scanner s13 = new Scanner(System.in);
		
		int n = 0;
		int zbir = 0;
		while  (n>= 0 ) {
		
		System.out.println("Unesite neki broj: ");
		n = s13.nextInt();
		if (n < 0) {
			break;
		}

		zbir = zbir + n;
		
		}
		System.out.println("Zbir pozitivnih brojeva je: " + zbir);
		}
		
		
		}

	
