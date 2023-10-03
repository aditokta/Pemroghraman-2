package Modul1;
import java.util.Scanner;
public class PRAK102_221081711008_AdityaOktaviari {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int angkaPertama = input.nextInt();
			int deret = 10;
			int i = 0;
			
			System.out.print("");
			while (i <= deret) {
			    int angka = (angkaPertama % 5 == 0) ? angkaPertama / 5 - 1 : angkaPertama;
			    System.out.print(angka);
			    if (i <= deret - 1) {
			        System.out.print(",");
			    }
			    angkaPertama++;
			    i++;
			}
		}

	}
}
