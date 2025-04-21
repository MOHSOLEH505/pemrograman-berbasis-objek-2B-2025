package matakuliah;

public class Matakuliah {
    public String kode;
    public String nama;
    public int sks;

    public Matakuliah(String kode, String nama, int sks) {
        if (validasiSKS(sks)) {
            this.kode = kode;
            this.nama = nama;
            this.sks = sks;
        } else {
            System.out.println("SKS tidak valid untuk mata kuliah: " + nama + " (" + sks + ")");
        }
    }

    public static boolean validasiSKS(int sks) {
        return sks == 2 || sks == 3;
    }

    public void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("SKS : " + sks);
        System.out.println();
    }
}
