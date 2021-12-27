import java.util.Scanner;

public class No5_SumDigitAwalDanAkhir {
    public static void main(String[] args) {
        int firstDigit, lastDigit, sum;
        Scanner input = new Scanner(System.in);

        // Tampilan input
        System.out.println("=== Program Menjumlahkan Digit Awal dan Akhir ===");
        System.out.print("Masukkan angka\t: ");

        // Ambil input bentuk string
        String angka = input.nextLine();

        // Ambil yg angka pertama dari string dengan cara di ambil elemen char di string terus ke integer
        firstDigit = Character.getNumericValue(angka.charAt(0));
        if(firstDigit < 0){
            firstDigit = firstDigit * -1;
        }

        // Ambil yg angka pertama dari string dengan cara di ambil elemen char di string terus ke integer
        lastDigit = Character.getNumericValue(angka.charAt(angka.length() - 1));

        // Output 
        sum = firstDigit + lastDigit;

        System.out.printf("Digit pertama\t: %d\n" , firstDigit);
        System.out.printf("Digit terakhir\t: %d\n" , lastDigit);
        System.out.printf("Hasil penjumlahan digit awal dan digit akhir adalah %d" , sum);

        input.close();
    }
}
