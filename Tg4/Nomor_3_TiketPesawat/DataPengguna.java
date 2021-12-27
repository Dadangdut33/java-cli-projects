import java.util.Scanner;
import java.util.ArrayList;

public class DataPengguna {
    Scanner input = new Scanner(System.in); // Input
    Main function = new Main(); // Ambil function dari main class

    // User
    String username, userPassword;
    String tempUser, tempPassword;
    int uang = 10_000_000; // Uang di set 10jt
    boolean akunBaru = true, loginSukses;
    char opsi;
    // Tiket dibeli
    ArrayList<String> tiketDibeli = new ArrayList<String>();
    
    void login(){
        System.out.println("===Login Akun===");
        System.out.print("Masukkan nama pengguna\t: ");
        this.tempUser = input.nextLine();
        System.out.print("Masukkan password\t: ");
        this.tempPassword = input.nextLine();

        if(this.tempUser.equals(this.username) && this.tempPassword.equals(this.userPassword)){
            System.out.println("Login berhasil!");
            this.loginSukses = true;
            function.sleep(2);
        } else {
            System.out.println("Login gagal, password atau username yang dimasukkan salah! silahkan coba lagi!");
            this.loginSukses = false;
            function.sleep(3);
        }
    }

    void cetakDataPengguna(){
        System.out.println("========Data Customer========");
        System.out.printf("Nama Customer\t: %s\n", this.username);
        System.out.printf("Banyak uang\t: %d\n", this.uang);
        System.out.println("=".repeat(29));
    }

    void daftarBaru(){
        System.out.println("===Daftar Pengguna Baru===");
        System.out.print("Masukkan nama pengguna\t: ");
        this.username = input.nextLine();
        
        System.out.print("Masukkan password\t: ");
        this.userPassword = input.nextLine();
        this.akunBaru = false;

        System.out.println("Akun berhasil terdaftar");
    }
}