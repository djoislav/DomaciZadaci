import java.util.Scanner;

public class Domaci22308 {
	static double nadjibr(double a, double b, double c) {
		return a * b * c;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi 3 cela broja: ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double z = sc.nextDouble();

		System.out.println("Proizvod brojeva je " + nadjibr(x, y, z) + " .");
		sc.close();
	}
	
}