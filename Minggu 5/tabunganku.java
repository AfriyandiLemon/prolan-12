
public class tabunganku {
 int jumlah;
 String jenis;


tabunganku(String jenis, int jumlah){
	this.jumlah = jumlah;
	this.jenis = jenis;
  System.out.println("Jenis penarikan (ATM/teller) adalah :" +jenis);
  System.out.println("Jumlah nominal penarikan :" +jumlah);

}
}
