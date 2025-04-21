package mahasiswa;

public class Mahasiswa {
    public String nama;
    public String nim;
    public String prodi;
    public String daftarMataKuliah = "";
    public static int jumlahMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String prodi) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        jumlahMahasiswa++;
    }

    public void tambahMataKuliah(String mataKuliah) {
        if (daftarMataKuliah.isEmpty()) {
            daftarMataKuliah = mataKuliah;
        } else {
            daftarMataKuliah += ", " + mataKuliah;
        }
    }

    public void tampilkanBiodata() {
        System.out.println("Data Mahasiswa");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah: " + daftarMataKuliah);
        System.out.println();
    }

    public static void tampilkanJumlahMahasiswa() {
        System.out.println("Total Mahasiswa: " + jumlahMahasiswa);
    }

    public static boolean validasiNIM(String nim) {
        return nim.startsWith("23") && nim.length() == 10 && nim.matches("\\d+");
    }
}
