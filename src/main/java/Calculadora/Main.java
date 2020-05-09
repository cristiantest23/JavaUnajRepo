package Calculadora;

public class Main {

    public static void main(String[] args) throws Exception {
        NumeroMatriz numero = new NumeroMatriz();
        int matriz_uno[][] = new int[3][3];

        matriz_uno[0][0]=numero.valor;
        matriz_uno[0][1]=numero.valor;
        matriz_uno[0][2]=numero.valor;
        matriz_uno[1][0]=1;
        matriz_uno[1][1]=2;
        matriz_uno[1][2]=3;
        matriz_uno[2][0]=1;
        matriz_uno[2][1]=2;
        matriz_uno[2][2]=3;

        int matriz_dos[][] = new int[3][3];
        matriz_dos[0][0]=1;
        matriz_dos[0][1]=2;
        matriz_dos[0][2]=3;
        matriz_dos[1][0]=1;
        matriz_dos[1][1]=2;
        matriz_dos[1][2]=3;
        matriz_dos[2][0]=1;
        matriz_dos[2][1]=2;
        matriz_dos[2][2]=3;

        int matriz_resultante[][] = new int[3][3];
        CalculadoraDeMatrices calculadoraDeMatrices = new CalculadoraDeMatrices();

        boolean trasnponer=false;

        try {
            matriz_resultante = calculadoraDeMatrices.sumar(matriz_uno,matriz_dos);
            matriz_resultante = calculadoraDeMatrices.resta(matriz_uno,matriz_dos);
            matriz_resultante=calculadoraDeMatrices.transponer(matriz_uno);
            trasnponer=true;

        } catch(Exception e){
            System.out.println("Matrices de diferente dimensión");
        }

        //imprimiendo las matrices
        for (int i = 0; i < matriz_uno.length; i++) {

            if(!trasnponer){
            for (int j = 0; j < matriz_uno.length; j++) {
                System.out.print("[ " + matriz_uno[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < matriz_dos.length; j++) {
                System.out.print("[ " + matriz_dos[i][j] + " ]");
            }

            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }
            }

            for (int j = 0; j < matriz_resultante.length; j++) {
                System.out.print("[ " + matriz_resultante[i][j] + " ]");
            }

            System.out.println("");
        }

        NumeroEntero num1e = new NumeroEntero(10);
        NumeroEntero num2e = new NumeroEntero(10);
        System.out.println(num1e.sumar(num2e).toString());
        System.out.println(num1e.restar(num2e).toString());
        System.out.println(num1e.multiplicarPor(num2e).toString());
        System.out.println(num1e.dividirPor(num2e).toString());

        NumeroReal num1r = new NumeroReal(10.5);
        NumeroReal num2r = new NumeroReal(10.5);
        System.out.println(num1r.sumar(num2r).toString());
        System.out.println(num1r.restar(num2r).toString());
        System.out.println(num1r.multiplicarPor(num2r).toString());
        System.out.println(num1r.dividirPor(num2r).toString());

        NumeroComplejo num1c = new NumeroComplejo(2,1);
        NumeroComplejo num2c = new NumeroComplejo(2,1);
        System.out.println(num1c.sumar(num2c).toString());
        System.out.println(num1c.restar(num2c).toString());
        System.out.println(num1c.multiplicarPor(num2c).toString());
        System.out.println(num1c.dividirPor(num2c).toString());

    }
}
