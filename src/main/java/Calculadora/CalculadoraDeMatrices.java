package Calculadora;

public class CalculadoraDeMatrices {

    public int[][] sumar(int[][] matriz_uno, int[][] matriz_dos) throws Exception {

        int matriz_resultante[][] = new int[3][3];
        if(validaMatriz(matriz_uno,matriz_dos)){

            for (int i = 0; i < matriz_uno.length; i++) {
                for (int j = 0; j < matriz_dos.length; j++) {
                    matriz_resultante[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
                    //matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
                }
            }

        }
        else
            throw new Exception();


        return matriz_resultante;
    }

    public int[][] resta(int[][] matriz_uno, int[][] matriz_dos) throws Exception {

        int matriz_resultante[][] = new int[3][3];
        if(validaMatriz(matriz_uno,matriz_dos)) {
            for (int i = 0; i < matriz_uno.length; i++) {
                for (int j = 0; j < matriz_dos.length; j++) {
                    matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
                    //matriz_resultante[i][j] = matriz_uno[i][j] - matriz_dos[i][j];
                }
            }
        }
        else
            throw new Exception();

        return matriz_resultante;
    }

    private boolean validaMatriz ( int[][] m1, int[][] m2){
            if ((m1.length == m2.length) && (m1[0].length == m2[0].length)) {
                System.out.println("TRUE");
                return true;
            } else {
                System.out.println("FALSE");
                return false;
            }

        }

    public int[][] transponer(int[][] matriz)
    {
        int aux = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        return matriz;
    }

}
