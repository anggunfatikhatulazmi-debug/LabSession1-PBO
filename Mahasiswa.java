/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsession;

/**
 *
 * @author anggu
 */
public class Mahasiswa {
    
    // Poin 1: Class & Project - atribut
    String nama;
    String nim;
    char kelas;
    double nilai;
    
    static final double BATAS_LULUS = 70.0;
    
    public Mahasiswa(String nama, String nim, char kelas, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.nilai = nilai;
    }
    
    public void tampilkanData() {
        System.out.println("\n==  DATA MAHASISWA ===");
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Kelas : " + kelas);
        System.out.println("Nilai : " + nilai);  
    }
    
    public void cekKelulusan() {
        if (nilai >= BATAS_LULUS) {
            System.out.println("Status: LULUS");
        } else {
            System.out.println("Status: TIDAK LULUS");
        }
    }

    // Poin 7: Character & String
    public void prosesNama() {
        System.out.println("Jumlah karakter nama : " + nama.length());
        System.out.println("Nama huruf besar     : " + nama.toUpperCase());
        if (nama.length() >= 2) {
            System.out.println("2 huruf pertama      : "
                    + nama.substring(0, 2));
        }
    }

}