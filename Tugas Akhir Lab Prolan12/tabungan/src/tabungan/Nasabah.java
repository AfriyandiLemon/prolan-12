package tabungan;

import java.util.Scanner;

public class Nasabah implements Inter {

    Scanner input = new Scanner(System.in);

    int jum, jlh_data;
    String pro, nama, alamat, jenis;

    @Override
    public void Biodata() {
        System.out.println("-----------INPUT DATA NASABAH------------");
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P) : ");
        jenis = input.nextLine();
    }

    @Override
    public void Tabung() {
        System.out.println("-----------DATA TABUNGAN NASABAH------------");
        System.out.println("Masukkan Jumlah Nominal : ");
        jum = input.nextInt();
        System.out.println("Maaf, untuk sementara sistem ini tidak dapat anda gunakan");

    }

    @Override
    public void Produk() {
        System.out.print("Masukkan Jenis Produk Anda (R/G/P) : ");
        pro = input.nextLine();

    }

    public void tampil() {
        System.out.println("-----------DATA NASABAH------------");
        System.out.println("\n");
        System.out.println("Nama   :" + nama);
        System.out.println("Alamat :" + alamat);
        System.out.println("Gender :" + jenis);
        switch (pro) {
            case "R":
                System.out.println("Produk Anda Adalah : Biasa");
                break;
            case "G":
                System.out.println("Produk Anda Adalah : Emas");
                break;
            case "P":
                System.out.println("Produk Anda Adalah : Platinum");
                break;
        }
        System.out.println("Status membership Anda Adalah : " + pro);
        System.out.println("------------------------------");
    }
}
