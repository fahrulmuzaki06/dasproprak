Pertanyaan 2.1  
1.  Tidak.fungsi tanpa parameter tidak harus bertipe void
2.  Modifikasi  
3.  Lebih mudah dibaca dan rapi  
    Mempermudah perbaikan  
    Program lebih modular  
4.  main() dijalankan, main() memanggil Menu(), eksekusi masuk ke Menu(), semua printl dicetak,  
    daftar menu tampil, program selesai.  

Pertanyaan 2.2  
1.  Mengirim data pemanggil ke dalam fungsi  
    Bisa digunakan berkali-kali  
2.  Agar fungsi bisa menampilkan nama pelanggan yang berbeda-beda dan apakah pelanggan itu  
    adalah member atau bukan.  
3.  Tidak sama  
    Parameter adalah variabel kusus yang menerima input pada fungsi  
    parameter hanya ada di dalam fungsi  
    Variabel bisa dibuat dimana saja (di fungsi atau global)  
4.  Parameter isMember adalah bertipe boolean (true atau false)  
    nilai dikirim dari fungsi main() saat memanggil fungsi menu()  
    jika bernilai true program menjalankan perintah di dalam if jika bernilai false program tidak menjalankan perintah  
    Perbedaan output  
    true : ada tambahan mendapatkan diskon 10%  
    false: tidak ada tambahan  
5.  Program eror  
6.  Modifikasi  
7.  Menu("Budi", true, "DISKON30");  
8.  Menjadi lebih fleksibel dan dapat digunakan berulang ulang  

Pertanyaan 2.3  
1.  Return value : ketika fungsi harus menghasilkan nilai untuk digunakan kembali  
    Tanpa Return value : ketika fungsi hanya menampilkan sesuatu  
    Contoh Return Value : hitungTotalHarga(pilihMenu, banyakItem);  
    Contoh tanpa Return value : Menu("Budi", true, "DISKON30");  
2.  Tipe data nilai kembalian : return hargaTotal;  
    2 Parameter  
    int pilihMenu : menu apa yang dipilih pelanggan  
    int banyakItem: jumlah menu yang dipesan pelanggan  
3.  Modifikasi  
4.  Modifikasi  

Pertanyaan 2.4  
1.  Untuk menerima jumlah nama pengunjung yang berbeda beda tanpa membuat array  
2.  Modifikasi  
3.  Bisa tapi tidak dalam satu metode, karena aturan varaargs di java hanya bisa menggudakan 1 parameter   
    varaargs per metode.  
    Contoh : static void daftarPengunjung(String...namaPengunjung, int nomerMeja){
             }  
4.  Program tidak akan eror dan tetap berjalan  
    output : hanya "Daftar nama pengunjung"  

Pertanyaan 2.5  
1.  1. dimulai dari main  
    2. deklarasi scanner untuk input dari pengguna  
    3. deklarasi p, l, t, L, vol  
    4. input panjang : 4  
    5. input lebar : 3  
    6. input tinggi : 5  
    7. menghtung luas p * l  
    8. menampilkan hasil luas  
    9. menghitung volume balok p * l * t  
    10.menampilkan hasil volume
    11. menutup scanner
2.  outputnya  
    Masukkan Panjang  : 4  
    Masukkan Lebar    : 3  
    Masukkan Tinggi   : 5  
    Luas Persegi Panjang Adalah : 12  
    Volume Balok Adalah         : 60  
    alur jalannya seperti di jawaban nomer 1  
3.  
