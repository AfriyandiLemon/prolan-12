package generic;

public class NewClass {
    
    private static <T,N> void dual (T x,N y){
           System.out.println(x+"as"+y);
        }
    
    
    private static <T> void method (T method){
        System.out.println(method);
    }
    
     private static <T> void method2 (T method2){
        System.out.println(method2);
    }
     
      private static <T> void method3 (T method3){
        System.out.println(method3);
    }
             


public static void main (String[] args){
 
    dual(2,"3");
    method(1);
    method2('a');
    method3("metthod 3");
}


}