package human;

public class Human {
    public static void main(String[] args) {
 
        Manusia orang1 = new Manusia();
        orang1.nama = "Razin";
        orang1.umur = 18;
        orang1.alamat = "Sampang";

        Manusia orang2 = new Manusia();
        orang2.nama = "Fauzul";
        orang2.umur = 19;
        orang2.alamat = "Sampang";

        Manusia orang3 = new Manusia();
        orang3.nama = "Aby";
        orang3.umur = 20;
        orang3.alamat = "Ketapang";

        Manusia orang4 = new Manusia();
        orang4.nama = "Andhika";
        orang4.umur = 20;
        orang4.alamat = "Pamekasan";

        Manusia orang5 = new Manusia();
        orang5.nama = "Putra";
        orang5.umur = 22;
        orang5.alamat = "Sumenep";

        orang1.berjalan();
        orang2.berlari();
        orang3.berjalan();
        orang4.berlari();
        orang5.berjalan();
    }
}

// Class Manusia
class Manusia {
    String nama;
    int umur;
    String alamat;

    void berjalan() {
        System.out.println(nama + " (umur " + umur + ") sedang berjalan di " + alamat);
    }

    void berlari() {
        System.out.println(nama + " (umur " + umur + ") sedang berlari di " + alamat);
    }
}
