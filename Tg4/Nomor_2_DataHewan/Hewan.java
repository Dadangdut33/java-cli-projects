import java.util.Scanner;

public class Hewan {
    String nama, jenis, jenisAktivitas, tempNama;
    char kelamin, pilihanDalam;
    int energi = 100;
    double berat, umur;
    Scanner input = new Scanner(System.in);

    void gantiNama(){
        this.tempNama = this.nama;
        System.out.print("Masukkan nama baru: ");
        this.nama = input.nextLine();
        
        System.out.printf("Nama berhasil diganti, dari %s menjadi %s\n", this.tempNama, this.nama);
    }

    void cekEnergi(){
        if(energi < 35) {
            System.out.printf("Energi %s sisa %d%%. Sebaiknya anda beri makan atau tidur\n", this.nama, this.energi);
        } else {
            System.out.printf("%s masih bersemangat, ia masih memiliki %d%% energi\n", this.nama, this.energi);
        }
    }

    void makan(){
        if(this.energi >= 75){
            System.out.printf("%s masih kenyang. Tidak bisa makan.\n", this.nama);
        } else {
            this.energi += 35;
            this.berat += 0.25;
            this.umur += 0.1; // Asumsi makan + istirahat memakan waktu 2 jam 
            if (this.energi > 100) {
                this.energi = 100;
            }


            System.out.printf("%s telah makan. Energinya sekarang ada %d%%\n", this.nama, this.energi);
        }
    }

    void berAktivitas(){ 
        if(this.energi <= 20){
            System.out.printf("Energi kurang, %s harus tidur atau makan terlebih dahulu untuk mengisi energi\n", this.nama);
            return;
        }

        do {
            System.out.println("=====Aktivitas Yang Bisa Dilakukan=====");
            System.out.println("1. Bermain santai\n2. Latihan trik\n3. Jalan-jalan");
            System.out.print("Anda ingin melakukan aktivitas apa dengan hewan anda: ");
            this.pilihanDalam = input.next().charAt(0);
        } while (this.pilihanDalam < 1 && this.pilihanDalam > 3);


        if(this.pilihanDalam == '1'){
            this.berat -= 0.1;
            this.energi -= 35;
            this.umur += 0.15; // 3.6
            this.jenisAktivitas = "Bermain santai";
        } else 
        if(this.pilihanDalam == '2'){
            this.berat -= 0.25;
            this.energi -= 45;
            this.umur += 0.25; // 6
            this.jenisAktivitas = "Latihan trik";
        } else
        if(this.pilihanDalam == '3'){
            this.berat -= 0.15;
            this.energi -= 40;
            this.umur += 0.20; // 4.8
            this.jenisAktivitas = "Jalan-jalan";
        }

        // Cek jika energi turun sampai < 0
        if(this.energi < 0){
            this.energi = 0;
        }

        System.out.printf("Anda telah %s bersama hewan anda %s\n", this.jenisAktivitas, this.nama);
    }

    void tidur(){ // Hewan tidur kapan saja
        if(this.energi >= 75){ 
            System.out.printf("%s masih belum ngantuk. Tidak bisa tidur\n", this.nama);
        } else {
            this.umur += 0.5; // Tidur 12 jam
            this.energi = 100;
            System.out.printf("%s telah tidur dan energi telah naik kembali menjadi 100%%\n", this.nama);
        }
    }
}
