package modul1;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class codelab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n//INPUT\n");
        System.out.print("Masukan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukan Jenis Kelamin (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = jenisKelaminInput.equals("p")
                ? "Perempuan" : "Laki-Laki";

        System.out.print("Masukan Tanggal Lahir (yyyy-mm-dd): ");
        String tanggalLahirInput = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        LocalDate tanggaSekarang = LocalDate.now();
        Period periode = Period.between(tanggalLahir, tanggaSekarang);
        int umur = periode.getYears();

        System.out.println("\n//OUTPUT\n");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
        System.out.println("Umur : " + umur + "Tahun");

        scanner.close();
    }

}