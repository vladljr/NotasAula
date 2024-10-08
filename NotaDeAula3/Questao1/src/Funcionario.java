import java.time.Year;

public class Funcionario {
    protected String nome;
    protected int nasc;
    protected double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public int getNasc() {
        return nasc;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void informarSalario() {
        System.out.println("Salário do Funcionário" + nome + ": R$ " + salario);
    }

    public int calcularIdade() {
        int anoPresente = Year.now().getValue();
        return (anoPresente - nasc);
    }
}