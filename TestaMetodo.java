public class TestaMetodo { 
    public static void main (String[] args) {
        Conta contaDoPaulo = new Conta();
        contaDoPaulo.saldo = 100; 
        contaDoPaulo.deposita(50);
        System.out.println(contaDoPaulo.saldo);

        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        /*  if(contaDoPaulo.saca(20)){
         System.out.println("conseguir sacar!");
        } else {
            System.out.println("Não conseguiu sacar!");
        }*/
        System.out.println(contaDoPaulo.saldo);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta();
        contaDaMarcela.deposita(1000);
    }
}