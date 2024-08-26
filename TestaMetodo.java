public class TestaMetodo { 
    public static void main (String[] args) {
        Conta conta001 = new Conta();
        conta001.saldo = 100; 
        conta001.deposita(50);
        System.out.println(conta001.saldo);

        boolean conseguiuRetirar = conta001.saca(20);
        /*  if(conta001.saca(20)){
         System.out.println("conseguir sacar!");
        } else {
            System.out.println("Não conseguiu sacar!");
        }*/
        System.out.println(conta001.saldo);
        System.out.println(conseguiuRetirar);

        Conta conta002 = new Conta();
        conta002.deposita(1000);
    }
}
