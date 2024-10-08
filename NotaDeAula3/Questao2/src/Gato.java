public class Gato extends Animal{

    public Gato(){}
    public Gato(String nome, String raça){
        super(nome, raça);
    }

    public void apresentacao(){
        System.out.println("Meu "+ getRaça() + " se chama "+ getNome());
    }

    public void mia (){
        System.out.println("o gato quer comer e começou a miou alto");
    }

    public void mfim(){
        caminha();
    }
}