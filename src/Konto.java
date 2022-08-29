
public class Konto {

    private String navn;
    private int saldo;


    public Konto(String navn, int saldo) {
        this.navn = navn;
        this.saldo = saldo;
    }

    public Konto (String navn) { // overloaded constructor

        this.navn = navn;
        this.saldo = 0;
    }

    public int getSaldo() {

        return saldo;
    }

    public String getNavn() {

        return navn;
    }
}
