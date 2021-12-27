import java.util.Scanner;
import java.util.ArrayList;

public class No3_ReverseArrayList {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> inputArray = new ArrayList<Integer>();
        ArrayList<Integer> arrayBaru = new ArrayList<Integer>();

        System.out.print("Masukkan panjang array: ");
        int jumlah = input.nextInt();

        int simpan;
        for (int i = 0; i < jumlah; i++){
            System.out.printf("Masukkan elemen ke %d array: ", i+1);
            simpan = input.nextInt();

            inputArray.add(simpan);
        }

        System.out.println("\nArray Yang diinput: ");
        System.out.println(inputArray);
        
        for(int i = inputArray.size() - 1; i >= 0; i--){
            arrayBaru.add(inputArray.get(i));
        }

        System.out.println("\nArray Dibalik: ");
        System.out.println(arrayBaru);
        input.close();
    }
}
