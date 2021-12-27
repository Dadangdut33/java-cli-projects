import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int bil, hasil;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan bilangan: ");
		bil = scan.nextInt();
		hasil = faktorial(bil);

		System.out.println("Faktorial dari " + bil + " adalah " + hasil);

		scan.close();
	}

	static int faktorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * faktorial(num - 1);
	}
}
