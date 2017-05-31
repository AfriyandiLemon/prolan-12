package tabungan;
import java.util.Scanner;
import java.util.ArrayList;
public class Nasabah implements Inter {
Scanner input = new Scanner(System.in);
ArrayList arr = new ArrayList();
int jum,jlh_data;
String pro,nama,alamat,jenis;

    @Override
    public void Biodata() {
        System.out.print("Masukkan Jumlah Data Input : "); jlh_data=input.nextInt();
        System.out.println("\nInput Data");
        for(int a = 0; a < jlh_data; a++){
          
        System.out.println("Masukkan Data ke "+(a+1)+":");
        System.out.println();
        System.out.println("Masukkan Nama : ");nama=input.nextLine();
        System.out.print("Masukkan Alamat : "); alamat=input.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P) : "); jenis=input.nextLine();
        arr.add(nama);  arr.add(alamat);  arr.add(jenis);
        }
        System.out.println("\nData yang tersimpan");
        for(Object i : arr){
           System.out.println(i);
            
            }
             
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
