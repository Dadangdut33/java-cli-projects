import java.util.Scanner;
import java.util.ArrayList;

public class No2_ListCekSama {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arraySatu = new ArrayList<Integer>();
        ArrayList<Integer> arrayDua = new ArrayList<Integer>();

        System.out.print("Masukkan panjang array: ");
        int jumlah = input.nextInt();

        int simpan;
        for (int i = 0; i < jumlah; i++){
            System.out.printf("Masukkan elemen ke %d array 1: ", i+1);
            simpan = input.nextInt();

            arraySatu.add(simpan);
            System.out.printf("Masukkan elemen ke %d array 2: ", i+1);
            simpan = input.nextInt();

            arrayDua.add(simpan);
        }

        boolean sama = true;

        System.out.println(arraySatu);
        System.out.println(arrayDua);

        for(int i = 0; i < jumlah; i++){
            if(arraySatu.get(i) != arrayDua.get(i)){
                sama = false;
                i = jumlah;
            }
        }

        if (sama) {
            System.out.println("Array sama");
        } else {
            System.out.println("Array berbeda");
        }

        input.close();
    }
}
