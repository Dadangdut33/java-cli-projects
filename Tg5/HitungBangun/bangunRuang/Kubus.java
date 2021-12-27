package bangunRuang;

public class Kubus {
    private double volume, luas;

    public double hitungVolume(double x){
        this.volume = x * x * x;
        return this.volume;
    }

    public double hitungLuas(double x){
        this.luas = 6 * (x * x);
        return this.luas;
    }

    public static void info(){
        System.out.println("Kelas ini berisi rumus untuk menghitung volume dan keliling Kubus");
    }
}
