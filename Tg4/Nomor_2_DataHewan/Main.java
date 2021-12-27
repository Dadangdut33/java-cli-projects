import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        Hewan hewan = new Hewan();
        Main function = new Main();
        hewan.nama = "Globglogabgalab";
        hewan.jenis = "Kucing";
        hewan.umur = 4745; // 13 tahun
        hewan.berat = 500.5;
        hewan.kelamin = 'L';

        char pilihan;
        Scanner input = new Scanner(System.in);
        do {
            function.cls();
            System.out.println("=======Data Hewan=======");
            System.out.printf("Nama hewan\t: %s\n", hewan.nama);
            System.out.printf("Jenis Hewan\t: %s\n", hewan.jenis);
            System.out.printf("Kelamin\t\t: %c\n", hewan.kelamin);
            System.out.printf("Umur (Hari)\t: %.2f\n", hewan.umur);
            System.out.printf("Berat (Kg)\t: %.2f\n", hewan.berat);
            System.out.println("=".repeat(25));
            System.out.printf("Energi\t\t: %d%%\n", hewan.energi);
            System.out.print("Menu pilihan\t:\n1. Ganti nama\n2. Aktivitas\n3. Makan\n4. Tidur\n5. Cek energi\n6. Keluar\n");
            System.out.print("Masukkan pilihan anda: ");
            pilihan = input.next().charAt(0);
            System.out.println("=".repeat(25));
            switch(pilihan) {
                case '1':
                    function.cls();
                    hewan.gantiNama();
                    System.out.println("=".repeat(50));
                    function.sleep(2);
                
                    break;
                case '2':
                    function.cls();
                    hewan.berAktivitas();
                    System.out.println("=".repeat(50));
                    function.sleep(3);

                    break;
                case '3':
                    function.cls();
                    hewan.makan();
                    function.sleep(2);

                    break;
                case '4':
                    function.cls();
                    hewan.tidur();
                    System.out.println("=".repeat(50));
                    function.sleep(2);

                    break;
                case '5':
                    function.cls();
                    hewan.cekEnergi();
                    System.out.println("=".repeat(50));
                    function.sleep(2);

                    break;
                case '6':
                    System.out.println("Anda memilih untuk keluar...");
                    break;
                default:
                    System.out.println("Pilihan salah!");
                    function.sleep(2);

                    break;
            }
            
        } while (pilihan != '6');

        input.close();
    }

    void sleep(int second){ // Alternative untuk getch
        int time = second * 1000;
        try {
            Thread.sleep(time);
        }
        catch(InterruptedException ex){        
            Thread.currentThread().interrupt();
        }
    }

    void cls(){ // clear screen
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {}
    }
}