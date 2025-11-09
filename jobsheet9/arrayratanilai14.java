import java.util.Scanner;
public class arrayratanilai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jmlMhs = sc.nextInt();

        int [] nilaiMhs = new int [jmlMhs];
        int jumlahlulus = 0, jumlahtidaklulus = 0;
        double totallulus = 0, totaltidaklulus = 0;

        for (int i=0; i < nilaiMhs.length; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();

            if (nilaiMhs[i] > 70){
                totallulus += nilaiMhs[i];
                jumlahlulus++;
            }
            else {
                totaltidaklulus += nilaiMhs[i];
                jumlahtidaklulus++;
            }
        }

        double ratalulus = (jumlahlulus > 0) ? totallulus / jumlahlulus : 0;
        double ratatidaklulus =(jumlahtidaklulus > 0) ? totaltidaklulus / jumlahtidaklulus : 0;

        System.out.println("Rata-rata Nilai Lulus :"+ratalulus);
        System.out.println("Rata-rata Nilai Tidak Lulus :"+ratatidaklulus);
        
        sc.close();
    }
    
}
