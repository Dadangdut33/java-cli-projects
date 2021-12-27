package perpustakaan;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Function {
    public static void sleep(double second){ // Alternative untuk getch
        int time = (int) second * 1000;
        try {
            Thread.sleep(time);
        }
        catch(InterruptedException ex){        
            Thread.currentThread().interrupt();
        }
    }

    public static void cls(){ // clear screen
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {}
    }

    public static boolean checkNum(String x){ // Cek apakah ini inputan berupa string isinya angka atau bukan
        boolean isNumber;
        try {
            Integer.parseInt(x);
            isNumber = true;
            return isNumber;
        } catch (Exception e){
            isNumber = false;
            return isNumber;
        }
    }

    public static String getDate(){ // dapat tanggal yg sudah diformat
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date date = new Date();
        return formatDate.format(date);
    }
}
