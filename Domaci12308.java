import java.util.Scanner;

	public class Domaci12308 {
		
	static double nadjibr(double a, double b, double c) {
		if (a >= b) {
			double tmp = a;
			a = b;
			b = tmp;
		}
		if (a <= c) {
			return a;
		} else {
			return c;
		}

		}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi 3 cela broja: ");
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		System.out.println("Najmanji broj je: " + nadjibr(x, y, z) + " .");
		sc.close();
	}

}
