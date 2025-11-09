import java.util.Scanner;

public class kopisenja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Cabang Kafe: ");
        int jumlahCabang = input.nextInt();

        int totalPelangganSemuaCabang = 0;
        int totalItemSemuaCabang = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah Pelanggan: "); 
            int jumlahPelanggan = input.nextInt();

            int totalItemPerCabang = 0;

            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.print("  Jumlah item yang dipesan oleh pelanggan ke-" + j + ": ");
                int item = input.nextInt();
                totalItemPerCabang += item;
            }

            System.out.println("Item Terjual Di Cabang" + i + ": " + totalItemPerCabang);

            totalPelangganSemuaCabang += jumlahPelanggan;
            totalItemSemuaCabang += totalItemPerCabang;
        }

        System.out.println("\n=== Ringkasan Penjualan Hari Ini ===");
        System.out.println("Total Seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelangganSemuaCabang + " Orang");
        System.out.println("Item Terjual: " + totalItemSemuaCabang + " Item");

        input.close();
    }
}