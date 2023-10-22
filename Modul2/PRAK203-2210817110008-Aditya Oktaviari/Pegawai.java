package Modul2;

public class Pegawai {
	public String nama;
    //Pada baris dibawah ini, variabel asal bukan memakai tipe data char, namun memakai tipe data String dikarenakan String dapat menyimpan kata
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    //Pada baris dibawah ini property 'asal' bisa berfungsi karena variabel asal sudah di ubah menjadi tipe data String 
    public String getAsal() {
        return asal;
    }
    //Pada baris dibawah ini error karena variabel j belum di deklarasikan. Jadi menambahkan deklarasi String j pada property setJabatan() agar dapat berfungsi
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
