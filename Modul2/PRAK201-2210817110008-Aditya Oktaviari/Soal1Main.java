package Modul2;

public class Soal1Main {

	public static void main(String[] args) {
		Buah apel = new Buah("apel",7000, 0.4,40 );
        Buah mangga = new Buah("mangga", 3500, 0.2,15 );
        Buah alpukat = new Buah("alpukat",10000, 0.25,12 );
        
        apel.cetakHasil();
        mangga.cetakHasil();
        alpukat.cetakHasil();
	}

}
