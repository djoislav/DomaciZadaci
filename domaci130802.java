import java.util.Scanner;

public class domaci130802 {

	public static void main(String[] args) {
	

		/*
		 -Napisati program gde preko skenera unesete broj,
		  ako je broj manji od 10 onda ga pomnoziti sa 100, ako je broj veci od 100 onda ga podeliti sa 10. 
		  Na kraju zakomentarisite koje brojeve ste koristili za proveru programa.
		 */
		
Scanner noviskener = new Scanner (System.in);
		
		System.out.print("Unesite neki broj : ");
		
		int broj = noviskener.nextInt();
		
		if (broj < 10) {
			
			int pomnozeniBroj = broj * 100;
            System.out.println("Broj je manji od 10 i pomnozen je sa 100: " + pomnozeniBroj);
            
            // Testirao sa brojevima 9, 10 i 11
        }
		else if (broj > 100)
		{
			double podeljeniBroj = broj/10;
			System.out.println("Broj je veci od 100 pa je podeljen sa 10" +podeljeniBroj);
		}
			//testirao sa brojevima 99, 100 i 101
			
		else { 
			System.out.println("Broj nije manji od 10 niti je veci od 100");
		}
		

		//testirao sa brojevima 10, 50 i 100
			
		noviskener.close();
		}	
		}


