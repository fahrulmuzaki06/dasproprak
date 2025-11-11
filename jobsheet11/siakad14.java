import java.util.Scanner;
public class siakad14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] nilai = new int [4][3];

        for (int i = 0; i < nilai.length; i++){
            System.out.println("Input Nilai Mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++){
                System.out.print("Nilai Mata Kuliah " + (j+1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];

            }
            System.out.println("Nilai Rata-Rata: " + totalPerSiswa/3);
        }

        sc.close();
    }
    
}
