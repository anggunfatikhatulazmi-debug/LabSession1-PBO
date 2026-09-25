## Penjelasan Output Program

Program Sistem Data Mahasiswa digunakan untuk memasukkan dan menampilkan data beberapa mahasiswa. Data yang dimasukkan meliputi nama, NIM, kelas, dan nilai.

1. Input Jumlah Mahasiswa
Program pertama meminta pengguna memasukkan jumlah mahasiswa yang ingin didata.
```
Masukkan jumlah mahasiswa: 2
```
Angka tersebut menentukan berapa kali proses input data mahasiswa dilakukan menggunakan perulangan `for`.

2. Input Data Mahasiswa
Setelah jumlah mahasiswa dimasukkan, program meminta data setiap mahasiswa berupa:
* Nama
* NIM
* Kelas
* Nilai
Contoh:
```
Mahasiswa ke-1
Nama  : Anggun
NIM   : L0325038
Kelas : B
Nilai : 85
```
Pada bagian kelas digunakan tipe data `char`, sedangkan nama dan NIM menggunakan tipe data `String`.

3. Menampilkan Data Mahasiswa
Setelah seluruh data dimasukkan, program menampilkan data mahasiswa yang telah disimpan dalam `ArrayList`.
Contoh:
```
=== DATA MAHASISWA ===
Nama  : Anggun
NIM   : L0325038
Kelas : B
Nilai : 85.0
```
Data tersebut berasal dari object `Mahasiswa` yang dibuat menggunakan constructor.

4. Menampilkan Status Kelulusan
Program kemudian mengecek nilai mahasiswa menggunakan kondisi `if-else`.
Batas nilai kelulusan ditentukan menggunakan konstanta:
```
BATAS_LULUS = 70.0
```
Jika nilai mahasiswa **≥ 70**, maka output
```
Status: LULUS
```

Jika nilai mahasiswa **< 70**, maka output:

```text
Status: TIDAK LULUS
```

### 5. Pengolahan Nama

Program juga melakukan beberapa operasi terhadap `String` nama mahasiswa.

Contohnya:
```
Jumlah karakter nama : 6
Nama huruf besar     : ANGGUN
2 huruf pertama      : An
```

Keterangan:
* `length()` digunakan untuk menghitung jumlah karakter nama.
* `toUpperCase()` digunakan untuk mengubah nama menjadi huruf kapital.
* `substring()` digunakan untuk mengambil dua karakter pertama dari nama.

6. Penanganan Input Nilai
Program menggunakan `try-catch` untuk menangani kesalahan ketika pengguna memasukkan nilai yang bukan berupa angka.
Jika pengguna memasukkan:
```
Nilai : abc
```
maka program akan menampilkan:
```
Input nilai tidak valid!
Nilai otomatis menjadi 0.
```

Hal ini mencegah program berhenti secara tiba-tiba akibat input yang tidak sesuai.
Contoh Output Lengkap
```
Masukkan jumlah mahasiswa: 2
Mahasiswa ke-1
Nama  : Anggun
NIM   : L0325038
Kelas : B
Nilai : 85

Mahasiswa ke-2
Nama  : Budi
NIM   : L0325040
Kelas : B
Nilai : 65

================================
       DAFTAR MAHASISWA
================================

=== DATA MAHASISWA ===
Nama  : Anggun
NIM   : L0325038
Kelas : B
Nilai : 85.0
Status: LULUS
Jumlah karakter nama : 6
Nama huruf besar     : ANGGUN
2 huruf pertama      : An
----------------------------

=== DATA MAHASISWA ===
Nama  : Budi
NIM   : L0325040
Kelas : B
Nilai : 65.0
Status: TIDAK LULUS
Jumlah karakter nama : 4
Nama huruf besar     : BUDI
2 huruf pertama      : Bu
----------------------------
```

Kesimpulan Output
Berdasarkan output tersebut, program berhasil menerima input data mahasiswa, menyimpan data menggunakan `ArrayList`, menampilkan data melalui object, menentukan status kelulusan berdasarkan nilai, melakukan pengolahan `String`, serta menangani input yang tidak valid menggunakan `try-catch`.
