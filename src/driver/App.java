package driver;
import proldan.utilitarios.*;

/**
 * @author Pedro Roldan on 04-11-2016.
 * @version 0.0
 */
public class App {

    public static void main(String [] args){
        Matriz m1 = new Matriz(4,4);
        //Matriz m2 = null;
        Matriz m2 = new Matriz(m1);
        Matriz m3 = null;

        m1.preencherAleatorio(-10.0f,10.0f);
        System.out.println("M1:");
        m1.imprimir();

        //m2 = Matriz.gerarIdentidade(4,4);
        System.out.println("M2 = I");
        m2.imprimir();

        m3 = m2.multiplicarMatriz(m1);
        System.out.println("M3 = M2 * M1");
        m3.imprimir();

        //System.out.println("Matriz 1:\n" + m1);
    }
}
