package PRAK303_2210817110008_AdityaOktaviari;

import java.util.ArrayList;
import java.util.Scanner;

public class MainSoal3 {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        ArrayList<Mahasiswa> mahasiswaList = new ArrayList<>();

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = masukan.nextInt();
            masukan.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = masukan.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = masukan.nextLine();

                    Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                    mahasiswaList.add(mahasiswa);

                    System.out.println("Mahasiswa " + nama + " ditambahkan.");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String nimHapus = masukan.nextLine();
                    boolean removed = false;

                    for (Mahasiswa mhs : mahasiswaList) {
                        if (mhs.getNim().equals(nimHapus)) {
                            mahasiswaList.remove(mhs);
                            removed = true;
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                            break;
                        }
                    }

                    if (!removed) {
                        System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                    }

                    break;

                case 3:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari: ");
                    String nimCari = masukan.nextLine();
                    boolean found = false;

                    for (Mahasiswa mhs : mahasiswaList) {
                        if (mhs.getNim().equals(nimCari)) {
                            System.out.println("Mahasiswa ditemukan:");
                            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                    }

                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Mahasiswa mhs : mahasiswaList) {
                        System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
        
        masukan.close();
    }
}
