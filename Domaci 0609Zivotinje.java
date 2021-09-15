package ZooloskiVrt;

public class Zivotinje {
	private String vrsta;
	private String ime;
	private String ishrana;

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getIshrana() {
		return ishrana;
	}

	public void setIshrana(String ishrana) {
		this.ishrana = ishrana;
	}

	public Zivotinje(String vrsta, String ime, String ishrana) {
		super();
		this.vrsta = vrsta;
		this.ime = ime;
		this.ishrana = ishrana;
	}

	public void stampanje() {
		System.out.println("Vrsta: "+ vrsta + "\n Ime: " + ime + "\n Ishrana: "+ ishrana);
	}
	
}
