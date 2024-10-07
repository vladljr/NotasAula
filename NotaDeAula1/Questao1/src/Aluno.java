public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota2() {
        return nota2;
    }
    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    public double getNota3() {
        return nota3;
    }
    public double calcularMedia() {
        media = (this.nota1 + this.nota2 + this.nota3) / 3;
        return media;
    }

    public double getMedia() {
        return media;
    }

    public void verificarAprovacao(double media) {
        if (media >= 7)
            System.out.println("O aluno " + nome + " está aprovado.\n");
        else if (media >= 4)
            System.out.println("O aluno " + nome + " fará a prova final.\n");
        else
            System.out.println("O aluno " + nome + " está reprovado.\n");
    }

    public void exibirDetalhesAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Media: " + calcularMedia());
        verificarAprovacao(getMedia());
    }
}