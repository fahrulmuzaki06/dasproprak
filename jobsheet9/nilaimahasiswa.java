import java.util.Scanner;

public class nilaimahasiswa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah Mahasiswa : ");
        int jumlahMhs = sc.nextInt();

        int[] nilai = new int[jumlahMhs];
        int total = 0;

        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Nilai Mahasiswa Ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rata = (double) total / jumlahMhs;

        int tertinggi = nilai[0];
        int terendah = nilai[0];
        for (int i = 1; i < jumlahMhs; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("\nDaftar Nilai Mahasiswa");
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nNilai Tertinggi   : " + tertinggi);
        System.out.println("Nilai Terendah    : " + terendah);
        System.out.println("Rata-rata Nilai   : " + rata);

        sc.close();
    }
}
