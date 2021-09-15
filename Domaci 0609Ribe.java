package ZooloskiVrt;

public class Ribe extends Zivotinje {
	
	private String mestoObitavanja;
	private int brojPeraja;
	private String vrstaPeraja;
	
	public Ribe(String vrsta, String ime, String ishrana, String mestoObitavanja, int brojPeraja, String vrstaPeraja) {
		super(vrsta, ime, ishrana);
		this.mestoObitavanja = mestoObitavanja;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
		
	}
		public void stampanje() {
			super.stampanje();
			
			System.out.println("zive u " + this.mestoObitavanja + " vodi, imaju " + this.brojPeraja + this.vrstaPeraja + " peraja " );
		}
}
