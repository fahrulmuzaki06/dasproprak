import java.util.Scanner;
public class Latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("---IZIN MASUK PERPUSTAKAAN---");
        System.out.print("Apakah Membawa Kartu Mahasiswa (true/false) : ");

        boolean kartuMahasiswa = input.nextBoolean();

        System.out.print("Apakah Sudah Registrasi Online (true/false) : ");

        boolean registrasiOnline = input.nextBoolean();

        if (kartuMahasiswa && registrasiOnline) {
            System.out.print("Boleh Masuk Perpustakaan");
        }   else {
            System.out.print("Tidak Boleh Masuk Perpustakaan.");
        }
    input.close();
    }
}