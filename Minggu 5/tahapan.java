
public class tahapan extends tabunganku {

	
	 
	public tahapan(String jenis,int jumlah){
		super(jenis,jumlah);
			}
	
	public void transfer(int transfer){
		System.out.print("Nominal jumlah transfer :RP " +transfer);
		}

public static void main(String argd[]) {
	tahapan mandiri = new tahapan("asd",45000);
	mandiri.transfer(300000);
}


}