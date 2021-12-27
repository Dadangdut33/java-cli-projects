import bangunDatar.Persegi;
import bangunDatar.Lingkaran;
import bangunRuang.Kubus;
import bangunRuang.Bola;

public class Run {
    public static void main(String[] args) {
        Persegi.info();
        Persegi persegi = new Persegi();
        System.out.println("Luas adalah: " + persegi.hitungLuas(4));
        System.out.println("Keliling adalah: " + persegi.hitungKeliling(4));

        System.out.println();

        Lingkaran.info();
        Lingkaran lingkaran = new Lingkaran();
        System.out.println("Luas adalah: " + String.format("%.2f", lingkaran.hitungLuas(7)));
        System.out.println("Keliling adalah: " + String.format("%.2f", lingkaran.hitungKeliling(7)));

        System.out.println();

        Kubus.info();
        Kubus kubus = new Kubus();
        System.out.println("Luas adalah: " + kubus.hitungLuas(4));
        System.out.println("Volume adalah: " + kubus.hitungVolume(4));

        System.out.println();

        Bola.info();
        Bola bola = new Bola();
        System.out.println("Luas adalah: " + String.format("%.2f", bola.hitungLuas(7)));
        System.out.println("Volume adalah: " + String.format("%.2f", bola.hitungVolume(7)));
    }
}