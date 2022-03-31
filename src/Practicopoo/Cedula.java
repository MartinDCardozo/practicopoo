package Practicopoo;

public class Cedula {
    private int numero=1;
    private int digitoVerificador=2;

    public Cedula(int numero, int digitoVerificador) {
        this.numero = numero;
        this.digitoVerificador = digitoVerificador;
    }

    public Cedula() {

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigitoVerificador() {
        return digitoVerificador;
    }

    public void setDigitoVerificador(int digitoVerificador) {
        this.digitoVerificador = digitoVerificador;
    }



}
