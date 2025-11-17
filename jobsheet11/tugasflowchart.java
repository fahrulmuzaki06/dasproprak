import java.util.Scanner;
public class tugasflowchart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[]kota = {"Tokyo", "Osaka", "Sapporo", "Fukuoka", "Naha"};
        int hari = 7;
        double [][] suhu = new double [kota.length][hari];

        for (int i = 0; i < kota.length; i++){
            System.out.println("\nKota " + kota[i]);
            for(int j = 0; j < hari; j++){
                System.out.print("Hari Ke-" + (j+1) + ": ");
                suhu[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Data Suhu 5 Kota 7 Hari");
        for (int i = 0; i < kota.length; i++){
            for (int j = 0; j < hari; j++){
                System.out.print(suhu[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
    
}