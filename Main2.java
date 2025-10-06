
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main2 {
    
    public static void main (String [] args){


        Stack<Pila> pila = new Stack<>();
        Stack<Integer> pila2 = new Stack<>();

        Queue<Pila> cola = new LinkedList<>();

        pila.add(new Pila("Oscar", "Cardenas", "541561"));
        pila.add(new Pila("Fernando", "Aranda", "794654"));
        pila.add(new Pila("Sebastian", "Ortiz", "4984156"));

        Pila usuario = pila.pop(); // Sacar el ultimo elemento ingresado en la pila
        System.out.println(usuario.getNombre());
        usuario =pila.pop();
       // System.out.println(usuario.getNombre());
        usuario = pila.pop();
        
       //  if(pila.isEmpty()) System.out.println("Está vacia");
    
        pila2.add(1); 
        pila2.add(2); 
        pila2.add(3); 
        cola.add(new Pila("Oscar", "Cardenas", "4894564") );
        cola.add(new Pila("Fernando", "Aranda", "5498465") );
        cola.add(new Pila("Jorge", "Ortiz", "4189165") );

        Pila usr = cola.poll();
        System.out.println(usr.getNombre());

        cola.clear();
        pila.clear();

        //Pila usuario1 = cola.peek(); // Variable peek me permite ver el dato sin afectar la pila
        //System.out.println(usuario1.getNombre());
        }

}
