/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labsession;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anggu
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Poin 8: Collection menggunakan ArrayList
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        System.out.print("Masukkan jumlah mahasiswa: ");

        int jumlah = input.nextInt();
        input.nextLine();

        // Poin 5: Looping
        for (int i = 0; i < jumlah; i++) {

            System.out.println("\nMahasiswa ke-" + (i + 1));

            System.out.print("Nama  : ");
            String nama = input.nextLine();

            System.out.print("NIM   : ");
            String nim = input.nextLine();

            System.out.print("Kelas : ");
            char kelas = input.nextLine().charAt(0);

            double nilai = 0;

            // Poin 6: Exception Handling
            try {

                System.out.print("Nilai : ");
                nilai = Double.parseDouble(input.nextLine());

            } catch (NumberFormatException e) {

                System.out.println("Input nilai tidak valid!");
                System.out.println("Nilai otomatis menjadi 0.");
            }

            // Poin 1 & 2: Membuat object dengan constructor
            Mahasiswa mahasiswa = new Mahasiswa(
                    nama,
                    nim,
                    kelas,
                    nilai
            );

            // Memasukkan object ke ArrayList
            daftarMahasiswa.add(mahasiswa);
        }

        // Menampilkan hasil
        System.out.println("\n================================");
        System.out.println("       DAFTAR MAHASISWA");
        System.out.println("================================");

        // Poin 5: Looping untuk menampilkan data
        for (Mahasiswa mhs : daftarMahasiswa) {

            // Poin 9: Menampilkan object ke layar
            mhs.tampilkanData();

            // Memanggil method cek kelulusan
            mhs.cekKelulusan();

            // Memanggil method String
            mhs.prosesNama();

            System.out.println("----------------------------");
        }

        input.close();
    } 
}
