
import java.util.Scanner;

public class Excercise4 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        System.out.println("Que tabla deseas ver");
        int tabla = sc.nextInt();
            for (int j = 1 ; j < 11; j++ ){
                System.out.println(tabla + " x "+ j+ " = "+ (tabla*j));
            }

            int s =8;

            for (int i = 0; i < 11 ; i++){
                System.out.println(s);

                if (s >= i){
                    System.out.println("mayor");
                }else {
                    System.out.println("menor");
                }
           
                for (int d = 0; d < 10; d++) {
                    System.out.println(i+d+s);

                    if( i>s && s<d && i>d){
                    System.out.println("mayor");
                    }else if (i<s && s>d && i<d){
                        System.out.println("menor");
                    }
                }
            }

            

            sc.close();
        
    }
}