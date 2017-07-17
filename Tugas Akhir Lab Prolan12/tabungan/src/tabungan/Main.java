package tabungan;

import java.util.Scanner;
import layanan.Bunga;
import layanan.Jasa;

public class Main {

    public static Scanner input2 = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;
        Nasabah Afriyandi = new Nasabah();
        Pegawai Roni = new Pegawai();
        Jasa tahapan = new Jasa("ATM", 400000);
        Bunga b = new Bunga("Teller", 500000);

        do {

            System.out.println("\nMENU");

            System.out.println("1.Nasabah");

            System.out.println("2.Pegawai");

            System.out.println("3.program Bunga tambahan");

            System.out.println("0.Keluar");

            System.out.println("Masukkan Pilihan Anda:");

            pilih = input2.nextInt();

            switch (pilih) {

                case 1:
                    Afriyandi.Biodata();
                    Afriyandi.Produk();
                    Afriyandi.tampil();

                    break;

                case 2:
                    Roni.Biodata();
                    Roni.Tabung();
                    Roni.Produk();
                    Roni.tampil();

                    break;

                case 3:
                    b.setNama();
                    b.setTabungan();
                    b.setJumlah();

                    System.out.println("----------------OUTPUT-----------------");
                    b.getNama();
                    b.getTabungan();
                    b.getJumlah();
                    b.getTambahan();
                    b.getTotal();

                    break;

            }

        } while ((pilih != 0) || (pilih > 3));

        System.out.println("Terima kasih telah menggunakan jasa Kami, silakan berkunjung lagi!!");

    }

}
