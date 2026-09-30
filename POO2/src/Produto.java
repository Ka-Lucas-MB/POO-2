public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicionarEstoque(double valor){
        if (valor > 0) {
            this.quantidade += valor;
            System.out.println("Adição de estoque realizada.");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void removerEstoque(double valor){
        if (quantidade <= 0) {
           System.out.println("Valor inválido!");
        } else if (valor > this.quantidade) {
            System.out.println("Estoque insuficiente!");
        } else{
             this.quantidade -= valor;
             System.out.println("Remoção de estoque realizada.");
        }
    }

    public double calcularValorEstoque(){
        return preco * quantidade;
    }

}
