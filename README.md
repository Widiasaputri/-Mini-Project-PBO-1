# NAMA: WIDIA SAPUTRI
# NIM: 2309116019
# KELAS: A1
## MANAJEMEN PHOTO STUDIO

## Dokumentasi Program Manajemen Studio Foto
### Deskripsi Umum
Program ini dirancang untuk membantu pengelolaan sebuah studio foto dengan fitur-fitur yang memungkinkan pengguna untuk menambah, menampilkan, memperbarui, dan menghapus sesi foto secara efisien. Dengan adanya program ini, proses manajemen sesi foto menjadi lebih mudah dan terorganisir, memungkinkan pengguna untuk melacak semua informasi yang relevan dengan lebih baik. Selain itu, program ini bertujuan untuk meningkatkan efisiensi operasional studio serta mengurangi kemungkinan kesalahan dalam pencatatan data, sehingga pengelolaan sesi foto dapat dilakukan dengan lebih akurat dan efektif.

## Struktur Proyek
Proyek ini terdiri dari dua Package:
### 1. Package main
Package ini berisi kelas utama yang mengelola interaksi pengguna dengan aplikasi.
- Kelas: Utama
  - Fungsi: Kelas ini berfungsi sebagai titik masuk aplikasi dan mengatur antarmuka pengguna.
  - Metode:
    - public static void main(String[] args):
      Metode ini adalah titik masuk utama aplikasi. Mengelola loop menu dan menangani pilihan pengguna untuk operasi CRUD.
    - private static void tambahSesi(Scanner scanner, StudioPhoto studio):
      Mengambil input dari pengguna untuk menambah sesi baru ke dalam studio. (Create)
    - private static void updateSesi(Scanner scanner, StudioPhoto studio):
      Mengambil input dari pengguna untuk mengupdate sesi yang sudah ada berdasarkan ID sesi. (Update)
    - private static void hapusSesi(Scanner scanner, StudioPhoto studio):
      Mengambil input dari pengguna untuk menghapus sesi berdasarkan ID sesi. (Delete)
      
### 2. Package studio
Package ini berisi kelas yang mengelola data sesi foto.
- Kelas: StudioPhoto
  - Fungsi: Kelas ini bertanggung jawab untuk mengelola data sesi foto, menyimpan daftar sesi foto, dan menyediakan metode untuk manipulasi data.
  - Atribut:
    - private static int idCounter: Menghitung ID sesi yang unik untuk setiap sesi yang ditambahkan.
    - private ArrayList<SesiPhoto> daftarSesi: Menyimpan daftar objek SesiPhoto.
- Kelas Bersarang: SesiPhoto
  - Fungsi: Kelas ini digunakan untuk menyimpan informasi tentang sesi foto.
  - Atribut:
    - private String idSesi: ID unik sesi foto.
    - private String namaKlien: Nama klien yang melakukan sesi foto.
    - private String jenisSesi: Jenis sesi foto.
    - private String tanggalSesi: Tanggal sesi foto.
      
### Metode dalam Kelas StudioPhoto
1. Create (Membuat)
  - Metode: tambahSesi()
  - Deskripsi: Metode ini digunakan untuk menambahkan sesi baru ke dalam daftar sesi. Pengguna akan diminta untuk memasukkan nama klien, jenis sesi, dan tanggal sesi. ID sesi unik juga akan dibuat secara otomatis.
2. Read (Membaca)
  - Metode: tampilkanSemuaSesi()
  - Deskripsi: Metode ini menampilkan semua sesi foto yang telah disimpan di studio. Jika tidak ada sesi yang tersedia, pengguna akan diberi tahu bahwa tidak ada sesi yang tersedia.
3. Update (Memperbarui)
  - Metode: updateSesi()
  - Deskripsi: Metode ini memungkinkan pengguna untuk memperbarui informasi sesi yang ada dengan memberikan ID sesi. Pengguna dapat mengubah nama klien, jenis sesi, dan tanggal sesi.
4. Delete (Menghapus)
  - Metode: hapusSesi()
  - Deskripsi: Metode ini digunakan untuk menghapus sesi dari daftar berdasarkan ID sesi yang diberikan. Jika sesi ditemukan dan dihapus, pengguna akan diberitahu bahwa sesi berhasil dihapus; jika tidak, pengguna akan diberi tahu bahwa sesi tidak ditemukan.

## OUTPUT
1. Menu Utama

![Screenshot 2024-09-30 015106](https://github.com/user-attachments/assets/837cc884-3e13-4c0f-b248-55da00f07409)

2.	Pilih opsi dari menu:
-	Tambah sesi foto

![Screenshot 2024-09-30 014603](https://github.com/user-attachments/assets/1404a744-8619-4fbe-aa88-eb40270d5868)

Lalu kembali ke Menu Utama.
-	Tampilkan semua sesi foto

 ![Screenshot 2024-09-30 014613](https://github.com/user-attachments/assets/08940eb5-6aba-4864-b062-52b527a40356)

Lalu kembali ke Menu Utama.
-	Perbarui sesi foto

 ![Screenshot 2024-09-30 014622](https://github.com/user-attachments/assets/a56c7950-2cdf-4a5d-b5f4-babd11a94e7a)

Lalu kembali ke Menu Utama.
Hasil setelah diperbarui
 
 ![Screenshot 2024-09-30 014631](https://github.com/user-attachments/assets/a4d8187e-0d96-4440-9861-050ff0738e2c)

Lalu kembali ke Menu Utama.
-	Hapus sesi foto

![Screenshot 2024-09-30 014641](https://github.com/user-attachments/assets/77a35743-969f-4de2-b18f-bf86df7b81a7)

Lalu kembali ke Menu Utama.
Hasil setelah dihapus

![Screenshot 2024-09-30 014647](https://github.com/user-attachments/assets/09596133-fda2-4113-8772-bf76e7cd049f)

-	Keluar dari aplikasi

![Screenshot 2024-09-30 014702](https://github.com/user-attachments/assets/9013a1b9-6142-4ec8-adc9-f37f56307cef)

Selesai.
-	Apabila opsi tidak tersedia

![Screenshot 2024-09-30 014654](https://github.com/user-attachments/assets/a96ac3e4-3350-4d50-b038-0b8820d9e3d5)

Lalu kembali ke Menu Utama.
