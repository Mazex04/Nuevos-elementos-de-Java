public class Perro {
    
    private String nombre;
    private String  raza;

    public Perro (String n, String r){

        nombre = n;
        raza = r;
    }

    public void  ladrarYRaza(){
        System.out.println(nombre+" Hace Guau Guau"+ " y es de raza "+raza);
    }

    public static void main(String[] args) {
        

        Perro perro = new Perro("Max", "San Bernardo");
        Perro perro1 = new Perro("Luna", "Pincher");
         
        perro.ladrarYRaza();


        perro1.ladrarYRaza();
    }
}
