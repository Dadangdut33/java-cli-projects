import perpustakaan.*; // import package
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Bikin scanner dan instantiate class
        Scanner input = new Scanner(System.in);
        Pengunjung pengunjung = new Pengunjung();
        Perpustakaan perpustakaan = new Perpustakaan();
        // pengunjung.initializeArr();
        
        char pilihanMenu, pilihanMenuDalam, kembali;
        do {
            Function.cls();
            System.out.println("============= Menu Perpustakaan ===============");
            System.out.println("Pilihan:\n1. Daftar\n2. Login\n3. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilihanMenu = input.next().charAt(0);
            switch (pilihanMenu) {
                case '1':
                    pengunjung.daftar();
                    break;
            
                case '2':
                    pengunjung.login();
                    if(!pengunjung.loginSukses){
                        break;
                    }

                    do {
                        Function.cls();
                        pengunjung.lihatInfo();
                        System.out.println("============= Menu Pilihan ===============");
                        System.out.println("Pilihan:\n1. Ganti Password\n2. Lihat Daftar Buku\n3. Pinjam Buku\n4. Cek Pinjaman\n5. Kembalikan Buku\n6. Kembali ke menu awal");
                        System.out.print("Masukkan pilihan anda: ");
                        pilihanMenuDalam = input.next().charAt(0);
                        switch (pilihanMenuDalam) {
                            case '1':
                                pengunjung.gantiPassword();
                                break;
                            case '2':
                                do {
                                    perpustakaan.lihatBuku();
                                    System.out.print("Ketik Y untuk kembali ke menu: ");
                                    kembali = input.next().charAt(0);
                                } while (Character.toLowerCase(kembali) != 'y');
                                break;
                            case '3':
                                perpustakaan.pinjamBuku(pengunjung);

                                break;
                            case '4':
                                do {
                                    perpustakaan.cekPinjaman(pengunjung);
                                    System.out.print("Ketik Y untuk kembali ke menu: ");
                                    kembali = input.next().charAt(0);
                                } while (Character.toLowerCase(kembali) != 'y');
                                break;
                            case '5':
                                perpustakaan.kembalikanBuku(pengunjung);
                                Function.sleep(2);
                                break;

                            case '6':
                                System.out.println("Kembali ke menu awal...");
                                Function.sleep(0.5);
                                break;
                        
                            default:
                                System.out.println("Pilihan invalid!");
                                Function.sleep(1);
                                break;
                        }
                    } while (pilihanMenuDalam != '6');

                    break;

                case '3':
                    System.out.println("Terimakasih telah menggunakan program ini");
                    Function.sleep(1);
                    break;

                default:
                    System.out.println("Pilihan invalid!");
                    Function.sleep(1);
                    break;
            }

        } while (pilihanMenu != '3');
        input.close();
    }
}
