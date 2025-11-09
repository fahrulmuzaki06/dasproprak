
import java.util.Scanner;
public class arraynilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] NilaiAkhir = new int [10];
        for (int i = 0; i < NilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+" : ");
            NilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < NilaiAkhir.length; i++) {
            if (NilaiAkhir[i] > 70){
            System.out.println("Mahasiswa ke-"+i+" Lulus!");
            }
            else {
                System.out.println("Mahasiswa ke-"+i+ " Tidak Lulus!");
            }
        }

    
    sc.close();

    }
    
}
