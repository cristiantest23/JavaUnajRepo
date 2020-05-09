package Calculadora;

public abstract class Numero {


    abstract Numero sumar(Numero n);
    abstract Numero restar(Numero n);
    abstract Numero multiplicarPor(Numero n);
    abstract Numero dividirPor(Numero n);

    @Override
    public String toString() {
        return super.toString();
    }
}