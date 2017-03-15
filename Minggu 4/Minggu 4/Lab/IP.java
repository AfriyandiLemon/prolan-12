import java.util.Scanner;
import java.text.DecimalFormat; 

public class IP{
	public static void main ( String[] args) {
		IP ipmhs = new IP();
		Scanner input = new Scanner(System.in);

	float Ip, ratarata, totalIP=0;
	int JmlMahasiswa=0 ,JmlMahasiswaLls=0, JmlMhsTdkLls=0;
	System.out.print("Masukkan input IP ");Ip=input.nextFloat();
	while (Ip != -999) {
		if (ipmhs.IsWithinRange(Ip,0,4) == 1){
			JmlMahasiswa++;
			totalIP= totalIP + Ip;
	}
	if (Ip >= 2.75 && Ip <= 4){
		JmlMahasiswaLls++;
	}
	
	System.out.print("Masukkan input IP ");Ip=input.nextFloat();
}
	JmlMhsTdkLls = JmlMahasiswa - JmlMahasiswaLls;
	ratarata = totalIP / JmlMahasiswa;
	
	System.out.print("Jumlah Mahasiswa adalah : ");	
		if(JmlMahasiswa==0){
			System.out.println("Tidak ada data");
		} else {System.out.println(JmlMahasiswa);}
	System.out.print("Jumlah Mahasiswa Lulus adalah : ");	
		if(JmlMahasiswaLls==0){
			System.out.println("Tidak ada data");
		} else {System.out.println(JmlMahasiswaLls);}
	System.out.print("Jumlah Mahasiswa tidak Lulus adalah : ");	
		if(JmlMhsTdkLls==0){
			System.out.println("Tidak ada data");
		} else {System.out.println(JmlMhsTdkLls);}
	System.out.print("Rata-rata IP kelas adalah : ");	
		if(ratarata==0){
			System.out.println("Tidak ada data");
		} else {System.out.println(ratarata);}

}


// rentang ip
public int IsWithinRange(float x, int min, int max){
if ( x >= min && x <= max ) {
return 1; } else 
{
return 0;
}
}



}