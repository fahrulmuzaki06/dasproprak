import java.util.Scanner;

/**
 * Program Sistem Pendataan Magang Mahasiswa
 * Inisialisasi array untuk menyimpan data mahasiswa Nama, NIM, program studi, perusahaan, semester, status magang
 */
public class sistemmagang14{
    static String[] namaMahasiswa = new String[100];
    static int [] nim = new int [100];
    static String[] programStudi = new String[100];
    static String[] namaPerusahaan = new String[100];
    static int[] semester = new int[100];
    static String[] statusMagang = new String[100];
    static int jumlahData = 0;

    /**
     * Deklarasi Scanner untuk menginput
     * Loop do-while untuk menampilkan menu yang dipilih
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Pendataan Magang Mahasiswa ===");
            System.out.println("1. Tambah Data Magang Mahasiswa");
            System.out.println("2. Tampilkan Seluruh Data Pendaftar Magang");
            System.out.println("3. Cari Data Pendaftar Magang Berdasarkan Program Studi");
            System.out.println("4. Hitung dan Tampilkan Jumlah Pendaftar per Status Magang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();
            sc.nextLine(); // consume newline
    /**
     * switch case untuk menjalankan fungsi sesua case
     * keluar loop saat memilih menu 5
     */
            switch (pilihan) {
                case 1:
                    tambahData(sc);
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    cariData(sc);
                    break;
                case 4:
                    hitungStatus();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 5);
    }

    /**
     * menambahkan data mahasiswa yaitu Nama, NIM, Program Stud, Nama 
    */
    static void tambahData(Scanner sc) {
        if (jumlahData >= 100) {
            System.out.println("Data penuh. Tidak dapat menambah data lagi.");
            return;
        }

        System.out.println("\n--- Tambah Data Magang ---");
        System.out.print("Nama Mahasiswa            : ");
        namaMahasiswa[jumlahData] = sc.nextLine();
        System.out.print("NIM                       : ");
        nim[jumlahData] = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Program Studi             : ");
        programStudi[jumlahData] = sc.nextLine();
        System.out.print("Nama Perusahaan           : ");
        namaPerusahaan[jumlahData] = sc.nextLine();

        /**
         * validasi semester 6 dan 7 jika selain itu disuruh input ulang semester
         */
        do {
            System.out.print("Semester (6 atau 7)   : ");
            semester[jumlahData] = sc.nextInt();
            sc.nextLine();
            if (semester[jumlahData] != 6 && semester[jumlahData] != 7) {
                System.out.println("Semester harus 6 atau 7. Silakan input ulang.");
            }
        } while (semester[jumlahData] != 6 && semester[jumlahData] != 7);

        /**
         * validasi status magang antara diterima, menunggu, dan ditolak 
         * jika selain itu disuruh input ulang status magang
         * jika berhasil input data akan ditambahkan
         */
        do {
            System.out.print("Status Magang (Diterima/Menunggu/Ditolak): ");
            statusMagang[jumlahData] = sc.nextLine();
            if (!statusMagang[jumlahData].equals("Diterima") && !statusMagang[jumlahData].equals("Menunggu") && !statusMagang[jumlahData].equals("Ditolak")) {
                System.out.println("Status magang harus Aktif, Selesai, atau Pending. Silakan input ulang.");
            }
        } while (!statusMagang[jumlahData].equals("Diterima") && !statusMagang[jumlahData].equals("Menunggu") && !statusMagang[jumlahData].equals("Ditolak"));

        jumlahData++;
        System.out.println("Data berhasil ditambahkan.");
    }

    /**
     * cek apakah ada data (jumlahData == 0)
     * jika iya maka print tidak ada data untuk ditampilkan
     * jika ada data cetak header tabel dengan format kolom nama, nim, program studi, nama perusahaan, semester, status magang
     * cetak setiap data mahasiswa
     */
    static void tampilkanData() {
        if (jumlahData == 0) {
            System.out.println("Tidak ada data untuk ditampilkan.");
            return;
        }

        System.out.println("\n--- Seluruh Data Pendaftar Magang ---");
        System.out.printf("%-20s %-10s %-20s %-20s %-8s %-10s\n", "Nama", "NIM", "Program Studi", "Perusahaan", "Semester", "Status");
        System.out.println("=".repeat(90));
        for (int i = 0; i < jumlahData; i++) {
            System.out.printf("%-20s %-10d %-20s %-20s %-8d %-10s\n",
                namaMahasiswa[i], nim[i], programStudi[i], namaPerusahaan[i], semester[i], statusMagang[i]);
        }
    }

    /**
     * cek apakah datanya ada
     * input program studi yang dicari
     * loop melalui semua data, bandingkan program studi
     * jika ditemukan, cetak data dalam format tabel
     * jika tidak ditemukan, tampilkan pesan tidak ada data
     */
    static void cariData(Scanner sc) {
        if (jumlahData == 0) {
            System.out.println("Tidak ada data untuk dicari.");
            return;
        }

        System.out.print("Masukkan Program Studi yang dicari: ");
        String cariProdi = sc.nextLine();
        boolean found = false;

        System.out.println("\n--- Hasil Pencarian Berdasarkan Program Studi: " + cariProdi + " ---");
        System.out.printf("%-20s %-10s %-20s %-20s %-8s %-10s\n", "Nama", "NIM", "Program Studi", "Perusahaan", "Semester", "Status");
        System.out.println("=".repeat(90));
        for (int i = 0; i < jumlahData; i++) {
            if (programStudi[i].equalsIgnoreCase(cariProdi)) {
                System.out.printf("%-20s %-10d %-20s %-20s %-8d %-10s\n",
                    namaMahasiswa[i], nim[i], programStudi[i], namaPerusahaan[i], semester[i], statusMagang[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada data dengan program studi tersebut.");
        }
    }

    /**
     * cek apakah ada data
     * inisialisasi counter untuk setiap status (aktif, selesai, pending)
     * ioop melalui semua data, increment counter sesuai status
     * cetak hasil perhitungan untuk setiap status
     */
    static void hitungStatus() {
        if (jumlahData == 0) {
            System.out.println("Tidak ada data untuk dihitung.");
            return;
        }

        int diterima = 0, menunggu = 0, ditolak = 0;
        for (int i = 0; i < jumlahData; i++) {
            if (statusMagang[i].equals("Diterima")) {
                diterima++;
            } else if (statusMagang[i].equals("Menunggu")) {
                menunggu++;
            } else if (statusMagang[i].equals("Ditolak")) {
                ditolak++;
            }
        }

        System.out.println("\n--- Jumlah Pendaftar per Status Magang ---");
        System.out.println("Diterima : " + diterima);
        System.out.println("Menunggu : " + menunggu);
        System.out.println("Ditolak : " + ditolak);
    }
}