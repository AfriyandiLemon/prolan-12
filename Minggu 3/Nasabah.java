import java.util.Scanner;

public class Nasabah {
Scanner input = new Scanner(System.in);
String NoRek ;
String nama,bank ; 
char JenisKelamin;

public void menabung(){
int jumlah;
System.out.print("Masukkan Jumlah Setoran        :" ); jumlah=input.nextInt();
System.out.print("Setoran berhasil !! setoran senilai "+jumlah);
System.out.println(" telah masuk ke tabungan");
}
public void konsultasi(){
	System.out.println("Saya ingin konsultasi");
}

}