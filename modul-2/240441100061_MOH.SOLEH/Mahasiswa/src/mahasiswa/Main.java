package mahasiswa;

public class Main {
    public static void main(String[] args) {

        if (Mahasiswa.validasiNIM("2342042945")) {
            Mahasiswa m1 = new Mahasiswa("Irma", "2342042945", "SI");
            m1.tambahMataKuliah("Bhs Inggris");
            m1.tambahMataKuliah("PPKN");
            m1.tambahMataKuliah("PBD");
            m1.tambahMataKuliah("Bhs Indonesia");
            m1.tampilkanBiodata();
        } else {
            System.out.println("NIM tidak valid: 2342042945\n");
        }

        if (Mahasiswa.validasiNIM("2349549305")) {
            Mahasiswa m2 = new Mahasiswa("Abi", "2349549305", "Teknik Informatika");
            m2.tambahMataKuliah("DMJ");
            m2.tambahMataKuliah("PBO");
            m2.tambahMataKuliah("PBW");
            m2.tambahMataKuliah("ALPRO");
            m2.tampilkanBiodata();
        } else {
            System.out.println("NIM tidak valid: 2349549305\n");
        }
        
        if (Mahasiswa.validasiNIM("2453345")) {
            Mahasiswa m3 = new Mahasiswa("Rio", "2453345", "SI");
            m3.tambahMataKuliah("Bhs Inggris");
            m3.tambahMataKuliah("PBO");
            m3.tambahMataKuliah("PBW");
            m3.tambahMataKuliah("ALPRO");
            m3.tampilkanBiodata();
        } else {
            System.out.println("NIM tidak valid: 2453345\n");
        }

        if (Mahasiswa.validasiNIM("2348953345")) {
            Mahasiswa m4 = new Mahasiswa("Toni", "2348953345", "SI");
            m4.tambahMataKuliah("Bhs Indonesia");
            m4.tambahMataKuliah("PBO");
            m4.tambahMataKuliah("PBW");
            m4.tambahMataKuliah("ALPRO");
            m4.tampilkanBiodata();
        } else {
            System.out.println(" Mahasiswa 4 - NIM tidak valid: 2348953345\n");
        }

        if (Mahasiswa.validasiNIM("2343234856")) {
            Mahasiswa m5 = new Mahasiswa("Rani", "2343234856", "Teknik Industri");
            m5.tambahMataKuliah("Teknologi");
            m5.tambahMataKuliah("PBO");
            m5.tambahMataKuliah("PBW");
            m5.tambahMataKuliah("Ecommerce");
            m5.tampilkanBiodata();
        } else {
            System.out.println("NIM tidak valid: 2343234856\n");
        }

        if (Mahasiswa.validasiNIM("2343234856")) {
            Mahasiswa m6 = new Mahasiswa("Indra", "2343234856", "Psikologi");
            m6.tambahMataKuliah("Sains");
            m6.tambahMataKuliah("Sosiologi");
            m6.tambahMataKuliah("Antropologi");
            m6.tambahMataKuliah("Ilmu sosial");
            m6.tampilkanBiodata();
        } else {
            System.out.println("NIM tidak valid: 2343234856\n");
        }

        Mahasiswa.tampilkanJumlahMahasiswa();
    }
}