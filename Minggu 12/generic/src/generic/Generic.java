package generic;

class Pegawai <T> {
    private T nik;
    
   public Pegawai(T nik){
       this.nik=nik;
   }
   public void setNik(T nik){
       this.nik=nik;
   } 
   
   public T getNik (){
        return nik;
   }
   
   public void getType(){
       System.out.println("Tipe awalnya"+nik.getClass().getName());
   }
}

public class Generic {

    public static void main(String[] args) {
       Pegawai<Integer> p = new Pegawai<>(12345678);
       int y = p.getNik();
       System.out.println("Tipe Data Integer :"+y);
       
       System.out.println("---------------------");
       
       Pegawai<String> p2 = new Pegawai<>("12345678");
       String z = p2.getNik();
       System.out.println("Tipe Data String :"+z);
    }
    
}
