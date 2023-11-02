package PRAK301_2210817110008_AdityaOktaviari;

import java.util.Scanner;

public class MainSoal1 {
	public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        Dadu dadu = new Dadu();

        int inputan = masukan.nextInt();

        dadu.Inputan(inputan);
        dadu.mencariNilai();

        masukan.close();
    }
}
