package bangunDatar;

public class Lingkaran {
    private double luas, keliling;

    public double hitungLuas(double x){
        this.luas = Math.PI * x * x;
        return this.luas;
    }

    public double hitungKeliling(double x){
        this.keliling = 2 * Math.PI * x;
        return this.keliling;
    }

    public static void info(){
        System.out.println("Kelas ini berisi rumus untuk menghitung luas dan keliling lingkaran");
    }
}
