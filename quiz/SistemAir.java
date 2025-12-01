import java.util.Scanner;
public class SistemAir {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        String [] kota = {"Batu", "Malang", "Bogor",};
        String [] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        int [][]air = new int [kota.length][hari.length];
        int totalperhari = 0;

        for (int i = 0; i < kota.length; i++){
            System.out.println("\nKota " + kota[i]);
            for(int j = 0; j < hari.length; j++){
                System.out.print("Hari " + hari[j] + "\t: ");
                air[i][j] = sc.nextInt();
                totalperhari += air[i][j];
            }
            System.out.println("Total\t\t: "+totalperhari);
            System.out.println("Rata-Rata\t: " + (totalperhari / hari.length));
        }
        System.out.println("\nData Konsumsi Air Bersih Antar Wilayah");
        for(int i = 0; i < kota.length; i++){
            System.out.print(kota[i] + "\t");
            for(int j = 0; j < hari.length; j++){
                System.out.print(air[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
    
    
}
