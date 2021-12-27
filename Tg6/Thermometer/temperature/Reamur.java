package temperature;

public class Reamur {
    private double k, c, f;
    public Reamur(){
        System.out.println("=".repeat(10) + " Konversi Reamur " + "=".repeat(10));
        System.out.println("Pilihan menu: ");
        System.out.println("1. Konversi Reamur ke Celcius\n2. Konversi Reamur ke Fahrenheit\n3. Konversi Reamur ke Kelvin\n4. Konversi Reamur ke Semua Skala\n5. Kembali ke menu awal");
        System.out.print("Input menu: ");
    }

    public double reamurToCelcius(double r){
        this.c = r*5/4;
        return this.c;
    }
    
    public double reamurToFahrenheit(double r){
        this.f = (r*9/4)+32;
        return this.f;
    }

    public double reamurToKelvin(double r){
        this.k = (r*5/4)+273.16;
        return this.k;
    }
}
