import java.util.Scanner;
public class bioskopwithscanner14 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String [] [] penonton = new String [4] [2];
        int pilihan; 

        while (true){
            System.out.println("\nMenu Bioskop");
            System.out.println("1. Input Data Penonton");
            System.out.println("2. Tampilkan Data Penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih Menu:");
            pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan== 1) {
                System.out.print("Masukkan Nama: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan Baris (1-4):");
                int baris = sc.nextInt();
                System.out.print("Masukkan Kolom (1-2):");
                int kolom = sc.nextInt();
                sc.nextLine();

                if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2){
                    System.out.println("Posisi Kursi Tidak Tersedia!");
                } else if (penonton[baris - 1][kolom - 1] != null){
                    System.out.println("Kursi Sudah Terisi!");
                } else {
                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println("Data Penonton Disimpan!");
                }
            } else if (pilihan == 2) {
                System.out.println("\n Data Penonton di Bioskop:");
                for (int i = 0; i <penonton.length; i++){
                    System.out.print("Baris ke- " + (i + 1)+ ":");
                    for (int j = 0; j < penonton[i].length;j++){
                        if (penonton[i][j] != null){
                            System.out.print(penonton[i][j] + "\t");
                        } else {
                            System.out.print("****\t");
                        }
                        
                    }
                    System.out.println();
                }
                
            }else if (pilihan == 3){
                System.out.println("Terima Kasih Program Selesai.");
                break;
            } else {
                System.out.println("Pilihan Tidak Tersedia!");
            }

        }

        sc.close();
    }
    
}