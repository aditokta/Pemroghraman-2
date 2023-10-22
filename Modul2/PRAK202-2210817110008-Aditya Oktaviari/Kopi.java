package Modul2;

public class Kopi {
	String namaKopi;
    String ukuran;
    String pembeli;
    int harga;

    double getPajak() {
        return 0.11 * harga;
    }
    
    void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    String getPembeli() {
        return pembeli;
    }

    void info() {
        System.out.println("Nama Kopi: " + namaKopi);
        System.out.println("Ukuran: " + ukuran);
        System.out.println("Harga: Rp. " + harga);
    }

}
