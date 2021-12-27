import java.lang.Math;
import java.util.Scanner;

public class No4_AkarKuadrat {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Program Mencari Akar Persamaan Kuadrat===");
    
        // Input a
        System.out.print("Masukkan nilai a: ");
        double a = input.nextDouble();

        // Input b
        System.out.print("Masukkan nilai b: ");
        double b = input.nextDouble();

        // Input c
        System.out.print("Masukkan nilai c: ");
        double c = input.nextDouble();
    
        // Proses data
        // Diskriminan
        double diskriminan =  (b * b) - (4 * a *c);

        // Jika diskriminan < 0
        if (diskriminan < 0){
            System.out.println("Akar-akar imaginer");
        } else {
            // Jadi array
            double akar1 =  ((-b + Math.sqrt(diskriminan)) / (2 * a));
            double akar2 =  ((-b - Math.sqrt(diskriminan)) / (2 * a));


            System.out.printf("Diperoleh akar-akar persamaan kuadrat berupa\nAkar 1: %.2f\nAkar 2: %.2f", akar1, akar2);
        }

        input.close();
    }
}
