package temperature;

public class Celcius {
    private double k, f, r;
    public Celcius(){
        System.out.println("=".repeat(10) + " Konversi Celcius " + "=".repeat(10));
        System.out.println("Pilihan menu: ");
        System.out.println("1. Konversi Celcius ke Fahrenheit\n2. Konversi Celcius ke Reamur\n3. Konversi Celcius ke Kelvin\n4. Konversi Celcius ke Semua Skala\n5. Kembali ke menu awal");
        System.out.print("Input menu: ");
    }

    public double celciusToFahrenheit(double c){
        this.f = (c*9/5)+32;
        
        return this.f;
    }
    
    public double celciusToReamur(double c){
        this.r = c*4/5;

        return this.r;
    }
    
    public double celciusToKelvin(double c){
        this.k = c + 273.16;
        
        return this.k;
    }
}
