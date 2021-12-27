package temperature;

public class Fahrenheit {
    private double k, c, r;
    public Fahrenheit(){
        System.out.println("=".repeat(10) + " Konversi Fahrenheit " + "=".repeat(10));
        System.out.println("Pilihan menu: ");
        System.out.println("1. Konversi Fahrenheit ke Celcius\n2. Konversi Fahrenheit ke Reamur\n3. Konversi Fahrenheit ke Kelvin\n4. Konversi Fahrenheit ke Semua Skala\n5. Kembali ke menu awal");
        System.out.print("Input menu: ");
    }

    public double fahrenheitToCelcius(double f){
        this.c = (f-32) * 5/9;

        return this.c;
    }
    
    public double fahrenheitToReamur(double f){
        this.r = (f-32) * 4/9;

        return this.r;
    }
    
    public double fahrenheitToKelvin(double f){
        this.k = (f-32)*5/9+273.16;
        
        return this.k;
    }
}
