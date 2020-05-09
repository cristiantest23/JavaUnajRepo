package Calculadora;


public class NumeroComplejo extends Numero{

    public double real=0;
    public double imag=0;


    public NumeroComplejo(double real,double imag)
    {
        this.real=real;
        this.imag=imag;
    }

    public double getReal() {
        return real;
    }
    public double getImag() {
        return imag;
    }


    @Override
    public String toString() {
        return String.valueOf(real +","+ imag);
    }

    @Override
    Numero sumar(Numero n) {

        double nReal = ((NumeroComplejo) n).getReal();
        double nImag = ((NumeroComplejo) n).getImag();
        return  new NumeroComplejo((this.real+nReal),(this.imag+nImag));
    }

    @Override
    Numero restar(Numero n) {
        double nReal = ((NumeroComplejo) n).getReal();
        double nImag = ((NumeroComplejo) n).getImag();
        return  new NumeroComplejo((this.real-nReal),(this.imag-nImag));
    }

    @Override
    Numero multiplicarPor(Numero n) {
        double nReal = ((NumeroComplejo) n).getReal();
        double nImag = ((NumeroComplejo) n).getImag();
        return  new NumeroComplejo((this.real*nReal),(this.imag*nImag));
    }

    @Override
    Numero dividirPor(Numero n) {
        double nReal = ((NumeroComplejo) n).getReal();
        double nImag = ((NumeroComplejo) n).getImag();
        return  new NumeroComplejo((this.real/nReal),(this.imag/nImag));
    }
}
