package Modul1;
import java.util.Scanner;
public class PRAK105_2210817110008_AdityaOktaviari {

	public static void main(String[] args) {
		 double phi = 3.14;
		 float jariJari,tinggi,volume;
	     
	     try (Scanner scanner = new Scanner(System.in)) {
			 System.out.print("Masukkan Jari-Jari : ");
			 jariJari = scanner.nextFloat();
			 
			 System.out.print("Masukkan Tinggi : ");
			 tinggi = scanner.nextFloat();
		}
	     
	     volume = (float) (phi*(jariJari*jariJari*tinggi));
	     System.out.print("Volume tabung dengan jari-jari " + jariJari + " dan tinggi " + tinggi + " cm adalah " + volume + " m3");
	}	        

}


