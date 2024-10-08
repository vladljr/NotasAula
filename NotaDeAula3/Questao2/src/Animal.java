public class Animal {

    private String nome, raça;

    public Animal(){}

    public Animal(String nome, String raça){
        this.nome = nome;
        this.raça = raça;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setRaça(String raça){
        this.raça = raça;
    }
    public String getRaça(){
        return raça;
    }

    public void caminha (){
        System.out.println("O " + raça + " esta caminhando para longe");
    }
}