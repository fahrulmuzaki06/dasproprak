import java.util.Scanner;
public class ifCetakKRS14 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Cetak KRS ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");

        boolean uktLunas = input.nextBoolean(); 

        if (uktLunas) { 
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        }   else {
            System.out.println("Silakan Lunasi UKT terlebih dahulu agar bisa mencetak KRS.");
        }

        input.close();
    }
}