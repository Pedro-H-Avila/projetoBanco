public class Conta{

    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void deposita(double valor){
        this.saldo += valor;
    }
    public boolean saca(double valor) { 
        if(this.saldo >= valor) {
            this.saldo += - valor;
            return true;
        } 
            return false;
        }
    public void transfere (double valor, Conta destino) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }

}
