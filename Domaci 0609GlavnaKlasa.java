package ZooloskiVrt;

public class GlavnaKlasa {

	public static void main(String[] args) {
		Ribe r1 = new Ribe("kicmenjak", "Stuka", "mesojed", "slatkoj", 9, "elasticnih");
		Sisari s1 = new Sisari("kicmenjak", "Antilopa", "biljojed", "braon", "divlje");
		
		String[] spisakZivotinja = {"Pelikan", "Gnu", "Zaba"};
		Staniste staniste = new Staniste(spisakZivotinja, "bara");
	
		
		r1.stampanje();
		System.out.println("");
		s1.stampanje();
		s1.setBojaDlake("oker");
		System.out.println("");
		s1.stampanje();
		System.out.println("");
		staniste.stampanje();
	}
}