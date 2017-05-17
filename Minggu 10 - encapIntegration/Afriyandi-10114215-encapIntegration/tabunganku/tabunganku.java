
package tabunganku;

import java.util.Scanner;
public class tabunganku {
 int jumlah;
 String jenis;
 Scanner input = new Scanner(System.in);

tabunganku(String jenis, int jumlah){
	this.jumlah = jumlah;
	this.jenis = jenis;
  System.out.println("Jenis penarikan (ATM/teller) adalah :" +jenis);
  System.out.println("Jumlah nominal penarikan :" +jumlah);
  System.out.println("-------------------------------------");
}


public void menabung(){
    int tabung;
    System.out.println("Tuliskan jumlah Nominal yang akan ditabung:");
        tabung=input.nextInt();
    System.out.println("uang yang akan ditabung:"+tabung);
}


}


