package perpustakaan;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Pengunjung {
    // Deklarasi
    private ArrayList<String> namaPengguna = new ArrayList<String>();
    private ArrayList<String> password = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<Integer> telepon = new ArrayList<Integer>();
    List<List<String>> groupPeminjaman = new ArrayList<List<String>>(); // 2 dimensional array
    
    private String tempNama, tempPassword, tempAlamat, tempTelepon;
    private Scanner input = new Scanner(System.in);
    int index;

    public boolean loginSukses;

    // public void initializeArr(){ 
    //     for(int i = 0; i < 100; i++){
    //         groupPeminjaman.add(new ArrayList<>());
    //     }
    // }

    public void daftar(){
        // Daftar
        Function.cls();
        System.out.println("============= Daftar Baru ===============");
        System.out.print("Masukkan username : ");
        this.tempNama = input.nextLine();
        this.namaPengguna.add(this.tempNama); // masukkan ke array

        System.out.print("Masukkan password : ");
        this.tempPassword = input.nextLine();
        this.password.add(this.tempPassword); // masukkan ke array
        
        System.out.println("Akun telah terdaftarkan! Silahkan isi biodata anda...");
        Function.sleep(3);

        Function.cls();
        System.out.println("============= Isi Biodata ===============");
        System.out.println("*Input nomor telepon harus berupa angka");
        System.out.print("Alamat\t\t: ");
        this.tempAlamat = input.nextLine();
        this.alamat.add(this.tempAlamat); // masukkan ke array

        do{
            System.out.print("Nomor Telepon\t: "); // Harus angka
            this.tempTelepon = input.nextLine(); // masukkan ke array
        } while (!Function.checkNum(this.tempTelepon));
        
        this.telepon.add(Integer.parseInt(tempTelepon));

        groupPeminjaman.add(new ArrayList<>()); // Inisialisasi array peminjaman
        System.out.println("Data Berhasil Tersimpan!");
        Function.sleep(2);
    }

    public void login(){
        Function.cls();
        System.out.println("============= Login Akun ===============");
        System.out.print("Masukkan nama pengguna\t: ");
        this.tempNama = input.nextLine();
        System.out.print("Masukkan password\t: ");
        this.tempPassword = input.nextLine();
        this.loginSukses = false; 

        for(int i = 0; i < this.namaPengguna.size(); i++){ // cek login
            if(this.tempNama.equals(this.namaPengguna.get(i)) && this.tempPassword.equals(this.password.get(i))){
                System.out.println("Login berhasil!");
                this.loginSukses = true;
                this.index = i;
                Function.sleep(2);
                break;
            } 
        }

        if(!this.loginSukses){ // kalau gagal
            System.out.println("Login gagal, password atau username yang dimasukkan salah! silahkan coba lagi!");
            this.loginSukses = false;
            Function.sleep(3);
        }
    }

    public void gantiPassword(){ // ganti password
        Function.cls();
        System.out.println("============= Ganti Password ===============");
        System.out.print("Masukkan password baru: ");
        this.tempPassword = input.nextLine();

        this.password.set(this.index, this.tempPassword);
        System.out.println("Berhasil mengganti password!");
        Function.sleep(2);
    }

    public void lihatInfo(){ // lihat data
        System.out.println("============= Data Anda ===============");
        System.out.println("Nama Pengguna\t: " + this.namaPengguna.get(this.index));
        System.out.println("Alamat\t\t: " + this.alamat.get(this.index));
        System.out.println("Nomor Telepon:\t: " + this.telepon.get(this.index));
    }
}
