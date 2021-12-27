import java.util.Scanner;
import java.util.ArrayList;

public class No1_RataRataList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nomor = new ArrayList<Integer>();

        System.out.print("Masukkan panjang list: ");
        int jumlah = input.nextInt();

        int temp;
        for (int i = 0; i < jumlah; i++){
            
            System.out.printf("Masukkan angka ke %d: ", i+1);
            temp = input.nextInt();
            
            nomor.add(temp);
        }

        int total = 0;
        for (int i : nomor){
            total += i;
        }

        double rataRata = 0;
        if (jumlah != 0) {
            rataRata = (double) total / jumlah;
        }

        System.out.println(nomor);

        System.out.println("Rata-rata: " + rataRata);


        input.close();
    }
}
