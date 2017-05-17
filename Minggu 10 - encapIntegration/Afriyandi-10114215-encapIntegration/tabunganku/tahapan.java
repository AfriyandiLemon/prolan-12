package tabunganku;

public class tahapan extends tabunganku {

    public tahapan(String jenis, int jumlah) {
        super(jenis, jumlah);
        System.out.println("Konstruktor setelah modifikasi berhasil");
    }

    public void transfer() {
        int transfer;
        System.out.println("Tuliskan jumlah Nominal yang akan ditransfer:");
        transfer = input.nextInt();
        System.out.println("Nominal jumlah transfer :RP " + transfer);
    }
}

class layan {

    public static void main(String args[]) {

        tahapan mandiri = new tahapan("ATM", 45000);
        tabunganku bca = new tabunganku("Teller", 40000);
        tampil tampilan = new tampil();
        tampil1 Tampilan = new tampil1();
        Bunga b = new Bunga();

        bca.menabung();
        System.out.println("---------------------------------------");
        mandiri.transfer();
        System.out.println("---------------------------------------");
        tampilan.tampilnama();
        Tampilan.tampilnama();
        System.out.println("---------------------------------------");
        
        b.setNama();
        b.setJumlah(150000);
        b.setTabungan();
         System.out.println("---------------------------------------");
          System.out.println("----------------OUTPUT-----------------");
          b.getNama();
          b.getJumlah();
          b.getTabungan();
          b.getTambahan();
          b.getTotal();
        

    }

}
