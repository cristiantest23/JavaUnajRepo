package Calculadora;

public class NumeroEntero extends Numero  {

    public int num =0;

    public NumeroEntero(int valor)
    {
        this.num=valor;
    }



    @Override
    Numero sumar(Numero n) {
        return new NumeroEntero(Integer.parseInt(n.toString()) + this.num);
    }

    @Override
    Numero restar(Numero n) {
        return new NumeroEntero(Integer.parseInt(n.toString()) - this.num);
    }

    @Override
    Numero multiplicarPor(Numero n) {
        return new NumeroEntero(Integer.parseInt(n.toString()) * this.num);
    }

    @Override
    Numero dividirPor(Numero n) {
        return new NumeroEntero(Integer.parseInt(n.toString()) / this.num);
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }
}
