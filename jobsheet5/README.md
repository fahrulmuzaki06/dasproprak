Pertanyaan 2.1  
1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?  
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?  
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”.Modifikasi program tersebut dengan menambahkan struktur ELSE!  
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi Percobaan 1”.

Jawaban 2.1  
1. Karena pada struktur if tersebut berupa nilai boolean
2. Silakan lunasi UKT terlebih dahulu agar bisa mencetak KRS.

Pertanyaan 2.2  
1. Apa fungsi dari sintaks break?
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE?
3. Buat file baru dengan nama ifElseCetakKRSNoPresensi.java. File ini berisi program hasil
transformasi dari program cetak KRS menggunakan struktur SWITCH-CASE yang telah
dibuat ke dalam bentuk IF-ELSE IF-ELSE.
4. Commit dan push hasil modifikasi Anda ke Github dengan pesan “Modifikasi
Percobaan 2”

Jawaban 2.2  
1. Supaya menghentikan case agar tidak lanjut ke case lain
2. Menangani ketika tidak ada case yang cocok

Pertanyaan 2.3  
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen?
Mengapa demikian?
2. Jelaskan maksud dari potongan kode berikut!
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara
runtut untuk semua kondisi!

Jawaban 2.3  
1. Tetap menyuruk memasukkan jumlah log dan hasil akhir "Gagal! Mahasiswa masih memiliki tanggungan kompen"
2. Bimbingan 1 minimal 8 dan bimbingan 2 minimal 4
3. Pertama menanyakan mahasiswa sudah bebas kompen Ya/Tidak lalu masukkan log bimbingan 1 lanjut masukkan log bimbingan 2 dan hasil akhir antara "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi", "Gagal! Log bimbingan P2 kurang dari 4 kali", "Gagal! Log bimbingan P1 belum mencapai 8 kali", "Gagal! Log bimbingan P2 belum mencapai 4 kali", "Gagal! Mahasiswa masih memiliki tanggungan kompen."


PSEUDOCODE  

Latihan 1  

Start Deklarasi variabel: kartuMahasiswa : boolean registrasiOnline : boolean

"Apakah Membawa Kartu Mahasiswa (true/false): "
Input kartuMahasiswa

"Apakah Sudah Registrasi Online (true/false): "
Input registrasiOnline

Jika (kartuMahasiswa == true) atau (registrasiOnline == true) maka
    Tampilkan "Boleh Masuk Perpustakaan"
Jika false
    Tampilkan "Tidak Boleh Masuk Perpustakaan"

End

Latihan 2  