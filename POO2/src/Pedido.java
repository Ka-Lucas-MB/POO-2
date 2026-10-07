public class Pedido {
    private int numero;
    private double valor;
    private String status = "ABERTO";

    public Pedido(int numero, double valor) {
        this.numero = numero;
        this.valor = valor;
    }

    public void alterarValorPedido(Double valor){
        if (valor > this.valor) {
            this.valor = valor;
        } else {
            System.out.println("Valor não pode ser menor ou igual ao atual.");
        }
    }

        

        public void avancarStatus(){
            if (this.status == "ABERTO") {
                this.status = "PREPARANDO";
            } else if (this.status == "PREPARANDO") {
                this.status = "PRONTO";
            } else {
                this.status = "ENTREGUE";
            }
         }

         public int getNumero() {
             return numero;
         }

         public String getStatus() {
             return status;
         }

         public double getValor() {
             return valor;
         }

         public void podeCancelar(){
            if (status == "ABERTO" || status == "PREPARANDO") {
                System.out.println("PEDIDO PODE SER CANCELADO.");
            } else{
                System.out.println("PEDIDO NÃO PODE SER CANCELADO.");
            }
         }

         public String getResumo(){
            return "Número do pedido: " + this.numero + 
            "\nValor: " + this.valor + 
            "\nStatus: "+ this.status;
         }
         
    
}
