public class Programador extends Funcionario{
    private String linguagem;

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String informarLinguagem() {
        return linguagem;
    }
}