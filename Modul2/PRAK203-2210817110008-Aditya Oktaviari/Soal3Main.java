package Modul2;

public class Soal3Main {

	public static void main(String[] args) {
		Pegawai p1 = new Pegawai();
        //Pada baris dibawah ini terjadi error dikarenakan tidak ada tanda titik koma (;) diakhir baris code
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        
        //Pada baris dibawah ini terjadi error karena deklarasi tidak sesuai dengan yang ada pada class Pegawai, jadi method setJabatan ditambahkan 
        //p1.jabatan = "Assasin";
        p1.setJabatan ("Assasin");
        
        //Pada baris dibawah ini belum terdapat pendeklarasian pada umur
        p1.umur = 17;

        //Pada baris dibawah ini, output yang dibutuhkan ialah "Nama: Roi", oleh karena itu kata Pegawai dihapus
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        
        //Pada baris dibawah ini kurang kata tahun diakhir kalimat, jadi ditambahkan (+ " tahun")
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
	}

}
