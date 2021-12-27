import java.util.Scanner;

public class No6V2_PalindromeAngka {
    public static void main(String args[]) {
        int length;
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        // Scan input
        System.out.print("Masukan angka yang ingin dicek : ");
        original = in.nextLine();

        // Ujung
        length = original.length() - 1; // Ujung

        // Balik
        for (int i = length; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
            // System.out.println(i + " = reverse + " + original.charAt(i) + " = " + reverse);
        }
        // System.out.println();

        // If sama
        if (original.equals(reverse)) {
            System.out.println(original + " merupakan Angka Palindrome.");
        } else {
            System.out.println(original + " bukan merupakan Angka Palindrome.");
        }
        
        in.close();
    }
}

