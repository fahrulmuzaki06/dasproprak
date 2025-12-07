public class pengunjungkafe14 {
    static void daftarPengunjung(String...namaPengunjung) {
        System.out.println("Daftar nama pengunjung");
        for (String nama : namaPengunjung){
            System.out.println("- " + nama);
        }
        System.out.println();
    }
    public static void main(String[] args) {
            daftarPengunjung();
            daftarPengunjung("Andi");
            daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

        
    }
    
}