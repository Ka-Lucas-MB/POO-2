public class App {
    public static void main(String[] args) throws Exception {
     

       /*  Conta conta = new Conta("Maria");

       conta.depositar(1000);
       conta.depositar(500);
       conta.sacar(300);
       conta.sacar(2000);
       System.out.println("Saldo: "+ conta.getSaldo());
 
*/
        Produto produto = new Produto("Papel", 5, 0);

        produto.adicionarEstoque(100);
        produto.removerEstoque(150);
        System.out.println("Valor do estoque: "+produto.calcularValorEstoque());

    }
}

