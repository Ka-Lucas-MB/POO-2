import java.util.Set;

public class Produto {
    private String nome;
    private double preco;
    private int percentualDesconto;

    public Produto(String nome, double preco, int percentualDesconto) {
        setNome(nome);
        this.preco = preco;
        setPercentualDesconto(percentualDesconto);
    }

    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        if (nome == null) {
            System.out.println("Dado inválido.");
        } else{
        this.nome = nome.trim();
        }
    }

    public void setPreco(double preco) {
        if (preco > 0 ) {
           this.preco = preco;  
        } else {
            System.out.println("Valor inválido.");
        }
    }

    public void setPercentualDesconto(int percentualDesconto) {
        if (percentualDesconto >= 0 && percentualDesconto <= 50) {
            this.percentualDesconto = percentualDesconto;
        } else {
            System.out.println("Valor inválido.");
        }
         
    }
        public int getPercentualDesconto() {
            return percentualDesconto;
        }

        public double getPreco() {
            return preco;
        }

    public double getPrecoFinal(){
    this.preco = (this.preco - this.preco * this.percentualDesconto /100);
    return this.preco;
    }

    public void isEmPromocao(){
        if (this.percentualDesconto > 0) {
            System.out.println("Produto está em promoção de "+this.percentualDesconto+"%");
        } else {
            System.out.println("Produto não está na promoção");
        }
    }
    
    
}
