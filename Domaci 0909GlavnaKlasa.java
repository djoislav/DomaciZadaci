package Covek;

public class GlavnaKlasa {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vozac v1  = new Vozac ("Zoran", "Petrovic", "sofer");
		Putnik p1 = new Putnik( "Milorad", "Mandic ", 1500);
		Autobus a1 = new Autobus ("Ikarbus", 500, v1, p1 );
		Vozac v2  = new Vozac ("Dragan", "Cvijanovic", "sofer");
		Putnik p2 = new Putnik( "Milorad", "Mandic ", 5500);
		Autobus a2 = new Autobus ("Scania", 300, v2, p2 );
		System.out.println(a1);
	    p1.smanjiNovac(300);
	    p1.uvecajNovac(1600);
	    System.out.println(a2);
	    
	   
		
		
		
	}

}
