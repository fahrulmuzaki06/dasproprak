import java.util.Scanner;
public class ifelseCetakKRS14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Masukkan semester saat ini: ");
        int semester = sc.nextInt();

        if (semester == 1) {
            System.out.println("KRS SEMESTER 1 DITAMPILKAN");
        } else if (semester == 2) {
            System.out.println("KRS SEMESTER 2 DITAMPILKAN");
        } else if (semester == 3) {
            System.out.println("KRS SEMESTER 3 DITAMPILKAN");
        } else if (semester == 4) {
            System.out.println("KRS SEMESTER 4 DITAMPILKAN");
        } else if (semester == 5) {
            System.out.println("KRS SEMESTER 5 DITAMPILKAN");
        } else if (semester == 6) {
            System.out.println("KRS SEMESTER 6 DITAMPILKAN");
        } else if (semester == 7) {
            System.out.println("KRS SEMESTER 7 DITAMPILKAN");
        } else if (semester == 8) {
            System.out.println("KRS SEMESTER 8 DITAMPILKAN");
        } else {
            System.out.println("SEMESTER TIDAK VALID");
        }

        sc.close();
    }
}
