public class Cachorro extends Animal{

    public Cachorro(){}
    public Cachorro(String nome, String raça){
        super(nome,raça);
    }

    public void apresentacao (){
        System.out.println("Meu "+ getRaça() + " se chama "+ getNome());
    }
    public void late(){
        System.out.println("Ele latiu em resposta.");
    }

    public void fim(){
        caminha();
    }
}