public class Vehiculo {
    
    String marca;
    int velocidad;

    public Vehiculo (String m, int v){

        marca = m;
        velocidad = v;
    }

    public void acelerar(int incremento){
        velocidad+=incremento;
        System.out.println("Con una velocidad inicial de 120 ");
        System.out.println("Con una velocidad de incremento de "+velocidad );

    }
    void mostrar(){
        System.out.println(marca+ " tiene una velocida final de "+velocidad+" km/h");
    }
}