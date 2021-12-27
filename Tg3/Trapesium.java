import java.util.Scanner;

public class Trapesium {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c, d, t;

        System.out.print("Masukkan panjanga sisi-sisi A : ");
        a = in.nextInt();
        System.out.print("Masukkan panjanga sisi-sisi B : ");
        b = in.nextInt();
        System.out.print("Masukkan panjanga sisi-sisi C : ");
        c = in.nextInt();
        System.out.print("Masukkan panjanga sisi-sisi D : ");
        d = in.nextInt();
        System.out.print("Masukkan panjanga sisi-sisi t : ");
        t = in.nextInt();

        System.out.printf("Luas trapesium adalah %.2f\n", luasTrapesium(a, b, t));
        System.out.printf("Keliling trapesium adalah %.2f", kelilingTrapesium(a, b, c, d));

        in.close();
    }

    static int luasTrapesium(int a, int b, int t) {
        int luas = (a + b * t) / 2;

        return luas;
    }

    static int kelilingTrapesium(int a, int b, int c, int d) {
        int keliling = a + b + c + d;

        return keliling;
    }

}