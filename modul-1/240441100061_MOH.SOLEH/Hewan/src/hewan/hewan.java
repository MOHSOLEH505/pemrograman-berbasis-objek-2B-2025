package hewan;

class Harimau {
    String nama;
    int umur;
    //CONS
    Harimau(String n, int u){
        nama = n;
        umur = u;
    }

    void harimauInfo(){
        System.out.println("Nama Harimau: " + nama + ", Umur: " + umur + " tahun");
    }

    void mengaum(){
        System.out.println(nama + " mengaum dengan keras!");
    }
}

class Singa {
    String nama;
    String wilayah;

    Singa(String n, String w){
        nama = n;
        wilayah = w;
    }

    void singaInfo(){
        System.out.println("Nama Singa: " + nama + ", Wilayah: " + wilayah);
    }

    void berburu(){
        System.out.println(nama + " sedang berburu di " + wilayah);
    }
}

class Serigala {
    String nama;
    double berat;

    Serigala(String n, double b){
        nama = n;
        berat = b;
    }

    void serigalaInfo(){
        System.out.println("Nama Serigala: " + nama + ", Berat: " + berat + " kg");
    }

    void melolong(){
        System.out.println(nama + " melolong ke bulan...");
    }
}

public class hewan { 
    public static void main(String[] args) {

        // Objek Harimau
        for (int i = 1; i <= 3; i++) {
            Harimau h = new Harimau("Harimau" + i, 3 + i);
            h.harimauInfo();
            h.mengaum();
        }

        System.out.println("");

        // Objek Singa
        for (int i = 1; i <= 3; i++) {
            Singa s = new Singa("Singa" + i, "Sabana" + i);
            s.singaInfo();
            s.berburu();
        }

        System.out.println("");

        // Objek Serigala
        for (int i = 1; i <= 3; i++) {
            Serigala sr = new Serigala("Serigala" + i, 25.5 + i);
            sr.serigalaInfo();
            sr.melolong();
        }
    }
}
