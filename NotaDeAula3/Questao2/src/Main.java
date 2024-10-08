import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        Cachorro c = new Cachorro("Bob","Cachorro");
        Gato g = new Gato("Parry","Gato");

        c.apresentacao();
        c.late();
        c.caminha();
        g.apresentacao();
        g.mia();
        g.mfim();


    }
}