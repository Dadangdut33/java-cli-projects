import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double panjang, lebar, luas, keliling;
        
        System.out.println("Hitung persegi panjang");
        System.out.print("Masukkan panjang: ");
        panjang = scan.nextDouble();
        System.out.print("Masukkan lebar: ");
        lebar = scan.nextDouble();

            try {
                cekAngka(panjang);
                cekAngka(lebar);
                luas = panjang * lebar;
                
                System.out.println("Diperoleh luas " + luas);
            } catch (CekInput e) {
                System.out.println("Error menghitung luas");
                System.out.println(e);
            }

            try {
                cekAngka(panjang);
                cekAngka(lebar);
                keliling = 2 * (panjang + lebar);
                
                System.out.println("Diperoleh keliling " + keliling);
            } catch (CekInput e) {
                System.out.println("Error menghitung keliling");
                System.out.println(e);
            }
    }
    
    static void cekAngka(double angka) throws CekInput{
        if (angka < 1) {
            throw new CekInput("Angka invalid!");
        }
    }
    
} 


class CekInput extends Throwable { // membuat exception
    CekInput(String angka) {
        super(angka);
    }

    public static void main(String[] args) {
        System.out.println("TEST");
    }

}