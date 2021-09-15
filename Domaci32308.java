import java.util.Scanner;

public class Domaci32308 {

	static double zbir(double a, double b, double c) {
		return a + b + c;
	}

	static double najveciBroj(double a, double b, double c) {
		if (a<=b) {
			double tmp = a;
			a = b;
			b= tmp;
		}
			if (a>=c) {
			return a;
		} else {
			return c;
		}

	}

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 3 cela broja: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		double zbir = zbir(x, y, z);
		double najveciBroj = najveciBroj(x, y, z);

		System.out.println("Zbir unesenih brojeva je " + zbir + " , a najveci medju njima je " + najveciBroj + " .");
		sc.close();
	}

}
