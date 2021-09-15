import java.util.ArrayList;

public class Domaci05092021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina
		 * rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean),
		 * prosecna zarada po filmu, broj snimljenih filmova. Potrebno je izracunati i
		 * odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko
		 * godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena
		 * da se doda "Mr." ili "Mrs." ako su zenskog pola. Nakon toga napraviti Array
		 * listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
		 * napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore
		 * ocenjenog filma od tih pet (preko getera i setera).
		 */

		Domaci205092021 glumac1 = new Domaci205092021();

		glumac1.ime = "Meryl";
		glumac1.prezime = "Streep";
		glumac1.pol = "F";
		glumac1.rodjendan = 1949;
		glumac1.setstatus(true);
		glumac1.setprosecnaZarada(27688.55);
		glumac1.setbrojSnimljenihFilmova(76);
		glumac1.stampanje();

		ArrayList<String> Movies = new ArrayList<String>();
		Movies.add("Little Women (7.7)");
		Movies.add("The Deer Hunter (8.1)");
		Movies.add("Kramer vs. Kramer (7.8)");
		Movies.add("The Bridges of Madison County (7.6)");
		Movies.add("Manhattan (7.9)");

		Object alt = Movies.get(0);
		Movies.set(0, Movies.get(1));
		Movies.set(1, (String) alt);
		alt = Movies.get(1);
		Movies.set(1, Movies.get(4));
		Movies.set(4, (String) alt);
		alt = Movies.get(3);
		Movies.set(3, Movies.get(4));
		Movies.set(4, (String) alt);

		for (int i = 0; i < Movies.size(); i++) {

			System.out.println(Movies.get(i));

		}

	}
}
