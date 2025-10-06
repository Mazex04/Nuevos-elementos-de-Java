public class Main {
    
    public static int numMayor (int [] numeros){
        int mayor = numeros[0];

        for (int i =1; i < numeros.length; i++){

            if(numeros[i] > mayor){
                mayor = numeros[i];
            }else if (numeros[i]== mayor){
                System.out.println("El numero mayor " +numeros[i]+ " se repite" );
            }
        }
        return mayor;

        }

        public static void main(String[] args) {
            
            int[] lista = {8,5,6,2,5,8};
            System.out.println("El numero mayor de la lista es "+numMayor(lista));
        }


        


}
