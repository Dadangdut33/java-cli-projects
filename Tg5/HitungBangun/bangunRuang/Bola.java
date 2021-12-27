package bangunRuang;

public class Bola {
    private double volume, luas;

    public double hitungVolume(double x){
        this.volume = 4/3 * Math.PI * (x * x);
        return this.volume;
    }

    public double hitungLuas(double x){
        this.luas = 4 * Math.PI * (x * x);
        return this.luas;
    }

    public static void info(){
        System.out.println("Kelas ini berisi rumus untuk menghitung volume dan keliling Bola");
    }
}
