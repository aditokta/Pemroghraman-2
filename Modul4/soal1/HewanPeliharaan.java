package soal1;

public class HewanPeliharaan {
    String namaHewan, rasHewan;
    public HewanPeliharaan(String n, String r) {
        this.namaHewan = n;
        this.rasHewan = r;
    }
    
    public void inputNama() {
        System.out.print("Nama Hewan Peliharaan: ");
    }
    
    public void inputRas() {
        System.out.print("Ras: ");
    }
    
    public void display() {
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + namaHewan);
        System.out.println("Dengan ras : " + rasHewan);
    }
}

