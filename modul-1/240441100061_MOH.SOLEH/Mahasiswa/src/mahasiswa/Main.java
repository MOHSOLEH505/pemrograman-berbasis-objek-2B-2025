package mahasiswa;

import java.util.Scanner;

class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    String alamat;

    // Constructor untuk memberi nilai awal
    Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }

    // Method untuk menampilkan info mahasiswa
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan/Prodi: " + jurusan);
        System.out.println("Alamat: " + alamat);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat objek mahasiswa dan meminta inputan
        try (Scanner input = new Scanner(System.in)) {
            // Membuat objek mahasiswa dan meminta input dari pengguna
            System.out.println("Masukkan data mahasiswa pertama");
            System.out.print("Nama : ");
            String nama1 = input.nextLine();
            System.out.print("NIM : ");
            String nim1 = input.nextLine();
            System.out.print("Jurusan/Prodi : ");
            String jurusan1 = input.nextLine();
            System.out.print("Alamat : ");
            String alamat1 = input.nextLine();
            
            Mahasiswa mhs1 = new Mahasiswa(nama1, nim1, jurusan1, alamat1);
            
            // Data mahasiswa kedua
            System.out.println("Masukkan data mahasiswa kedua");
            System.out.print("Nama : ");
            String nama2 = input.nextLine();
            System.out.print("NIM : ");
            String nim2 = input.nextLine();
            System.out.print("Jurusan/Prodi : ");
            String jurusan2 = input.nextLine();
            System.out.print("Alamat : ");
            String alamat2 = input.nextLine();
            
            Mahasiswa mhs2 = new Mahasiswa(nama2, nim2, jurusan2, alamat2);
            
            // Data mahasiswa ketiga
            System.out.println("Masukkan data mahasiswa ketiga");
            System.out.print("Nama : ");
            String nama3 = input.nextLine();
            System.out.print("NIM : ");
            String nim3 = input.nextLine();
            System.out.print("Jurusan/Prodi : ");
            String jurusan3 = input.nextLine();
            System.out.print("Alamat : ");
            String alamat3 = input.nextLine();
            
            Mahasiswa mhs3 = new Mahasiswa(nama3, nim3, jurusan3, alamat3);
            
            // Menampilkan informasi dari ketiga objek mahasiswa
            System.out.println("\nData Mahasiswa yang Dimasukkan:");
            mhs1.tampilkanInfo();
            mhs2.tampilkanInfo();
            mhs3.tampilkanInfo();
        }
    }
}
