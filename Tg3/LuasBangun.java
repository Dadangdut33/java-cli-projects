import java.util.Scanner;
import java.lang.Math;

public class LuasBangun {
    public static void main(String[] args) {
        float jariJari, panjang, lebar, alas, tinggi;

        Scanner input = new Scanner(System.in);
        System.out.println("===Menu Pilihan===");
        System.out.println("1. Lingkaran\n2. Persegi Panjang\n3. Jajar Genjang\n");
        System.out.print("Masukkan pilihan anda: ");
        char pilih = input.next().charAt(0);

        switch (pilih) {
            case '1':
                System.out.println("=".repeat(24));
                System.out.print("Masukkan panjang jari-jari lingkaran : ");
                jariJari = input.nextFloat();

                System.out.println("=".repeat(24));
                System.out.printf("Luas lingkaran adalah %.2f\n", luasLingkaran(jariJari));
                System.out.printf("Keliling lingkaran adalah %.2f", kelilingLingkaran(jariJari));
                break;

            case '2':
                System.out.println("=".repeat(24));
                System.out.print("Masukkan panjang persegi panjang : ");
                panjang = input.nextFloat();

                System.out.print("Masukkan lebar persegi panjang : ");
                lebar = input.nextFloat();

                System.out.println("=".repeat(24));
                System.out.printf("Luas lingkaran adalah %.2f\n", luasPersegiPanjang(panjang, lebar));
                System.out.printf("Keliling lingkaran adalah %.2f", kelilingPersegiPanjang(panjang, lebar));
                break;

            case '3':
                System.out.println("=".repeat(24));
                System.out.print("Masukkan panjang alas jajar genjang : ");
                alas = input.nextFloat();

                System.out.print("Masukkan panjang tinggi jajar genjang : ");
                tinggi = input.nextFloat();

                System.out.println("=".repeat(24));
                System.out.printf("Luas lingkaran adalah %.2f\n", luasJajarGenjang(alas, tinggi));
                System.out.printf("Keliling lingkaran adalah %.2f", kelilingJajarGenjang(alas, tinggi));
                break;

            default:
                System.out.println("Pilihan Invalid!");
                break;
        }

        input.close();
    }

    static float luasLingkaran(float r) {
        float pi = (float) 3.14;
        float luas = pi * r * r;

        return luas;
    }

    static float kelilingLingkaran(float r) {
        float pi = (float) 3.14;
        float keliling = 2 * pi * r;

        return keliling;
    }

    static float luasPersegiPanjang(float panjang, float lebar) {
        float luas = panjang * lebar;

        return luas;
    }

    static float kelilingPersegiPanjang(float panjang, float lebar) {
        float keliling = 2 * (panjang + lebar);

        return keliling;
    }

    static float luasJajarGenjang(float alas, float tinggi) {
        float luas = alas * tinggi;

        return luas;
    }

    static float kelilingJajarGenjang(float alas, float tinggi) {
        float sisiMiring = (float) Math.sqrt((alas * alas) + (tinggi * tinggi));
        float keliling = 2 * (alas + sisiMiring);

        return keliling;
    }

}
