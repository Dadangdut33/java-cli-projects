import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Manusia manusia = new Manusia("Fauzan", "Ciledug", "Main game", 19);

        char pilihan;
        String temp;
        int umur;
        do {
            System.out.println("Data Manusia");
            manusia.showInfo();
            System.out.println("Menu");
            System.out.println("1. Ganti alamat\n2. Ganti hobi\n3. Ubah umur\n4. Keluar");
            
            pilihan = input.next().charAt(0);
            switch (pilihan) {
                case '1':
                    input.nextLine();
                    System.out.print("Ganti alamat: ");
                    temp = input.nextLine();
                    manusia.gantiAlamat(temp);

                    break;
            
                case '2':
                    input.nextLine();
                    System.out.print("Ganti hobi: ");
                    temp = input.nextLine();
                    manusia.gantiHobi(temp);

                    break;

                case '3':
                    input.nextLine();
                    System.out.print("Ubah umur: ");
                    umur = input.nextInt();
                    manusia.gantiUmur(umur);

                    break;

                case '4':
                    System.out.println("Anda memilih keluar");
                    break;

                default:
                    System.out.println("Pilihan invalid");
                    break;
            }
        } while (pilihan != '4');

        input.close();
    }
}
