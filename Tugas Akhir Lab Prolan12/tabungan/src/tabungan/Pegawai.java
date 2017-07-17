package tabungan;

import java.util.Scanner;

public class Pegawai implements Inter {

    Scanner input = new Scanner(System.in);
    String nama, product, alamat, jenis;
    boolean paket;
    int jumlah, saldo = 0;

    @Override
    public void Biodata() {
        System.out.println("-----------Input DATA PEGAWAI------------");
        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        alamat = input.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P) : ");
        jenis = input.nextLine();

    }

    @Override
    public void Tabung() {
        System.out.println("-------PROGRAM TABUNG------- ");
        System.out.println("Masukkan Jumlah Nominal : ");
        jumlah = input.nextInt();
        saldo = saldo + jumlah;
    }

    @Override
    public void Produk() {
        System.out.print("Masukkan Jenis Produk Anda (R/G/P) : ");
        product = input.next();
        System.out.println("\n");

    }

    public void tampil() {
        System.out.println("-----------DATA PEGAWAI------------");
        System.out.println("\n");
        System.out.println("Nama   :" + nama);
        System.out.println("Alamat :" + alamat);
        System.out.println("Gender :" + jenis);
        System.out.println("Saldo Anda sekarang : " + saldo);
        switch (product) {
            case "R":
                System.out.println("Produk Anda Adalah : Regular");
                break;
            case "G":
                System.out.println("Produk Anda Adalah : Gold");
                break;
            case "P":
                System.out.println("Produk Anda Adalah : Platinum");
                break;
            default:
                System.out.println("Produk Anda Adalah : tidak terdaftar");
        }
        System.out.println("Pilihan Anda Adalah : " + product);
        System.out.println("+++++++++++++++++++++++++++++++");
    }

}
