import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Tiket {
    // Deklarasi
    SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    Scanner input = new Scanner(System.in); // input
    Main function = new Main(); // ambil function yg ada di Main class

    ArrayList<String> tujuan = new ArrayList<String>(Arrays.asList("Jakarta\t\t", "Yogyakarta\t", "Tangerang\t", "Bandung\t\t", "Bali\t\t", "Papua\t\t", "Medan\t\t", "Balikpapan\t"));
    ArrayList<Integer> stokTiket = new ArrayList<Integer>(Arrays.asList(100, 80, 300, 1000, 500, 372, 500, 30));
    ArrayList<Integer> hargaTiket = new ArrayList<Integer>(Arrays.asList(500_000, 700_000, 200_000, 150_000, 200_000, 1_000_000, 2_000_000, 800_000));
    ArrayList<Integer> kodeTiket = new ArrayList<Integer>(Arrays.asList(002, 102, 023, 231, 242, 420, 240, 300));
    int index;
    String temp, tempKode, tempJumlahBeli, tempBayar, tanggal;
    int kode, jumlahBeli, bayar, validator, kembalian;
    boolean ada;

    void beliTiket(DataPengguna user) {
        Date date = new Date(); // buat history pembelian
        this.ada = false;
        System.out.print("Masukkan kode tiket yang ingin dibeli: ");
        this.tempKode = input.nextLine(); // cek dari string dulu itu angka apa bukan jd bisa cek error apa ga pas dijadiin integer 
        // Jika inputan bukan angka
        if(!function.checkNum(this.tempKode)){
            System.out.println("Input invalid!");
            return;
        }
        // Parse ke integer
        this.kode = Integer.parseInt(this.tempKode);
        
        // cek ada tiketnya apa ga
        for(int i = 0; i < kodeTiket.size(); i++){ 
            if(kodeTiket.get(i).equals(this.kode)){
                this.index = i;
                this.ada = true;
                break;
            }
        }

        // jika tidak ada
        if(!this.ada){ 
            System.out.println("Tidak ditemukan tiket dengan kode " + this.kode);
            return; // stop kalau ga ada
        }

        // jika ada
        System.out.println("=".repeat(50));
        System.out.println("Ditemukan tiket kode [" + this.kodeTiket.get(this.index) + "]");
        System.out.println("Tujuan\t: " + this.tujuan.get(this.index));
        System.out.println("Harga\t: Rp. " + this.hargaTiket.get(this.index) + "/tiket");
        System.out.println("=".repeat(50));

        System.out.print("Masukkan jumlah tiket yang ingin dibeli: "); // Minta jumlah tiketnya
        this.tempJumlahBeli = input.nextLine();

        // Jika inputan bukan angka
        if(!function.checkNum(this.tempJumlahBeli)){
            System.out.println("Input invalid.");
            return;
        }

        // Parse ke integer
        this.jumlahBeli = Integer.parseInt(this.tempJumlahBeli);

        // Cek angka, tidak mungkin beli < 0
        if(this.jumlahBeli < 0){ 
            System.out.println("Input invalid.");
            return;
        }
        
        // Cek angka, tidak mungkin beli melebihi stok
        if(this.jumlahBeli > this.stokTiket.get(this.index)){ 
            System.out.println("Stok tidak cukup!");
            return;
        }

        // Cek angka, tidak mungkin beli jumlahnya jika ditotal melebihi uang yg dimiliki
        if(this.hargaTiket.get(this.index) * this.jumlahBeli > user.uang){ 
            System.out.println("Uang anda kurang!");
            return;
        }

        // Pritn jumlah yg harus dibayar
        System.out.println("Jumlah yang harus dibayar adalah sebesar Rp. " + this.hargaTiket.get(this.index) * this.jumlahBeli);
        System.out.print("Masukkan uang anda: ");

        // Bayar
        this.tempBayar = input.nextLine();
        
        // Cek inputan lagi
        if(!function.checkNum(this.tempBayar)){ // Cek angka
            System.out.println("Input invalid.");
            return;
        }

        // Parse ke integer
        this.bayar = Integer.parseInt(this.tempBayar);

        // Jika uang yg dimasukkan lebih dari uang yg dimiliki
        if(this.bayar > user.uang){ 
            System.out.println("Anda tidak memiliki uang sebanyak itu!");
            return;
        }

        // cek jika uang kurang dari harga
        if(this.bayar < this.hargaTiket.get(this.index) * this.jumlahBeli){ 
            System.out.println("Uang kurang!");
            return;
        }

        // Dapet kembalian
        this.kembalian = this.bayar - (this.hargaTiket.get(this.index) * this.jumlahBeli);

        // Di validasi dari sini dapat 2 last digit tp masih kebalik
        this.validator = function.twoLast(this.kembalian); 

        // Dibalik lagi
        this.validator = function.reverseInt(this.validator); // Sebenernya ga dibalik juga gpp karena sama2 aja diceknya

        // cek jika last 2 digit 1-99
        if((this.validator > 0 && this.validator < 100)){ 
            System.out.println("Uang yang dimasukkan invalid! Tidak bisa mengembalikan uang 1-99 karena tidak ada!");
            return;
        }

        // Kurangin uang
        user.uang -= this.hargaTiket.get(this.index) * this.jumlahBeli;

        // Tanggal
        this.tanggal = formatDate.format(date);

        // Print pembelian sukses
        function.cls();
        System.out.println("=============Pembelian Berhasil=============");
        System.out.println("Pembelian pada tgl\t: " + this.tanggal);
        System.out.println("Uang yang diberi\t: Rp."+ this.bayar);
        System.out.println("Kembalian\t\t: Rp." + this.kembalian);
        System.out.println("Untuk mengecek riwayat pembelian dapat menggunakan menu nomor [3]");

        // Store data pembelian ke array tiketDibeli
        this.temp = String.format("\nKode tiket\t: %d\nTujuan\t\t: %s\nJumlah\t\t: %d\nTotal\t\t: Rp.%d\nDibayar\t\t: Rp.%d\nKembalian\t: Rp.%d\nTanggal\t\t: %s\n", 
                    this.kodeTiket.get(this.index), this.tujuan.get(this.index), this.jumlahBeli, this.hargaTiket.get(this.index) * this.jumlahBeli, this.bayar, this.kembalian, this.tanggal);
        
        user.tiketDibeli.add(temp);
    }

    void cetakTiket(DataPengguna user){
        if(user.tiketDibeli.size() == 0){ // Cek udah pernah beli atau belum
            System.out.println("Anda belum pernah membeli tiket");
            return;
        }

        // Kalau ada lanjut
        System.out.println("Tiket yang dimiiki oleh user:");
        System.out.println("=".repeat(50));
        int count = 1;
        for(int i = 0; i < user.tiketDibeli.size(); i++){
            System.out.println("Pembelian ke-" + count + user.tiketDibeli.get(i));
            count++;
        }
        System.out.println("=".repeat(50));
    }

    void lihatTiket(){
        // Print tiket
        System.out.println("Tiket yang tersedia adalah sebagai berikut: ");
        System.out.println("| No | Tujuan\t\t| Stok Tiket \t| Harga (Rp)\t| Kode Tiket\t|");
        System.out.println("=".repeat(73));
        int count = 1;
        for (int i = 0; i < stokTiket.size(); i++){
            System.out.println("| "+ count + "  | " + this.tujuan.get(i) + "| " + this.stokTiket.get(i) + "\t\t| " + this.hargaTiket.get(i) + "\t| " + this.kodeTiket.get(i) + "\t\t|");
            count++;
        }
        System.out.println("=".repeat(73));
    }
}

// Old
// Tadinya cek last 3 digit 1-499 atau 501-999 -> return
// this.kembalianString = Integer.toString(this.kembalian);
// this.validator = function.parseToInt(this.tempBayar.substring(tempBayar.length() - 3, tempBayar.length()));
// cek jika last 3 digit 1-499 atau 501-999
// if((this.validator > 0 && this.validator < 500) || (this.validator > 500 && this.validator < 1000)){ 
//     System.out.println("Uang yang dimasukkan invalid!");
//     return;
// }

// this.kode = function.parseToInt(this.tempKode);

        // if(this.kode == -3333){ // Cek angka
        //     System.out.println("Input invalid.");
        //     return;
        // }