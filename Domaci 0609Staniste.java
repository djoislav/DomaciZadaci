package ZooloskiVrt;

public class Staniste {

	private String[] stanovnici;
	private String naziv;

	public Staniste(String[] stanovnici, String naziv) {
		super();
		this.stanovnici = stanovnici;
		this.naziv = naziv;
	}

	public String[] getStanovnici() {
		return stanovnici;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setStanovnici(String[] stanovnici) {
		this.stanovnici = stanovnici;
	}

	public void stampanje() {
		System.out.println("Ime ovog stanista je " + naziv + " i u njemu zive: ");
		for (int i = 0; i < stanovnici.length; i++) {
			System.out.println(stanovnici[i] + ", ");
		}
	}
}
