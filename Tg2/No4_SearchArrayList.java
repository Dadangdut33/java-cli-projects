import java.util.Scanner;
import java.util.ArrayList;

public class No4_SearchArrayList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> angka = new ArrayList<Integer>();
    
        int cari;
        // Isi array
        angka.add(3);
        angka.add(1);
        angka.add(5);
        angka.add(6);
        angka.add(100);
        angka.add(101);
        angka.add(666);
        angka.add(33);
    
        System.out.println(angka);
        System.out.print("Masukkan angka yg ingin dicari: ");
        cari = input.nextInt(); // Input mencari
        
        boolean ada = false;
        int index = 0;
    
		// Di cek 
        for(int i = 0; i < angka.size(); i++){
            if(angka.get(i) == cari){
                ada = true;
                index = i;
                break;
            }
        }

        if(ada) {
            System.out.printf("Pencarian angka %d ditemukan di array pada index ke-%d", cari, index);
        } else {
            System.out.printf("Pencarian angka %d tidak ditemukan di array", cari);
        }

        input.close();
    }
}