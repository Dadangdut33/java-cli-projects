public class Manusia {
    private String nama, alamat, hobi;
    private int umur;
    
    Manusia(String nama, String alamat, String hobi, int umur){
        this.nama = nama;
        this.alamat = alamat;
        this.hobi = hobi;
        this.umur = umur;
    }

    void showInfo(){
        System.out.println("Nama\t: " + this.nama);
        System.out.println("Umur\t: " + this.umur);
        System.out.println("Alamat\t: " + this.alamat);
        System.out.println("Hobi\t: " + this.hobi);
    }

    void gantiAlamat(String alamat){
        this.alamat = alamat;
    }

    void gantiHobi(String hobi){
        this.hobi = hobi;
    }

    void gantiUmur(int umur){
        if(umur <= 0){
            System.out.println("Input invalid!");
        } else {
            this.umur = umur;
        }   
    }

}
