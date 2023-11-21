package soal1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        HewanPeliharaan peliharaan = new HewanPeliharaan("", "");
        
        peliharaan.inputNama();
        String namahewan = inputan.nextLine();
        
        peliharaan.inputRas();
        String rashewan = inputan.nextLine();

        peliharaan = new HewanPeliharaan(namahewan, rashewan);
        
        peliharaan.display();
        
        inputan.close();
    }
}

