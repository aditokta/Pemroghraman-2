package Modul2;

public class Buah {
    String namaBuah;
    double berat;
    double harga;
    double banyakBeli;
    double sebelumDiskon;
    double totalDiskon;
    double setelahDiskon;

    public Buah(String namaBuah, double hargaBuah, double beratBuah, double banyakBeli) {
        this.namaBuah = namaBuah;
        this.berat = beratBuah;
        this.harga = hargaBuah;
        this.banyakBeli = banyakBeli;
        hargaAwal();
        mencariDiskon();
        hargaDiskon();
    }

    private void hargaAwal() {
        this.sebelumDiskon = harga * (banyakBeli / berat);
    }

    private void mencariDiskon() {
        this.totalDiskon = (int) (banyakBeli / 4) * (4 * harga) * 0.02;
    }

    private void hargaDiskon() {
        this.setelahDiskon = sebelumDiskon - totalDiskon;
    }

    public void cetakHasil() {
        System.out.println("Nama Buah: " + namaBuah);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah Beli: " + banyakBeli + " kg");
        System.out.println("Harga Sebelum Diskon: Rp." + sebelumDiskon);
        System.out.println("Total Diskon: Rp." + totalDiskon);
        System.out.println("Harga Setelah Diskon: Rp." + setelahDiskon);
        System.out.println();
    }
}

