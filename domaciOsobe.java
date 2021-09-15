package promer01;

import java.util.Scanner;

public class domaciOsobe {

	public static void main(String[] args) {
	

			Scanner sc = new Scanner (System.in);
			
			String ime = "Djordje";
			String prezime = "Ilic";
			System.out.println("Ime i prezime: " + ime + " " + prezime);
			
			char pol = 'M';
			System.out.println("Pol: " + pol);
			
			
			
			
			System.out.print( "Ukupan broj osvojenih medalja Srbije na Olimpijskim igrama je: "  );
			int uk = sc.nextInt();
			
			System.out.print( "Broj osvojenih zlatnih medalja Srbije na Olimpijskim igrama je: "  );
			int z = sc.nextInt();
			
			double proc =1.0* (z*100)/uk ;
			System.out.println( "Procenat osvojenih zlatnih medalja Srbije u odnosu na sve osvojene medalje na Olimpijskim igrama je: " +proc );
			
			
			sc.close();
			
			
			
	}

}
