import java.util.Scanner;
public class nilai {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
nilai pilih = new nilai();
byte n,x=1;
int m;
int max=0,min=1000;
char pil;

	System.out.print("masukkan jumlah bilangan input :"); n=input.nextByte(); 
        System.out.print("masukkan pilihan A/B :"); pil=input.next().charAt(0);
		while (x<=n) {
			System.out.print("Masukkan nilai ke-"+x+": ");m=input.nextInt();
					x++;
					

	if(pil == 'A'){
        max = pilih.pilihanA(m,max);}else{
        min= pilih.pilihanB(m,min);
        }
                }
     System.out.println("jumlah bilangan  :"+n);
     if(pil=='A'){
         System.out.println("pilihan           : "+pil);
         System.out.println("bilangan maksimum : "+max);
     }else{
         System.out.println("pilihan          : "+pil);
         System.out.println("bilangan minimum : "+min);
     }
                
                
}
 int pilihanA(int x, int maks ){
    if (x > maks) {
		maks=x;
	return maks;
		} return maks;
}
int pilihanB(int y, int min){
    if(y < min){
            min=y;
            return min;
    }       return min;
}

}
