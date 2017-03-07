import java.util.Scanner;

public class Nasabah {
int NoRek ;
String nama,bank ; 

public void menabung(){
Scanner setor = new Scanner(System.in);
int jumlah;
System.out.print("Masukkan Jumlah Setoran        :" ); jumlah=setor.nextInt();
System.out.print("Setoran berhasil !! setoran senilai "+jumlah);
System.out.println(" telah masuk ke tabungan");
}
public void konsultasi(){
	System.out.println("Saya ingin konsultasi");
}

}