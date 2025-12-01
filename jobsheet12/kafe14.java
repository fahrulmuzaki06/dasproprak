import java.util.Scanner;
public class kafe14 {
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember){
            System.out.println("Anda Adalah Member");
        }

        System.out.println("====== Menu Resto Kafe ======");
        System.out.println("1.  Kopi Hitam  -   Rp 15,000");
        System.out.println("2.  Cappucino   -   Rp 20,000");
        System.out.println("3.  Latte       -   Rp 22,000");
        System.out.println("4.  Teh Tarik   -   Rp 12,000");
        System.out.println("5.  Roti Bakar  -   Rp 10,000");
        System.out.println("6.  Mie Gorang  -   Rp 18,000");
        System.out.println("=============================");
        System.out.println("Silahkan Pilih Menu Yang Anda Inginkan");

        System.out.print("\nMasukkan Nomor Menu Yang Ingin Anda Pesan   : ");
        int pilihMenu = sc.nextInt();
        System.out.print("Masukkan Jumlah Item Yang Ingin Dipesan     : ");
        int banyakItem = sc.nextInt();

        int totalHarga = hitungTotalHarga(pilihMenu, banyakItem);

        double diskon = 0;

        if (kodePromo.equalsIgnoreCase("DISKON50")){
            diskon = 0.50;
            System.out.println("Dapat Diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("DISKON30")){
            diskon = 0.30;
            System.out.println("Dapatkan Diskon 30%");
        } else {
            System.out.println("Kode Invalid");
        }

        double totalAkhir = totalHarga - (totalHarga * diskon);

        System.out.println("Total Harga Untuk Pesanan Anda              : Rp " + totalHarga);
        System.out.println("Total Harga Setelah Potongan                : Rp " + totalAkhir);

        sc.close();
    }
    public static void main(String[] args) {
        Menu("Budi", true, "DISKON30");
    }
    public static int hitungTotalHarga(int pilihMenu, int banyakItem){
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihMenu - 1] * banyakItem;
        return hargaTotal;

        
    }

}  
