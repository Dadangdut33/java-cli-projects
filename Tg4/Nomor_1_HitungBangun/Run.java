import java.util.Scanner;

class Run {
    public static void main(String[] args) {
        float jariJari, panjang, lebar, alas, tinggi, sisi;
        char pilih;

        Scanner input = new Scanner(System.in);
        HitungBangun hitung = new HitungBangun();

        do {
            // try {
            //     new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            // } catch (Exception e) {}
            System.out.println("\n===Menu Pilihan===");
            System.out.println("1. Lingkaran\n2. Persegi Panjang\n3. Jajar Genjang\n4. Bola\n5. Kubus\n6. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilih = input.next().charAt(0);

            switch (pilih) {
                case '1':
                    System.out.println("=".repeat(24));
                    System.out.print("Masukkan panjang jari-jari lingkaran : ");
                    jariJari = input.nextFloat();
    
                    System.out.println("=".repeat(24));
                    System.out.printf("Luas lingkaran adalah %.2f\n", hitung.luasLingkaran(jariJari));
                    System.out.printf("Keliling lingkaran adalah %.2f", hitung.kelilingLingkaran(jariJari));
                    break;
                
                case '2':
                    System.out.println("=".repeat(24));
                    System.out.print("Masukkan panjang persegi panjang : ");
                    panjang = input.nextFloat();
    
                    System.out.print("Masukkan lebar persegi panjang : ");
                    lebar = input.nextFloat();
    
                    System.out.println("=".repeat(24));
                    System.out.printf("Luas lingkaran adalah %.2f\n", hitung.luasPersegiPanjang(panjang, lebar));
                    System.out.printf("Keliling lingkaran adalah %.2f", hitung.kelilingPersegiPanjang(panjang, lebar));
                    
                    break;
    
                case '3':
                    System.out.println("=".repeat(24));
                    System.out.print("Masukkan panjang alas jajar genjang : ");
                    alas = input.nextFloat();
    
                    System.out.print("Masukkan panjang tinggi jajar genjang : ");
                    tinggi = input.nextFloat();
    
                    System.out.println("=".repeat(24));
                    System.out.printf("Luas lingkaran adalah %.2f\n", hitung.luasJajarGenjang(alas, tinggi));
                    System.out.printf("Keliling lingkaran adalah %.2f", hitung.kelilingJajarGenjang(alas, tinggi));

                    break;
    
                case '4':
                    System.out.println("=".repeat(24));
                    System.out.print("Masukkan panjang jari-jari lingkaran : ");
                    jariJari = input.nextFloat();
    
                    System.out.println("=".repeat(24));
                    System.out.printf("Volume bola adalah %.2f\n", hitung.volumeBola(jariJari));
                    System.out.printf("Keliling bola adalah %.2f", hitung.kelilingBola(jariJari));

                    break;
                
                case '5':
                    System.out.println("=".repeat(24));
                    System.out.print("Masukkan panjang sisi kubus : ");
                    sisi = input.nextFloat();
    
                    System.out.println("=".repeat(24));
                    System.out.printf("Volume kubus adalah %.2f\n", hitung.volumeKubus(sisi));
                    System.out.printf("Keliling kubus adalah %.2f", hitung.kelilingKubus(sisi));

                    break;
                
                case '6':
                    System.out.println("Anda memilih keluar, Terimakasih telah menggunakan program ini.");
                    break;
                    
                default:
                    System.out.println("Pilihan Invalid!");
                    break;
                }
        } while (pilih != '6');

        input.close();
    }
}