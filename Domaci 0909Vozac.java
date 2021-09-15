package Covek;

public class Vozac extends Covek{

	
	private String zvanje;

		public Vozac(String ime, String prezime, String zvanje) {
			super(ime, prezime);
			this.zvanje="sofer";
			
		}
		@Override
		public String toString() {
			return super.toString()+zvanje;
		}
}