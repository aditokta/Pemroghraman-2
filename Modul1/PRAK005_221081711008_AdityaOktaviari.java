import java.util.Scanner;

public class PRAK005_221081711008_AdityaOktaviari {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Makanan Favorit: ");
        String makananFavorit = scanner.nextLine();

        System.out.print("Masukkan Hobi: ");
        String hobi = scanner.nextLine();

        System.out.println("Aku Suka Makan " + makananFavorit + ", dan Hobiku " + hobi);

        scanner.close();
    }
}
