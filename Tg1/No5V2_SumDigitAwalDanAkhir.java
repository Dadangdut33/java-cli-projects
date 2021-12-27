import java.util.Scanner;

public class No5V2_SumDigitAwalDanAkhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tampilan input
        System.out.println("=== Program Menjumlahkan Digit Awal dan Akhir ===");
        System.out.print("Masukkan angka\t: ");

        // Deklarasi
        int firstDigit, lastDigit, pembagi, sum;

        // Ambil input bentuk string
        int angka = input.nextInt();
        int simpan = angka;

        // Menghitung banyak digit
        int digit = 0;
        while(angka != 0){
            digit++;
            angka = angka / 10;
        }

        // Menentukan nilai pembagi
			pembagi = (int) Math.pow(10, digit - 1);

		// Digit awal dan akhir
			lastDigit = simpan % 10;
			firstDigit = simpan / pembagi;
            sum = firstDigit + lastDigit;

		// Output 
			System.out.printf("Banyak digit\t: %d\n" , digit);
			System.out.printf("Digit pertama\t: %d\nDigit terakhir\t: %d\nTotal digit awal + digit akhir: %d" , firstDigit, lastDigit, sum);

		
		
        input.close();
    }
}
