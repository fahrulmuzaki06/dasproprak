import java.util.Scanner;
public class ifganjilgenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("---Cek Bilangan Ganjil/Genap---");
        System.out.print("Masukkan Angka : ");
        int angka = sc.nextInt();

        if (angka %2 == 0) {
            System.out.print("Angka " + angka + " Adalah Genap");
        } else {
            System.out.print("Angka "+ angka + " Adalah Ganjil");
        }
        sc.close();
    }

    
}
