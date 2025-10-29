import java.util.Scanner;
public class tugas2 {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenis, durasi, total = 0;
        
        do {
            System.out.print("Masukkan Jenis Kendaraan (1 = mobil, 2 = motor, 0 = keluar) : ");
            jenis = input.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan Durasi Parkir : ");
                durasi = input.nextInt();

                if (durasi > 5) {
                    total += 12500;
                } else if (jenis == 1) {
                    total += durasi * 3000;
                } else if (jenis == 2) {
                    total += durasi * 2000;
                }

            }
        }while (jenis !=0);

        System.out.print("Total Pembayaran : " + total);

        input.close();
        
    }
}