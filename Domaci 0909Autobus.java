package Covek;

public class Autobus {
//Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. 
	// Naziv i cena karte i zadaju se prilikom kreiranja.
	// Moguce je dodati/ukloniti putnika kao i vozaca.
	// Moguce je naplatiti kartu putnicima samo ako je vozac prisutan.
	private String naziv;
	private double cenaKarte;
	private Vozac vozac;
	private Putnik putnik;
	

	public Autobus(String naziv, double cenaKarte, Vozac vozac, Putnik putnik) {
		super();
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.vozac = vozac;
		this.putnik = putnik;

	}

	public String getPutnik() {
		return getPutnik();
	}

	public String getNaziv() {
		return naziv;
	}

	public double getCenaKarte() {
		return cenaKarte;
	}

	public void setCenaKarte(double cenaKarte) {
		this.cenaKarte = cenaKarte;
	}

	public void dodatiVozaca(Vozac a) {
		if (vozac == null) {
			this.vozac = a;
		}
	}

	public void uklonitiVozaca(Vozac a) {
		if (vozac != null) {
			this.vozac = null;
		}
	}

	public void dodatiPutnika(Putnik p) {
		if (putnik == null) {
			this.putnik = p;
		}
	}

	public void uklonitiPutnika(Putnik p) {
		if (vozac != null) {
			this.vozac = null;
		}
		

		double naplata;
		{if (vozac != null) {
			naplata = putnik.getNovac() - cenaKarte;
				return;
			} else {
				System.out.println("Karta ne moze biti naplacena jer vozac nije u autobusu");
			}

		}
		
	}

	@Override
	public String toString() {
		return ("Autobus model: " + naziv + ", Cena karte:" + cenaKarte + ", Vozac:" + this.vozac + ", putnik:"
				+ this.putnik);
	}

}