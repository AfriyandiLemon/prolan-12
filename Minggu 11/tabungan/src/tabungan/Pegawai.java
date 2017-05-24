package tabungan;

import java.util.Scanner;

public class Pegawai implements Inter {
Scanner input = new Scanner(System.in);
String nama,product,alamat,jenis;
boolean paket;
int jumlah,saldo=0;
    @Override
    public void Biodata() {
            System.out.println("-----------Input DATA PEGAWAI------------");
        System.out.print("Masukkan Nama : "); nama=input.nextLine();
        System.out.print("Masukkan Alamat : "); alamat=input.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P) : "); jenis=input.nextLine();
        System.out.println("---------Biodata PEGAWAI---------");
        System.out.println("Nama Pegawai :"+nama);
        System.out.println("Alamat Pegawai :"+alamat);
        System.out.println("Jenis Kelamin Pegawai :"+jenis);
        
    }

    @Override
    public void Tabung() {
        System.out.println("-------PROGRAM TABUNG------- ");
        System.out.println("Masukkan Jumlah Nominal : "); jumlah=input.nextInt();
        saldo = saldo + jumlah;
        System.out.println("Saldo Anda sekarang : "+saldo);
        System.out.println("+++++++++++++++++++++++++++++++");
        
    }
    

    @Override
    public void Produk() {
        System.out.println("Masukkan Jenis Produk Anda (R/G/P) : "); 
        product=input.nextLine();
        switch(product){
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
            product=input.nextLine();   
                    }
        System.out.println("Pilihan Anda Adalah : "+product);
    }
    
}
