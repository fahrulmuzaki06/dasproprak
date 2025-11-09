import java.util.Scanner;
public class searchnilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlMhs = sc.nextInt();
        
        int[] arrNilai = new int[jmlMhs];
        
        for (int i = 1; i <= arrNilai.length; i++){
            System.out.print("Masukkan Nilai Mahasiswa Ke-"+i+" : ");
            arrNilai[i - 1] = sc.nextInt();
        }

        System.out.print("Masukkan Nilai Yang Ingin Di Cari : ");
        int key = sc.nextInt();

        int hasil = -1 ;
        for (int i = 1; i <= arrNilai.length; i++){
            if (arrNilai[i - 1] == key){
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil != -1){
            System.out.print("Nilai "+key+" Ketemu, Merupakan nilai Mahasiswa ke-"+hasil);
        }
        else {
            System.out.println("Nilai Yang Dicari Tidak Ditemukan");
        }

        sc.close();

        
    }
    
}
