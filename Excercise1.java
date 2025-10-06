import java.util.Scanner;
public class Excercise1 {
    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantos valores deseas ingresar ");
        int datos = sc.nextInt();

        int [] numeros = new int [datos];

        for (int i =0; i < numeros.length; i++){
            System.out.println("Ingresa el valor "+(i+1));
            numeros[i] = sc.nextInt();    
        }
        int numMayor = numeros[0];
        int numMenor = numeros[0];

        for (int i =0; i < numeros.length; i++){
            
            if(numeros[i] > numMayor){
                numMayor = numeros[i];
            }else if (numeros[i]< numMenor){
                numMenor = numeros[i];
            }
        }
        System.out.println("El numero mayor es "+numMayor);
        System.out.println("El numero menor es "+numMenor);
        sc.close();
    }
}