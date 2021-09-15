public class 02domaci2008 {

	public static void main(String[] args) {
		// Napisati program gde u nizu napisete 5 gradova, a program vam odstampa sve osim prvog i poslednjeg unosa.

		String []gradovi = {"Lisabon", "London", "Helsinki", "Prag", "Madrid"};
		
		for (int i = 1; i< 4; i++ ) {
			System.out.println("gradovi <"+i+">; " + gradovi[i]);
					 }
	}

}