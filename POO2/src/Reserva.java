public class Reserva {
    private String cliente;
    private double quantidadeIngressos;
    private String formaPagamento;


    public Reserva(String cliente, double quantidadeIngressos, String formaPagamento) {
        this.cliente = cliente;
        setQuantidadeIngressos(quantidadeIngressos);
        this.formaPagamento = formaPagamento;
    }

    public void setQuantidadeIngressos(double quantidadeIngressos) {
        if (quantidadeIngressos >=1 && quantidadeIngressos <= 6) {
            this.quantidadeIngressos = quantidadeIngressos;  
        } else {
            System.out.println("Dados inválidos.");
        }
    }


    public void setFormaPagamento(String formaPagamento) {
        if (formaPagamento.equalsIgnoreCase("PIX")) {
           this.formaPagamento = formaPagamento;  
        } else if (formaPagamento.equalsIgnoreCase("CARTAO")) {
            this.formaPagamento = formaPagamento;
        } else if (formaPagamento.equalsIgnoreCase("DINHEIRO")) {
            this.formaPagamento = formaPagamento;
        } else {
            System.out.println("Dados inválidos.");
        }

       
    }

    public int getTaxa(){
        if (this.formaPagamento.equalsIgnoreCase("PIX")) {
            return 0;
        } else if (this.formaPagamento.equalsIgnoreCase("DINHEIRO")) {
            return 0;
        } else if (this.formaPagamento.equalsIgnoreCase("CARTAO")) {
            return 5;
        } else{
            return 0;
        }
        
    }

    public double getValorTotal(){
        return (this.quantidadeIngressos * 35 + (this.quantidadeIngressos * 35 * getTaxa()/100));
       // this.preco = (this.preco - this.preco * this.percentualDesconto /100)
    }

   public String getDescricao(){
    return "Nome do cliente: "+ this.cliente +
    "\nQuantidade de ingressos: "+ this.quantidadeIngressos + 
    "\nForma de pagamento: "+ this.formaPagamento + 
    "\nValor total: R$"+ getValorTotal();  
   }



    public String getCliente() {
        return cliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public double getQuantidadeIngressos() {
        return quantidadeIngressos;
    }
    
}
