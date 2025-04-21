package kampus;

public class Kampus {
    public String namaKampus;
    public String alamatKampus;

    public static int totalMahasiswa = 0;
            
    public Kampus(String namaKampus, String alamatKampus, int jumlahMahasiswa){
        if (isNamaKampusValid(namaKampus)){
            this.namaKampus = namaKampus;
        }else{
            this.namaKampus = "Nama Kampus Tidak Valid";
        }
        this.alamatKampus = alamatKampus;
        totalMahasiswa = jumlahMahasiswa;
    }
    
    public void tampilkanInfoKampus(){
        System.out.println("Nama Kampus: " + this.namaKampus);
        System.out.println("Alamat Kampus: " + this.alamatKampus);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }
    
    public static boolean isNamaKampusValid(String nama){
        return !nama.matches(".*\\d.*");
    }
}
