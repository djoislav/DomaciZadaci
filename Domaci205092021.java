
public class Domaci205092021 {

	public String ime;
	public String prezime;
	public int rodjendan;
	public String pol;
	private boolean status;
	private double prosecnaZarada;
	private int brojSnimljenihFilmova;
	public double ukupnaZarada;

	public Domaci205092021() {

	}

	public void setstatus(boolean status) {
		this.status = status;

	}

	public boolean getstatus() {

		return this.status;

	}

	public void setprosecnaZarada(double prosek) {
		this.prosecnaZarada = prosek;

	}

	public double getprosecnaZarada() {
		return this.prosecnaZarada;

	}

	public void setbrojSnimljenihFilmova(int broj) {

		this.brojSnimljenihFilmova = broj;

	}

	public int getbrojSnimljenih() {

		return this.brojSnimljenihFilmova;

	}

	public double ukupnaZarada() {

		double ukupnaZarada = this.prosecnaZarada * this.brojSnimljenihFilmova;
		return ukupnaZarada;
	}

	public int sledeceGodine() {

		int sledeceGodine = 2022 - this.rodjendan;
		return sledeceGodine;

	}

	public void stampanje() {

		if (pol.equals("M")) {

			System.out.println("Name: Mr. " + ime + "\n" + "Lastname: " + prezime + "\n" + "Gender: " + pol + "\n"
					+ "Married: " + status + "\n" + "Average salary: " + prosecnaZarada + "\n"
					+ "Number of movies filmed: " + brojSnimljenihFilmova + "\n" + "Estimated worth: " + ukupnaZarada() + "\n"
					+ "Age next year: " + sledeceGodine());

		} else {

			System.out.println("Name: Mrs. " + ime + "\n" + "Lastname: " + prezime + "\n" + "Gender: " + pol + "\n"
					+ "Married: " + status + "\n" + "Average salary: " + prosecnaZarada + "\n"
					+ "Number of movies filmed: " + brojSnimljenihFilmova + "\n" + "Estimated worth: " + ukupnaZarada() + "\n"
					+ "Age next year: " + sledeceGodine());

		}

	}

}