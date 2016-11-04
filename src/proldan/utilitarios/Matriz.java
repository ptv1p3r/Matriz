package proldan.utilitarios;

/**
 * @author Pedro Roldan on 04-11-2016.
 * @version 0.0
 */
public class Matriz {

    static float[][] fltMatriz;

    private int intLinhas, intColunas;

    /**
     * Getter para a variavel linhas
     * @return intLinhas
     */
    private int getLinhas() {
        return intLinhas;
    }

    /**
     * Getter para a variavel colunas
     * @return intColunas
     */
    private int getColunas() {
        return intColunas;
    }

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
                builderTemporario.append(String.format("%.2f ",fltMatriz[i][k]));
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
     * Construtor matrizes
     * @param linhas
     * @param colunas
     */
    public Matriz(int linhas, int colunas) {
        fltMatriz = new float[linhas][colunas];
        this.intLinhas = linhas;
        this.intColunas = colunas;
    }

    /**
     * Construtor matrizes com valor
     * @param linhas
     * @param colunas
     * @param valor
     */
    public Matriz(int linhas, int colunas, float valor) {
        fltMatriz = new float[linhas][colunas];
        preencherValor(valor);
    }

    /**
     * Construtor por copia
     * @param matriz
     */
    public Matriz(Matriz matriz){
        this(matriz.getLinhas(), matriz.getColunas());
    }

    /**
     * Gera matriz identidade
     * @param linhas
     * @param colunas
     * @return Matriz
     */
    public static Matriz gerarIdentidade(int linhas, int colunas){
        Matriz mResultado = new Matriz(linhas,colunas);

        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            mResultado.fltMatriz[i][i] = 1;
        }


        return mResultado;
    }

    public static void gerarDiagonal(){

    }

    /**
     * Preenchimento da matriz com valor passado
     * @param valor
     */
    public void preencherValor(float valor){
        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            // colunas
            for(int k=0; k < fltMatriz[0].length; k++){
                fltMatriz[i][k] = valor;
            }
        }
    }

    /**
     * Preenche matriz com valor aleatorio dentro de limites min e max
     * @param min
     * @param max
     */
    public void preencherAleatorio(float min, float max){

        if (min >= max) {
            throw new IllegalArgumentException("max tem que ser maior que min");
        }

        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            // colunas
            for(int k=0; k < fltMatriz[0].length; k++){
                fltMatriz[i][k] = (float)(Math.random() * ((max - min) + 1)) + min;
            }
        }
    }

    public void somarMatriz(){

    }

    public void somarFator(){

    }

    public Matriz multiplicarMatriz(Matriz m){
        Matriz mResultado = new Matriz(getLinhas(),m.getColunas());
        m.imprimir();
        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            for(int j=0; j < fltMatriz[0].length; j++){
                /*for (int k = 0; k < fltMatriz[0].length; k++) {
                    //mResultado.fltMatriz[i][j] += (fltMatriz[i][k] * matriz.fltMatriz[k][j]);
                    System.out.print(this.fltMatriz[k][j]);
                }*/
                System.out.print(m);
            }
        }


        return mResultado;
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
                System.out.print(String.format("%.2f ",fltMatriz[i][k]));
            }
            System.out.println();
        }
    }

}
