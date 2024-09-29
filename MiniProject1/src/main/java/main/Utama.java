/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import studio.StudioPhoto;
import java.util.Scanner;

/**
 *
 * @author Widia
 */
public class Utama {
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
            scanner.nextLine(); // Clear the newline character
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
