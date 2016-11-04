package proldan.utilitarios;

/**
 * @author Pedro Roldan on 04-11-2016.
 * @version 0.0
 */
public class Matriz {

    static float[][] fltMatriz;

    private int intLinhas, intColunas;

    /**
     * Override ao metodo toString para devolver o array interno em string
     * @return builderTemporario
     */
    @Override
    public String toString(){
        StringBuilder builderTemporario = new StringBuilder();

        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            // colunas
            for(int k=0; k < fltMatriz[0].length; k++){
                builderTemporario.append(fltMatriz[i][k] + " ");
            }
            builderTemporario.append("\n");
        }


        return builderTemporario.toString();
    }

    /**
     * Construtor para matrizes quadradas
     * @param tamanho
     */
    public Matriz(int tamanho) {
        fltMatriz = new float[tamanho][tamanho];

    }

    /**
     * Construtor matrizes rectangulares
     * @param linhas
     * @param colunas
     */
    public Matriz(int linhas, int colunas) {
        fltMatriz = new float[linhas][colunas];
    }

    /**
     * Construtor de cópia
     */
    //public Matriz() {
    //}

    public void gerarIdentidade(){

    }

    public void gerarDiagonal(){

    }

    /**
     * Preenchimento da matriz com valor passado
     * @param valor
     */
    public void PreencherValor(float valor){
        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            // colunas
            for(int k=0; k < fltMatriz[0].length; k++){
                fltMatriz[i][k] = valor;
            }
        }
    }

    public void PreencherAleatorio(){

    }

    public void somarMatriz(){

    }

    public void somarFator(){

    }

    public void multiplicarMatriz(){

    }

    public void multiplicarFator(){

    }

    /**
     * Metodo que imprime o array interno
     */
    public void imprimir(){

        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            // colunas
            for(int k=0; k < fltMatriz[0].length; k++){
                System.out.print(fltMatriz[i][k]+" ");
            }
            System.out.println();
        }
    }

}
