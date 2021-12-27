package temperature;

public class Kelvin {
    private double r, c, f;
    public Kelvin(){
        System.out.println("=".repeat(10) + " Konversi Kelvin " + "=".repeat(10));
        System.out.println("Pilihan menu: ");
        System.out.println("1. Konversi Kelvin ke Celcius\n2. Konversi Kelvin ke Fahrenheit\n3. Konversi Kelvin ke Reamur\n4. Konversi Kelvin ke Semua Skala\n5. Kembali ke menu awal");
        System.out.print("Input menu: ");
    }

    public double kelvinToCelcius(double k){
        this.c = k-273.16;
        return this.c;
    }
    
    public double kelvinToFahrenheit(double k){
        this.f = (k-273.16)*9/5+32;
        return this.f;
    }

    public double kelvinToReamur(double k){
        this.r = (k-273.16)*4/5;
        return this.r;
    }
}
