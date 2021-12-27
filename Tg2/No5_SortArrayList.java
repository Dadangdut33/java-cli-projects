import java.util.Scanner;
import java.util.ArrayList;

public class No5_SortArrayList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> acak = new ArrayList<Integer>();

        int simpan, jumlah, bantu;

        System.out.print("Masukkan panjang array: ");
        jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++){
            System.out.print("Masukkan angka ke "+ (i+1) +": ");
            simpan = input.nextInt();

            acak.add(simpan);
        }
        System.out.println("Array masih bentuk acak: "+ acak);

		// Disortir dari depan atau dari 0
		for (int i = 0; i < jumlah; i++) { // Untuk elemen i... posisi i berada di paling depan
			for (int j = i+1; j < jumlah; j++) { // Di cek dari elemen setelah i sampai ujungnya .... j -> posisi elemen di array setelah i
				if (acak.get(i) > acak.get(j)) { // Apabila elemen i > elemen setelahnya (j), maka 
					bantu = acak.get(i); // i simpan
					acak.set(i, acak.get(j)); // j pindahkan ke i (atau ke depan) 
					acak.set(j, bantu); // elemen i pindah ke tempat j (Didorong ke belakang)
				}
			}
		}
		System.out.println("Array sudah disortir: "+ acak);

        input.close();
    }
}