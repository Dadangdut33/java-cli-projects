import java.util.Scanner;

public class No6_PalindromeAngka {
    public static void main(String[] args){
		int angka, simpanAngka, sisa, dibalik;
        Scanner input = new Scanner(System.in);

        // Meminta input
        System.out.println("=== Program Mengecek Palindrome Angka ===");
        System.out.print("Masukkan angka yang ingin di cek: ");

        // Ambil input bentuk string
        angka = input.nextInt();
        simpanAngka = angka;

        // Proses
        dibalik = 0;
        while(angka != 0) {  
            sisa = angka % 10; // Sisanya adalah digit akhir dari angka
            dibalik = dibalik * 10 + sisa;
            /*
             Digit dimasukkan ke int dibalik dengan cara dikali, jadi 10 terus ditambah sisa
             Jadi nanti angka yg dah masuk lanjut terus
             Misal angka 1234 jadinya,
             0 + 4          = 4
             4 *10 + 3       = 43
             43 * 10 + 2    = 432
             432 * 10 + 1   = 4321 
             dst.. kalau ada angka lagi
             Bisa dicek prosesnya dengan print langsung System.out.println(dibalik);
            */ 
            angka = angka/10; // Dibagi 10 jadi digit terakhirnya hilang
        }  

        // Cek sama atau tidak
        if(simpanAngka == dibalik){
            System.out.printf("%d adalah palindrome", simpanAngka);
        } else {
            System.out.printf("%d adalah bukan palindrome", simpanAngka);
        }

        input.close();
    }
}