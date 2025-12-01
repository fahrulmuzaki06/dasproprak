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