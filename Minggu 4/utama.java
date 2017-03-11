public class utama {
public static void main(String[] args) {

Nasabah Adi = new Nasabah();
Adi.bank = "Mandiri";
Adi.nama = "Adi Suparman";
Adi.JenisKelamin = 'L';
Adi.NoRek = "900032356364332";
Adi.Kode = 101;
Adi.menabung();
if (Adi.Kode == 101){
System.out.println("Nama Nasabah     : "+Adi.nama);
System.out.println("Jenis Kelamin    : "+Adi.JenisKelamin);
System.out.println("Nomor Rekening   : "+Adi.NoRek);
System.out.println("Bank             : "+Adi.bank);
Adi.konsultasi();
System.out.print("Bank yang dituju : "+Adi.bank);}
else {System.out.println("Maaf Kode yang anda masukkan tidak dikenal");}


}
}