import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Main function = new Main();
        Tiket tiket = new Tiket();
        DataPengguna User = new DataPengguna();

        char pilihanMenu, pilihanMenuDalam, kembali;
        do {
            function.cls();
            System.out.println("====Menu Mesin Tiket Pesawat====");
            System.out.println("Pilihan:\n1. Buat akun\n2. Login\n3. Keluar");
            System.out.print("Masukkan pilihan anda: ");
            pilihanMenu = input.next().charAt(0);
            switch (pilihanMenu) {
                case '1':
                    function.cls();
                    if(User.akunBaru) { // Jika belum ada akun
                        User.daftarBaru();
                        function.sleep(2);
                        break;
                    } else { // Jika sudah ada akun
                        System.out.println("Anda sudah memiliki akun!");
                        function.sleep(2);
                        break;
                    }
                case '2':
                    function.cls();
                    if(User.akunBaru){ // Jika belum ada akun
                        System.out.println("Anda harus mendaftarkan akun terlebih dahulu");
                        function.sleep(2);
                        break;
                    }

                    User.login();
                    if(!User.loginSukses){ // Jika login gagal berhenti, balik ke menu awal
                        break;
                    }
                    do { // Jika berhasil lanjut
                        function.cls();
                        User.cetakDataPengguna(); // Cetak data pengguna
                        System.out.print("Menu pilihan\t:\n1. Lihat Daftar Tiket\n2. Beli tiket\n3. Lihat pembelian\n4. Kembali ke menu awal\n"); // Menu
                        System.out.print("Masukkan pilihan anda: ");
                        pilihanMenuDalam = input.next().charAt(0);
                        System.out.println("=".repeat(25));
                        switch(pilihanMenuDalam) {
                            case '1':
                                do {
                                    function.cls();
                                    tiket.lihatTiket();
                                    System.out.print("Ketik Y untuk kembali ke menu pengguna: ");
                                    kembali = input.next().charAt(0);
                                } while(Character.toLowerCase(kembali) != 'y');
                            break;

                            case '2':
                                function.cls();
                                tiket.beliTiket(User);
                                
                                System.out.println("=".repeat(50));
                                System.out.println("Akan kembali ke menu dalam 5 detik...");
                                function.sleep(5);

                                break;

                            case '3':
                                do {
                                    function.cls();
                                    tiket.cetakTiket(User);
                                    System.out.print("Ketik Y untuk kembali ke menu pengguna: ");
                                    kembali = input.next().charAt(0);
                                } while(Character.toLowerCase(kembali) != 'y');

                                break;

                            case '4':
                                System.out.println("Kembali ke menu awal...");
                                function.sleep(2);
                                break;
                            default:
                                System.out.println("Pilihan salah!");
                                function.sleep(1);

                                break;
                        }
                    } while(pilihanMenuDalam != '4');
                    break;
                case '3':
                    System.out.println("Anda memilih untuk keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan salah!");
                    function.sleep(1);
                    break;
            }
        } while (pilihanMenu != '3');

        input.close();
    }

    void sleep(int second){ // Alternative for getch
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
    
    boolean checkNum(String x){ // Cek apakah ini inputan berupa string isinya angka atau bukan
        boolean isNumber;
        try {
            Integer.parseInt(x);
            isNumber = true;
            return isNumber;
        } catch (Exception e){
            isNumber = false;
            return isNumber;
        }
    }

    int twoLast(int x){ // Tapi ini kebalik
        int i = 0, sisa = 0, twoLast = 0;
        while (i < 2){
            sisa = x % 10;
            twoLast = twoLast * 10 + sisa;

            x = x / 10;
            i++;
        }
        return twoLast;
    }

    int reverseInt(int x){ // Bikin fungsi buat ngebaliknya lagi
        int sisa = 0, reversed = 0;
        while (x != 0){
            sisa = x % 10;
            reversed = reversed * 10 + sisa;

            x = x / 10;
        }
        return reversed;
    }
}


    // old idea
    // int parseToInt(String x){ // Parseint tanpa error (program berhenti)
    //     int result;
    //     try{
    //         result = Integer.parseInt(x);
    //         return result;
    //     } catch(Exception e){
    //         return -3333;
    //     }
    // }