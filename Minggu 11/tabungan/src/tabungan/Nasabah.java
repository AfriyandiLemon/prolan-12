package tabungan;
import java.util.Scanner;

public class Nasabah implements Inter {
Scanner input = new Scanner(System.in);
int jum;
String pro;

    @Override
    public void Biodata() {
        System.out.println("Nama Anda : Nasabah ");
        System.out.println("Yang sedang Anda Lakukan : menampilkan Biodata ini ");
    }
    
    @Override
    public void Tabung() {
        System.out.println("Masukkan Jumlah Nominal : "); jum=input.nextInt();
        System.out.println("Maaf, untuk sementara sistem ini tidak dapat anda gunakan");
    
    }

    @Override
    public void Produk() {
   System.out.println("Masukkan Jenis Produk Anda (R/G/P) : "); pro=input.nextLine();
        switch(pro){
            case "R":
            System.out.println("Produk Anda Adalah : Biasa");
            break;
            case "G":
            System.out.println("Produk Anda Adalah : Emas");
            break;
            case "P":
            System.out.println("Produk Anda Adalah : Prioritas");
            break;
        }
            System.out.println("Status membership Anda Adalah : "+pro);
            System.out.println("------------------------------");
                   
    
    }
}
