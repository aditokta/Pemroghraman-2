package Modul1;
import java.util.Scanner;
public class PRAK103_2210817110008_AdityaOktaviari {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int i = 0;
			
			System.out.print(" ");
			int deret = scanner.nextInt();
			
			System.out.print(" ");
			int angkaAwal = scanner.nextInt();

			do {
			    if (angkaAwal % 2 == 1) {
			        System.out.print(angkaAwal);
			        if (i < deret - 1) {
			            System.out.print(", ");
			        }
			        i++;
			    }
			    angkaAwal++;
			} while (i < deret);
			System.out.println();
			
		}

	}

}
