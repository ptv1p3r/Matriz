package driver;
import proldan.utilitarios.*;

/**
 * @author Pedro Roldan on 04-11-2016.
 * @version 0.0
 */
public class App {

    public static void main(String [] args){
        //Matriz m1 = new Matriz(5,3);
        Matriz m1 = new Matriz(5);

        m1.imprimir();
        m1.PreencherValor(2.5f);
        m1.imprimir();
        System.out.println("Matriz 1:\n" + m1);
    }
}
