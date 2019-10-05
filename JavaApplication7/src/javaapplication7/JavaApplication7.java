package javaapplication7;
public class JavaApplication7 {
    public static void main(String[] args) {
        int a, b, c, d;
        int x=10;
        for (a=1; a<=9; a++){
            for (b=9; b>=a; b--){
                System.out.print(" ");
                
            }
            for (c=1; c<=a; c++){
                System.out.print("6");
                
            }
            for  (d=1; d<=a-1; d++){
                System.out.print("6");
                
            }
            System.out.println();
            
        }
        for (a=1; a<=10; a++){
            for (b=1; b<=a-1; b++){
                System.out.print(" ");
                
            }
            for (d=10; d>=a; d--){
                System.out.print("6");
                
            }
            for (c=9; c>=a; c--){
                System.out.print("6");
                
            }
            System.out.println("");
        }
    }
    
}
