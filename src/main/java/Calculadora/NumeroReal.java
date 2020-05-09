package Calculadora;

public class NumeroReal  extends Numero{

    public double num=0;
    public NumeroReal(double valor)
    {
        this.num = valor;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

    @Override
    Numero sumar(Numero n) {

        return new NumeroReal(Double.parseDouble(n.toString()) + this.num);
    }

    @Override
    Numero restar(Numero n) {
        return new NumeroReal(Double.parseDouble(n.toString()) - this.num);
    }

    @Override
    Numero multiplicarPor(Numero n) {
        return new NumeroReal(Double.parseDouble(n.toString()) * this.num);
    }

    @Override
    Numero dividirPor(Numero n) {
        return new NumeroReal(Double.parseDouble(n.toString()) / this.num);
    }
}
