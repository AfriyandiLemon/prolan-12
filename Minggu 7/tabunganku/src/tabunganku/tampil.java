
package tabunganku;


public class tampil {
    void tampilnama(){
    String nama;
    nama = "Bentoku";
    System.out.println("coba untuk ditampilkan :"+nama);
}
    }
class tampil1 extends tampil{
@Override
public void tampilnama(){
    String nama = "Glade";
System.out.println("coba untuk ditampilkan :"+nama);
super.tampilnama();

}
}

