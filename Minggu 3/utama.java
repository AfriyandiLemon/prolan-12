public class utama{
public static void main(String[] args) {

Nasabah Bernio = new Nasabah();
Bernio.bank = "Mandiri";
Bernio.menabung();
Bernio.konsultasi();
System.out.print("Bank yang dituju: "+Bernio.bank);
}
}