import java.util.Scanner;

public class glavniGradovi {

	public static void main(String[] args) {
		/*
		 * ZADATAK Napisati program koji oponasa kviz za pogadjanje glavnog grada. -
		 * Program treba da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z
		 * programa. 1. Francuska 2. Italija 3. Srbija 4. Izlaz - Nakon odabira drzave,
		 * potrebno je postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?' - Ako
		 * korisnik odgovori tacno, ispisuje se poruka 'Odgovor je tacan' - Ako korisnik
		 * odgovori netacno, ispisuje se poruka 'Odgovor nije tacan' - Nakon davanja
		 * odgovora (bilo da je tacan ili netacan), ponovo treba da se postave sve
		 * pocetne opcije i ponudi korisniku da odabere neku od njih. - Program se
		 * zavrsava kad korisni odabere 4. opciju 'Izlaz' - Program uraditi koriscenjem
		 * dosad naucenog + do-while petlje
		 */

		Scanner s7 = new Scanner(System.in);

		
			String glavniGrad;
			int x;
			boolean dailine = true;

			
		do {
			System.out.println("Izaberite redni broj jedne od ponudjenih opcija: ");
			System.out.println("1. Francuska");
			System.out.println("2. Italija");
			System.out.println("3. Srbija");
			System.out.println("4. Izlaz");
			x = s7.nextInt();

			switch (x) {

			case 1:
				System.out.println("Koji je glavni grad Francuske?");
				glavniGrad = s7.next();
				glavniGrad = glavniGrad.toUpperCase();
				if (glavniGrad.equals("PARIZ"))
					System.out.println("Odgovor je tacan.");
				else
					System.out.println("Odgovor nije tacan");
				break;

			case 2:
				System.out.println("Koji je glavni grad Italije?");
				glavniGrad = s7.next();
				glavniGrad = glavniGrad.toUpperCase();
				if (glavniGrad.equals("RIM"))
					System.out.println("Odgovor je tacan.");
				else
					System.out.println("Odgovor nije tacan");
				break;

			case 3:
				System.out.println("Koji je glavni grad Srbije?");
				glavniGrad = s7.next();
				glavniGrad = glavniGrad.toUpperCase();
				if (glavniGrad.equals("BEOGRAD"))
					System.out.println("Odgovor je tacan.");
				else
					System.out.println("Odgovor nije tacan");
				break;
			case 4:

				dailine = false;
				break;
			}

		} while (dailine);
		s7.close();

		System.out.println("KRAJ PROGRAMA");

	}

}
