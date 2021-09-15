package Covek;

//Putnik je covek koji poseduje novac. 
//Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
//Odredjena svota novca moze da mu se doda i/ili oduzme.

public class Putnik extends Covek {

	private double novac = 0;

	public Putnik(String ime, String prezime, double novac) {
		super(ime, prezime);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public void uvecajNovac(int suma) {
		novac += suma;
	}

	public void smanjiNovac(int suma) {
		novac -= suma;
	}
}
