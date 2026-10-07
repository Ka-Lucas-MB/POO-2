public class Ingresso {
    private String nomeEvento;
    private String tipo;
    private double preco;


    


    public Ingresso(String nomeEvento, String tipo, double preco) {
        this.nomeEvento = nomeEvento;
        this.tipo = tipo;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void alterarIngresso(String tipo){
        if (tipo == "Pista" || tipo == "VIP" || tipo == "Camarote") {
            this.tipo = tipo;
        } else{
            System.out.println("Valor invalido");
        }
    
    }

    public void alterarPreco(Double preco){
        if (tipo == "Pista" && preco > 50) {
            this.preco = preco;
    } else if (tipo == "VIP" && preco > 100){
        this.preco = preco;
    } else if (tipo == "Camarote" && preco > 200){
        this.preco = preco;
    } else {
        System.out.println("Valor invalido!");
    }

    }

    public double getPrecoFinal(){
        if (tipo == "Pista") {
            this.preco = this.preco+(this.preco * 0.10);
         
        } else if (tipo == "VIP") {
             this.preco = this.preco+(this.preco * 0.05);
           
        } else if (tipo == "Camarote") {
           this.preco = this.preco+(this.preco * 0.02);
        }
        return this.preco;
    }


}
