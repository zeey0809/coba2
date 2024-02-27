import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;
public class codelab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String NAMA, JenisKelamin, TanggalLahir;

//      Untuk memasukkan data
        System.out.print("Nama : ");
        NAMA = input.nextLine();
        System.out.print("Jenis kelamin (P/L):");
        JenisKelamin = input.nextLine();
        System.out.print("Tanggal lahir (yyyy-mm-dd) :");
        TanggalLahir = input.nextLine();

//      Menghitung Umur
        LocalDate lahir = LocalDate.parse(TanggalLahir);
        LocalDate sekarang = LocalDate.now();
        Period umur = Period.between(lahir, sekarang);

        System.out.println("--Output--");
        System.out.println("Nama : " + NAMA);
        System.out.print("Jenis Kelamin : ");
        if(JenisKelamin.equalsIgnoreCase("P")){
            System.out.println("Perempuan");
        }else{
            System.out.println("Laki-laki");
        }
        System.out.println("Umur Anda : " + umur.getYears() + " Tahun " + umur.getMonths() + " Bulan");
    }
}