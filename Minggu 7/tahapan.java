package tabunganku;

public class tahapan extends tabunganku {
     
	
	 
	public tahapan(String jenis,int jumlah){
		super(jenis,jumlah);
                System.out.println("setelah modifikasi konstruktor berhasil");
			}
	
	public void transfer(int transfer){
		System.out.println("Nominal jumlah transfer :RP " +transfer);
		}
}



class layan {
  
public static void main(String args[]) {
    
	tahapan mandiri = new tahapan("ATM",45000);
        tabunganku bca = new tabunganku("Teller",40000);
	tampil tampilan = new tampil();
        tampil1 Tampilan = new tampil1();
        
        bca.menabung();
        mandiri.transfer(30000);
        System.out.println("---------------------------------------");
        tampilan.tampilnama();
        Tampilan.tampilnama();
}

}