import java.util.Scanner;
public class nilaikelompok14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int nilai;
        float totalNilai;
        float rataNilai;
        float rataTertinggi = 0;
        int kelompokTertinggi = 0;

        while (i <= 6){
            System.out.println("Kelompok " + i);
            totalNilai = 0;
            for (int j = 1; j <= 5; j++){
                System.out.print("Nilai dari kelompok penilai " + j + " : ");
                nilai = sc.nextInt();
                totalNilai = totalNilai + nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata-rata nilai kelompok " + i + " : " + rataNilai);

            if (rataNilai > rataTertinggi){
                rataTertinggi = rataNilai;
                kelompokTertinggi = i;
            }
            i++;
        }

        System.out.println("\nKelompok dengan rata-rata tertinggi adalah kelompok " + kelompokTertinggi + 
        " dengan nilai rata-rata " + rataTertinggi);
        sc.close();
    }
}