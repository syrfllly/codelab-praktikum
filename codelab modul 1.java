import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;

public class codelab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nama anda: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan jenis kelamin L/P: ");
        String jeniskelamininput = input.nextLine();
        String jeniskelamin = jeniskelamininput.equalsIgnoreCase("L") ? "laki-laki" : "perempuan";

       
        System.out.print("Masukkan tanggal lahhir (YYYY-MM-DD): ");
        String tanggallahirstr = input.nextLine();
        LocalDate tanggallahir = LocalDate.parse(tanggallahirstr);

        LocalDate tanggalsekarang = LocalDate.now();
        Period umur = Period.between(tanggallahir, tanggalsekarang);


        System.out.println("Anda memasukkan teks: " + nama);
        System.out.println("Anda memasukkan angka: " + jeniskelamin);
        System.out.println("anda memasukan umur: " + umur.getYears() + " tahun " + umur.getMonths() + " bulan");

        input.close();
    }

}
