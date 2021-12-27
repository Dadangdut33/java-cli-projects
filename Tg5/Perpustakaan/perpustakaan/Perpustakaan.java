package perpustakaan;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Perpustakaan {
    // deklarasi array
    private ArrayList<String> namaBuku = new ArrayList<String>(Arrays.asList("Naruto\t\t\t", "Boku No Hero Academia\t", "Nisekoi\t\t\t", "Sejarah Dunia\t\t", "Tajwid\t\t\t", "Ensiklopedi Sahabat\t", "Bisnis 101\t\t"));
    private ArrayList<String> lokasiBuku = new ArrayList<String>(Arrays.asList("A", "A", "A", "B", "D", "D", "C"));
    private ArrayList<Integer> kodeBuku = new ArrayList<Integer>(Arrays.asList(132, 123, 127, 636, 101, 420, 727));
    private ArrayList<Integer> stokBuku = new ArrayList<Integer>(Arrays.asList(20, 15, 20, 10, 8, 0, 3));
    private int kode_Int, index;
    private String kode_String;
    private boolean ada;
    private char pilihan;
    private Scanner input = new Scanner(System.in);


    public void lihatBuku(){ // lihat buku
        Function.cls();
        System.out.println("======================= Buku yang tersedia di perpustakaan ======================");
        System.out.println("| No | \tJudul Buku\t\t| Lokasi \t| Kode Buku\t| Stok Buku\t|");
        System.out.println("=".repeat(81));
        for (int i = 0; i < namaBuku.size(); i++){
            System.out.println("| "+ String.format("%d", i+1) + "  | " + this.namaBuku.get(i) + "| " + "Blok " + this.lokasiBuku.get(i) + "\t| " + this.kodeBuku.get(i) + "\t\t| " + this.stokBuku.get(i) + "\t\t|");
        }
        System.out.println("=".repeat(81));
    }

    public void pinjamBuku(Pengunjung pengunjung){
        Function.cls();
        System.out.println("============= Peminjaman Buku ===============");
        System.out.print("Masukkan kode buku yang ingin dipinjam: ");
        this.kode_String = input.next();
        if(!Function.checkNum(this.kode_String)){ // cek angka atau bukan
            System.out.println("Input invalid!");
            Function.sleep(2);
            return; // kalau bukan kasih tau input invalid dan return / balik ke menu
        }

        this.kode_Int = Integer.parseInt(this.kode_String); // lanjut parse ke intger
        for(int i = 0; i < this.kodeBuku.size(); i++){ // cari kodenya
            if(this.kodeBuku.get(i).equals(this.kode_Int)){
                this.index = i;
                this.ada = true;
                break;
            }
        }

        if(!this.ada){ // jika ga ada kodenya
            System.out.println("\nTidak ditemukan buku dengan kode " + this.kode_Int);
            Function.sleep(2);
            return;
        }
        // kalau ada
        System.out.println("\nDitemukan buku dengan kode [" + this.kode_Int + "]");
        System.out.println("Judul buku\t: " + this.namaBuku.get(this.index));
        System.out.println("Lokasi buku\t: Rak " + this.lokasiBuku.get(this.index));
        System.out.println("Stok buku\t: " + this.stokBuku.get(this.index));

        if(this.stokBuku.get(this.index) < 1){ // jika kosong
            System.out.println("Mohon maaf, buku tidak dapat dipinjam karena stoknya kosong!");
            Function.sleep(4);
            return;
        }

        do { // inputan akhir
            System.out.print("Apakah anda yakin ingin meminjam buku ini? (Y/N): ");
            this.pilihan = input.next().charAt(0);
        } while (Character.toLowerCase(this.pilihan) != 'y' && Character.toLowerCase(this.pilihan) != 'n');
        

        if(Character.toLowerCase(this.pilihan) == 'y'){ // kalau jadi meminjam
            System.out.println("Peminjaman berhasil! Harap kembalikan buku paling lama dalam waktu 2 minggu");
            this.stokBuku.set(this.index, this.stokBuku.get(this.index) - 1); // Disimpan history peminjamannya
            pengunjung.groupPeminjaman.get(pengunjung.index).add(String.format("%s| %s\t| %s", this.namaBuku.get(this.index), Function.getDate(), this.kodeBuku.get(this.index)));
           
        } else { // kalau tidak jadi
            System.out.println("Anda tidak jadi meminjam..");
        }

        Function.sleep(4);
    }

    private static void cetakPinjaman (Pengunjung pengunjung){ // cetak pinjaman
        System.out.println("========================= Buku Yang Anda Pinjam =========================");
        System.out.println("| No | \tJudul Buku\t\t| Tanggal Meminjam\t| Kode Buku\t| ");
        System.out.println("=".repeat(73));
        for (int i = 0; i < pengunjung.groupPeminjaman.get(pengunjung.index).size(); i++){
            System.out.println("| "+ String.format("%d", i+1) + "  | " + pengunjung.groupPeminjaman.get(pengunjung.index).get(i) + "\t\t|");
        }

        System.out.println("=".repeat(73));
    }

    public void cekPinjaman(Pengunjung pengunjung){ // cek pinjaman
        Function.cls();
        if(pengunjung.groupPeminjaman.get(pengunjung.index).size() == 0){ // jika masih kosong
            System.out.println("Anda belum pernah meminjam buku");
            return;
        }
        Perpustakaan.cetakPinjaman(pengunjung); // print pinjamannya
    }

    public void kembalikanBuku(Pengunjung pengunjung){
        Function.cls();
        if(pengunjung.groupPeminjaman.get(pengunjung.index).size() == 0){
            System.out.println("Anda belum pernah meminjam buku"); // jika masih kosong
            return;
        }
        Perpustakaan.cetakPinjaman(pengunjung); // print pinjamannya
        System.out.print("Anda ingin mengembalikan buku nomor berapa?: ");
        this.pilihan = input.next().charAt(0);
        // cek inputan bener apa ga, yg pertama cek minus, yg kedua cek lebih dari jumlah array atau tidak
        if(Character.getNumericValue(this.pilihan) - 1 < 0 || Character.getNumericValue(this.pilihan) > pengunjung.groupPeminjaman.get(pengunjung.index).size()){
            System.out.println("Pilihan invalid!");
            return;
        }
        
        for(int i = 0; i < this.stokBuku.size(); i++){ // Balikin stok
            if(this.kodeBuku.get(i) == Integer.parseInt(pengunjung.groupPeminjaman.get(pengunjung.index)
            .get(Character.getNumericValue(this.pilihan - 1)).substring(pengunjung.groupPeminjaman.get(pengunjung.index)
            .get(Character.getNumericValue(this.pilihan - 1)).length() - 3))){ // Ini cek 3 last digit, kode buku sengaja ditaro diakhir biar gampang diceknya, kalau ga diakhir bisa cek pakai regex sebenarnya
                this.stokBuku.set(i, this.stokBuku.get(i) + 1); // stok buku +1
            }
        }
        pengunjung.groupPeminjaman.get(pengunjung.index).remove(Character.getNumericValue(this.pilihan) - 1); // hapus dari array pengunjung

        System.out.println("Terimakasih telah mengembalikan buku yang anda pinjam.");
        Function.sleep(2);
    }
}