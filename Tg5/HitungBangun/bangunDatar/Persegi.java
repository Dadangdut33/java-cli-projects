package bangunDatar;

public class Persegi {
    private double luas, keliling;

    public double hitungLuas(double x){
        this.luas = x * x;
        return this.luas;
    }

    public double hitungKeliling(double x){
        this.keliling = x * 4;
        return this.keliling;
    }

    public static void info(){
        System.out.println("Kelas ini berisi rumus untuk menghitung luas dan keliling persegi");
    }
}
