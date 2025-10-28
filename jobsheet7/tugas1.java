import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahTiket, totalTerjual = 0;
        double totalPendapatan = 0;
        final int hargaTiket = 50000;
        String lanjut = "n";

        do {
            System.out.print("Masukkan Jumlah Tiket Yang Dibeli : ");
            jumlahTiket = input.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Jumlah Tiket Tidak Valid");
                continue;
            }

            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;

            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            totalHarga -=totalHarga * diskon;

            System.out.println("Total Harga Yang Harus Dibayar : " + totalHarga);

            totalTerjual += jumlahTiket;
            totalPendapatan += totalHarga;

            System.out.print("Apakah ada pembeli lagi? (y/n) :");
            lanjut = input.next();

            if (lanjut.equalsIgnoreCase("n")); {
                break;
            }      

        } while(true);

        System.out.println("Total Tiket Terjjual : " + totalTerjual);
        System.out.println("Total pendapatan : " + totalPendapatan);

        input.close();
    }
}
