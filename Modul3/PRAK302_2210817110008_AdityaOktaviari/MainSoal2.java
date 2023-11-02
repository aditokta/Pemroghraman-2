package PRAK302_2210817110008_AdityaOktaviari;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class MainSoal2 {
    public static void main(String[] args) {
    	Scanner masukan = new Scanner(System.in);

        int jumlahNegara = Integer.parseInt(masukan.nextLine());
        List<Negara> negaraList = new LinkedList<>();

        for (int i = 0; i < jumlahNegara; i++) {
            String namaNegara = masukan.nextLine();
            String jenisKepemimpinan = masukan.nextLine();
            String namaPemimpin = masukan.nextLine();

            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;

            if (!jenisKepemimpinan.equals("monarki")) {
                tanggalKemerdekaan = Integer.parseInt(masukan.nextLine());
                bulanKemerdekaan = Integer.parseInt(masukan.nextLine());
                tahunKemerdekaan = Integer.parseInt(masukan.nextLine());
            }

            Negara negara = new Negara(namaNegara, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }

        Map<Integer, String> namaBulan = new HashMap<>();
        namaBulan.put(1, "Januari");
        namaBulan.put(2, "Februari");
        namaBulan.put(3, "Maret");
        namaBulan.put(4, "April");
        namaBulan.put(5, "Mei");
        namaBulan.put(6, "Juni");
        namaBulan.put(7, "Juli");
        namaBulan.put(8, "Agustus");
        namaBulan.put(9, "September");
        namaBulan.put(10, "Oktober");
        namaBulan.put(11, "November");
        namaBulan.put(12, "Desember");

        for (Negara negara : negaraList) {
            System.out.println("Negara " + negara.getNama() + " mempunyai " + (negara.getJenisKepemimpinan().equals("monarki") ? "Raja" : "Presiden") +
                    " bernama " + negara.getNamaPemimpin());

            if (!negara.getJenisKepemimpinan().equals("monarki")) {
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggalKemerdekaan() + " " +
                        namaBulan.get(negara.getBulanKemerdekaan()) + " " + negara.getTahunKemerdekaan());
            }

            System.out.println();
        }
        
        masukan.close();
    }
}
