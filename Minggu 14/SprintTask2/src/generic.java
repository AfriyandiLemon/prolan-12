
public class generic <T> {
    

    private static void getNik() {
        System.out.println(12);
    }
    public static <T> void Nim(T Nim) {
        System.out.println(Nim);
    }
    
    public static <T> void angka (T angka) {
        System.out.println(angka);
    }
    
    public static void main (String[] args){
      
      getNik();
      Nim("112314141");
     angka(50000);
        
    }

    

    

    
    
}
