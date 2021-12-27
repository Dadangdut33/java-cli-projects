import temperature.*;
import function.Function;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char pilihan, pilihanDalam;
        String convert;
        do {
            Function.cls();
            System.out.println("=".repeat(10) + " Aplikasi Konversi Suhu " + "=".repeat(10));
            System.out.println("Pilihan Menu: ");
            System.out.println("1. Konversi Celcius\n2. Konversi Fahrenheit\n3. Konversi Reamur\n4. Konversi Kelvin\n5. Keluar");
            System.out.print("Input menu: ");
            pilihan = input.next().charAt(0);
            switch (pilihan) {
                case '1':
                    do {
                        Function.cls();
                        Celcius celcius = new Celcius();
                        pilihanDalam = input.next().charAt(0);
                        switch (pilihanDalam) {
                            case '1':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam celcius: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "°C ke °F");
                                    System.out.printf("Diperoleh %.2f °F\n", celcius.celciusToKelvin(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                input.nextLine();
                                input.nextLine();
                                break;

                            case '2':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Celcius: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "°C ke °R");
                                    System.out.printf("Diperoleh %.2f °R\n", celcius.celciusToKelvin(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '3':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Celcius: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "°C ke K");
                                    System.out.printf("Diperoleh %.2f K\n", celcius.celciusToKelvin(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '4':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Celcius: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(50));
                                    System.out.println("Konversi " + convert + "°C ke Semua Skala");
                                    System.out.printf("Diperoleh %.2f °F, %.2f °R, %.2f K\n", celcius.celciusToFahrenheit(Double.parseDouble(convert)), celcius.celciusToReamur(Double.parseDouble(convert)), celcius.celciusToKelvin(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(50));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(7);
                                break;
                        
                            case '5':
                                System.out.println("Kembali ke menu awal...");
                                Function.sleep(1);
                                break;

                            default:
                                System.out.println("Pilihan invalid!");
                                Function.sleep(2);
                                break;
                        }
                    } while(pilihanDalam != '5');

                    break;
            
                case '2':
                    do {
                        Function.cls();
                        Fahrenheit fahrenheit = new Fahrenheit();
                        pilihanDalam = input.next().charAt(0);
                        switch (pilihanDalam) {
                            case '1':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "°F ke °C");
                                    System.out.printf("Diperoleh %.2f °F\n", fahrenheit.fahrenheitToCelcius(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '2':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "°F ke °R");
                                    System.out.printf("Diperoleh %.2f °R\n", fahrenheit.fahrenheitToReamur(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '3':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "°F ke K");
                                    System.out.printf("Diperoleh %.2f K\n", fahrenheit.fahrenheitToKelvin(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '4':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Fahrenheit: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(50));
                                    System.out.println("Konversi " + convert + "°F ke Semua Skala");
                                    System.out.printf("Diperoleh %.2f °C, %.2f °R, %.2f K\n", fahrenheit.fahrenheitToCelcius(Double.parseDouble(convert)), fahrenheit.fahrenheitToReamur(Double.parseDouble(convert)), fahrenheit.fahrenheitToKelvin(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(50));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(7);
                                break;
                        
                            case '5':
                                System.out.println("Kembali ke menu awal...");
                                Function.sleep(1);
                                break;

                            default:
                                System.out.println("Pilihan invalid!");
                                Function.sleep(2);
                                break;
                        }
                    } while(pilihanDalam != '5');

                    break;

                case '3':
                    do {
                        Function.cls();
                        Reamur reamur = new Reamur();
                        pilihanDalam = input.next().charAt(0);
                        switch (pilihanDalam) {
                            case '1':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Reamur: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "°R ke °C");
                                    System.out.printf("Diperoleh %.2f °C\n", reamur.reamurToCelcius(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '2':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Reamur: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "°R ke °F");
                                    System.out.printf("Diperoleh %.2f °F\n", reamur.reamurToFahrenheit(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '3':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Reamur: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "°R ke K");
                                    System.out.printf("Diperoleh %.2f K\n", reamur.reamurToKelvin(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '4':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Reamur: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(50));
                                    System.out.println("Konversi " + convert + "°R ke Semua Skala");
                                    System.out.printf("Diperoleh %.2f °C, %.2f °F, %.2f K\n", reamur.reamurToCelcius(Double.parseDouble(convert)), reamur.reamurToFahrenheit(Double.parseDouble(convert)), reamur.reamurToKelvin(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(50));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(7);
                                break;
                        
                            case '5':
                                System.out.println("Kembali ke menu awal...");
                                Function.sleep(1);
                                break;

                            default:
                                System.out.println("Pilihan invalid!");
                                Function.sleep(2);
                                break;
                        }
                    } while(pilihanDalam != '5');

                    break;

                case '4':
                    do {
                        Function.cls();
                        Kelvin kelvin = new Kelvin();
                        pilihanDalam = input.next().charAt(0);
                        switch (pilihanDalam) {
                            case '1':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Kelvin: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "K ke °C");
                                    System.out.printf("Diperoleh %.2f °C\n", kelvin.kelvinToCelcius(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '2':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Kelvin: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "K ke °F");
                                    System.out.printf("Diperoleh %.2f °F\n", kelvin.kelvinToFahrenheit(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '3':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Kelvin: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(20));
                                    System.out.println("Konversi " + convert + "K ke °R");
                                    System.out.printf("Diperoleh %.2f °R\n", kelvin.kelvinToReamur(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(20));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(4);
                                break;

                            case '4':
                                Function.cls();
                                System.out.print("Masukkan suhu dalam Kelvin: ");
                                convert = input.next();                                
                                if(Function.checkNum(convert)) {
                                    Function.cls();
                                    System.out.println("=".repeat(50));
                                    System.out.println("Konversi " + convert + "K ke Semua Skala");
                                    System.out.printf("Diperoleh %.2f °C, %.2f °F, %.2f °R\n", kelvin.kelvinToCelcius(Double.parseDouble(convert)), kelvin.kelvinToFahrenheit(Double.parseDouble(convert)), kelvin.kelvinToReamur(Double.parseDouble(convert)));
                                    System.out.println("=".repeat(50));
                                } else {
                                    System.out.println("Suhu yang dimasukkan invalid!");
                                }

                                Function.sleep(7);
                                break;
                        
                            case '5':
                                System.out.println("Kembali ke menu awal...");
                                Function.sleep(1);
                                break;

                            default:
                                System.out.println("Pilihan invalid!");
                                Function.sleep(2);
                                break;
                        }
                    } while(pilihanDalam != '5');

                    break;

                case '5':
                    System.out.println("Terimakasih telah menggunakan program ini.");
                    Function.sleep(2);
                    break;
                default:
                    System.out.println("Pilihan invalid!");
                    Function.sleep(2);
                    break;
            }
        } while (pilihan != '5');
        
        input.close();
    }
}