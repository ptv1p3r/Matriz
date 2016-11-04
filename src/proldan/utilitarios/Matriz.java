package proldan.utilitarios;

/**
 * @author Pedro Roldan on 04-11-2016.
 * @version 0.0
 */
public class Matriz {

    private float[][] fltMatriz;

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
        for(int i=0; i < colunas; i++){
            mResultado.fltMatriz[i][i] = 1;
        }

        return mResultado;
    }

    /**
     * Cria uma matriz com uma diagonal com valor
     * @param linhas
     * @param colunas
     * @param valor
     * @return
     */
    public static Matriz gerarDiagonal(int linhas, int colunas, float valor){
        Matriz mResultado = new Matriz(linhas,colunas);

        // linhas
        for(int i=0; i < colunas; i++){
            mResultado.fltMatriz[i][i] = valor;
        }

        return mResultado;
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

    /**
     * Soma o conteudo de duas matrizes
     * @param matriz
     * @return Matriz
     */
    public Matriz somarMatriz(Matriz matriz){
        Matriz mResultado = new Matriz(matriz.getLinhas(),matriz.getColunas());

        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            // colunas
            for(int k=0; k < fltMatriz[0].length; k++){
                mResultado.fltMatriz[i][k] = fltMatriz[i][k] + matriz.fltMatriz[i][k];
            }
        }


        return mResultado;
    }

    /**
     * Soma um valor a todos os elementos da matriz
     * @param valor
     */
    public void somarFator(float valor){
        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            // colunas
            for(int k=0; k < fltMatriz[0].length; k++){
                fltMatriz[i][k] += valor;
            }
        }
    }

    /**
     * Multiplica duas matrizes
     * @param m
     * @return Matriz
     */
    public Matriz multiplicarMatriz(Matriz m){
        Matriz mResultado = new Matriz(getLinhas(),m.getColunas());

        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            for(int j=0; j < m.fltMatriz[0].length; j++){
                for (int k = 0; k < m.fltMatriz.length; k++) {
                    mResultado.fltMatriz[i][j] += (fltMatriz[i][k] * m.fltMatriz[k][j]);
                }
            }
        }

        return mResultado;
    }

    /**
     * Multiplica um valor por todos os elementos da matriz
     * @param valor
     */
    public void multiplicarFator(float valor){
        // linhas
        for(int i=0; i < fltMatriz.length; i++){
            // colunas
            for(int k=0; k < fltMatriz[0].length; k++){
                fltMatriz[i][k] *= valor;
            }
        }
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
