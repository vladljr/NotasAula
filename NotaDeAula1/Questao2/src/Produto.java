public class Produto {
    private String nome;
    private int codigo;
    private double tamanho;
    private double peso;
    private String cor;
    private double valor;
    private int estoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public void consulta() {
        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Peso: " + peso);
        System.out.println("Cor: " + cor);
        System.out.println("Valor: " + valor);
        System.out.println("Quantidade em Estoque: " + estoque);
    }

    public void reduzirEstoque(int quantidadeVenda) {
        if (quantidadeVenda > estoque) {
            System.out.println("Quantidade inválida! Existem apenas (" + estoque + ") unidades do produto disponíveis em estoque.");
        }
        else {
            estoque -= quantidadeVenda;
            System.out.println("\nQuantidade restante do produto em Estoque: " + estoque);
        }
    }
}
