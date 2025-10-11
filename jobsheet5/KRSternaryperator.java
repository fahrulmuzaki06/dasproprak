import java.util.Scanner;

public class KRSternaryperator { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Cetak KRS ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");

        boolean uktLunas = input.nextBoolean(); 

        String pesan = (uktLunas)
            ? "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA."
            : "Silakan Lunasi UKT terlebih dahulu agar bisa mencetak KRS.";

        System.out.println(pesan);


        input.close();
    }
}