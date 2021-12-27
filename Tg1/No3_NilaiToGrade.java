import java.util.Scanner;

public class No3_NilaiToGrade {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai yang ingin di cek: ");

        int nilai = input.nextInt();
        if(nilai <= 100 && nilai >= 80){
            System.out.printf("Nilai yang dimasukkan = \"%d\"\nAnda mendapatkan grade A", nilai);
        } else
        if(nilai <= 79 && nilai >= 70){
            System.out.printf("Nilai yang dimasukkan = \"%d\"\nAnda mendapatkan grade B", nilai);
        } else
        if(nilai <= 69 && nilai >= 60){
            System.out.printf("Nilai yang dimasukkan = \"%d\"\nAnda mendapatkan grade C", nilai);
        } else
        if(nilai <= 59 && nilai >= 50){
            System.out.printf("Nilai yang dimasukkan = \"%d\"\nAnda mendapatkan grade D", nilai);
        } else
        if(nilai <= 50 && nilai >= 0){
            System.out.printf("Nilai yang dimasukkan = \"%d\"\nAnda mendapatkan grade E", nilai);
        } else {
            System.out.println("Nilai yang dimasukkan invalid!");
        }
        input.close();
    }
}