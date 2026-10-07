public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;


    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void alterarCargo (String cargo){
        this.cargo = cargo.toUpperCase();
    }

    public String getFaixaSalarial(){
        if (salario <= 2000) {
            return "Júnior";
        } else if (salario <= 5000) {
            return "Pleno";
        } else {
            return "Sênior";
        }
            
        }

    public void alterarSalario(double valor){
        if (valor > this.salario) {
            this.salario = valor; 
        } else{
            System.out.println("O novo salário não pode ser menor ou igual que o atual.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }


    }

