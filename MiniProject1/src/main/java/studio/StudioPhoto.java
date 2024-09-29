/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studio;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Widia
 */
public class StudioPhoto {
    private static int idCounter = 1;
    private ArrayList<SesiPhoto> daftarSesi = new ArrayList<>();

    // Nested class for SesiPhoto
    private class SesiPhoto {
        private String idSesi;
        private String namaKlien;
        private String jenisSesi;
        private String tanggalSesi;

        public SesiPhoto(String idSesi, String namaKlien, String jenisSesi, String tanggalSesi) {
            this.idSesi = idSesi;
            this.namaKlien = namaKlien;
            this.jenisSesi = jenisSesi;
            this.tanggalSesi = tanggalSesi;
        }

        public String getIdSesi() {
            return idSesi;
        }

        public String getNamaKlien() {
            return namaKlien;
        }

        public void setNamaKlien(String namaKlien) {
            this.namaKlien = namaKlien;
        }

        public String getJenisSesi() {
            return jenisSesi;
        }

        public void setJenisSesi(String jenisSesi) {
            this.jenisSesi = jenisSesi;
        }

        public String getTanggalSesi() {
            return tanggalSesi;
        }

        public void setTanggalSesi(String tanggalSesi) {
            this.tanggalSesi = tanggalSesi;
        }

        public String getInfoSesi() {
            return "ID Sesi: " + idSesi + "\nNama Klien: " + namaKlien + "\nJenis Sesi: " + jenisSesi + "\nTanggal Sesi: " + tanggalSesi;
        }
    }

    public void tambahSesi(String namaKlien, String jenisSesi, String tanggalSesi) {
        String idSesi = "S-" + idCounter++;
        SesiPhoto sesiBaru = new SesiPhoto(idSesi, namaKlien, jenisSesi, tanggalSesi);
        daftarSesi.add(sesiBaru);
        System.out.println("Sesi berhasil ditambahkan dengan ID: " + idSesi);
    }

    public void tampilkanSemuaSesi() {
        if (daftarSesi.isEmpty()) {
            System.out.println("Tidak ada sesi tersedia.");
        } else {
            for (SesiPhoto sesi : daftarSesi) {
                System.out.println(sesi.getInfoSesi());
                System.out.println("---------------------------");
            }
        }
    }

    public void updateSesi(String idSesi, String namaKlienBaru, String jenisSesiBaru, String tanggalSesiBaru) {
        boolean found = false;
        for (SesiPhoto sesi : daftarSesi) {
            if (sesi.getIdSesi().equals(idSesi)) {
                sesi.setNamaKlien(namaKlienBaru);
                sesi.setJenisSesi(jenisSesiBaru);
                sesi.setTanggalSesi(tanggalSesiBaru);
                System.out.println("Sesi dengan ID " + idSesi + " berhasil diperbarui.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Sesi dengan ID " + idSesi + " tidak ditemukan.");
        }
    }

    public void hapusSesi(String idSesi) {
        SesiPhoto sesiDihapus = null;
        for (SesiPhoto sesi : daftarSesi) {
            if (sesi.getIdSesi().equals(idSesi)) {
                sesiDihapus = sesi;
                break;
            }
        }
        if (sesiDihapus != null) {
            daftarSesi.remove(sesiDihapus);
            System.out.println("Sesi dengan ID " + idSesi + " berhasil dihapus.");
        } else {
            System.out.println("Sesi dengan ID " + idSesi + " tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        StudioPhoto studio = new StudioPhoto(); 
        do {
            System.out.println("=== Manajemen Studio Photo ===");
            System.out.println("1. Tambah Sesi Photo");
            System.out.println("2. Tampilkan Semua Sesi Photo");
            System.out.println("3. Update Sesi Photo");
            System.out.println("4. Hapus Sesi Photo");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();
            switch (pilihan) {
                case 1: 
                    System.out.print("Masukkan nama klien: ");
                    String namaKlien = scanner.nextLine();
                    System.out.print("Masukkan jenis sesi: ");
                    String jenisSesi = scanner.nextLine();
                    System.out.print("Masukkan tanggal sesi (dd-mm-yyyy): ");
                    String tanggalSesi = scanner.nextLine();
                    studio.tambahSesi(namaKlien, jenisSesi, tanggalSesi);
                    break;
                case 2: 
                    studio.tampilkanSemuaSesi();
                    break;
                case 3: 
                    System.out.print("Masukkan ID sesi yang ingin diupdate: ");
                    String idUpdate = scanner.nextLine();
                    System.out.print("Masukkan nama klien baru: ");
                    String namaKlienBaru = scanner.nextLine();
                    System.out.print("Masukkan jenis sesi baru: ");
                    String jenisSesiBaru = scanner.nextLine();
                    System.out.print("Masukkan tanggal sesi baru: ");
                    String tanggalSesiBaru = scanner.nextLine();
                    studio.updateSesi(idUpdate, namaKlienBaru, jenisSesiBaru, tanggalSesiBaru);
                    break;
                case 4: 
                    System.out.print("Masukkan ID sesi yang ingin dihapus: ");
                    String idHapus = scanner.nextLine();
                    studio.hapusSesi(idHapus);
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Opsi tidak valid.");
            }
            System.out.println();
        } while (pilihan != 5);
        scanner.close();
    }
}
