package matakuliah;

public class Main2 {
    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah("MK001", "PBO", 4);
        Matakuliah mk2 = new Matakuliah("MK002", "DMJ", 1);
        Matakuliah mk3 = new Matakuliah("MK003", "PBW", 3);
        Matakuliah mk4 = new Matakuliah("MK004", "PBD", 2);
        Matakuliah mk5 = new Matakuliah("MK005", "Bhs Inggris", 2);
        Matakuliah mk6 = new Matakuliah("MK006", "Bhs Indonesia", 3);
        Matakuliah mk7 = new Matakuliah("MK007", "Ecommerce", 2);
        Matakuliah mk8 = new Matakuliah("MK008", "PPKN", 2);

        System.out.println("===== Daftar Mata Kuliah =====");
        if (mk1.kode != null) mk1.tampilkanInfo();
        if (mk2.kode != null) mk2.tampilkanInfo();
        if (mk3.kode != null) mk3.tampilkanInfo();
        if (mk4.kode != null) mk4.tampilkanInfo();
        if (mk5.kode != null) mk5.tampilkanInfo();
        if (mk6.kode != null) mk6.tampilkanInfo();
        if (mk7.kode != null) mk7.tampilkanInfo();
        if (mk8.kode != null) mk8.tampilkanInfo();
    }
}
