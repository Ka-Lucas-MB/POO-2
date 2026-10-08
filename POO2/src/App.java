public class App {
    public static void main(String[] args) throws Exception {

        Reserva reserva = new Reserva("Chris Redfield", 5, "pix");

        System.out.println(reserva.getDescricao());
        reserva.setFormaPagamento("Cheque");
       reserva.setFormaPagamento("Cartao");
       reserva.setQuantidadeIngressos(7);
       reserva.setQuantidadeIngressos(6);
       System.out.println(reserva.getDescricao());







     /*   Produto produto = new Produto("GTA VI", 500, 0);

        System.out.println("Valor original: R$"+produto.getPreco());
        produto.setPreco(550);
        System.out.println("Novo valor: R$"+produto.getPreco());
        produto.isEmPromocao();
        produto.setPercentualDesconto(15);
        produto.isEmPromocao();
        System.out.println("Valor com desconto: R$"+produto.getPrecoFinal());



        Pedido pedido = new Pedido(002, 500);

        pedido.alterarValorPedido(50.0);
        pedido.alterarValorPedido(650.0);
        pedido.avancarStatus();
        pedido.podeCancelar();
        System.out.println(pedido.getResumo());

     
           Funcionario funcionario = new Funcionario("Grace Ashcroft", "DEV", 1800);

        System.out.println("--------------------------");
        funcionario.alterarCargo("desenvolvedor");
        System.out.println("Faixa salarial: " + funcionario.getFaixaSalarial());
        funcionario.alterarSalario(1500);
        funcionario.alterarSalario(5500);
    
        System.out.println("--------------------------");
        System.out.println("Nome do funcionário/a: "+ funcionario.getNome());
        System.out.println("Cargo: "+ funcionario.getCargo());
        System.out.println("Salário: "+funcionario.getSalario());
        System.out.println("Faixa salarial: " + funcionario.getFaixaSalarial());

        Ingresso ingresso = new Ingresso("Festa", "Pista", 50);

        ingresso.alterarIngresso("VIP");
        ingresso.alterarPreco(200.0);
        System.out.println("Valor original: "+ingresso.getPreco());
        System.out.println("Valor final: "+ingresso.getPrecoFinal());





      Conta conta = new Conta("Maria");

       conta.depositar(1000);
       conta.depositar(500);
       conta.sacar(300);
       conta.sacar(2000);
       System.out.println("Saldo: "+ conta.getSaldo());
 

        Produto produto = new Produto("Papel", 5, 0);

        produto.adicionarEstoque(100);
        produto.removerEstoque(150);
        System.out.println("Valor do estoque: "+produto.calcularValorEstoque());
*/
    }
}

