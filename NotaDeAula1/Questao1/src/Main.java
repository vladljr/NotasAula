import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println(".---------  Calculadora de Média de Notas  ---------.");

        System.out.println("Informe o nome do aluno: ");
        aluno.setNome(sc.nextLine());

        System.out.println("Informe a primeira nota do aluno: ");
        aluno.setNota1(sc2.nextDouble());

        System.out.println("Informe a segunda nota do aluno: ");
        aluno.setNota2(sc2.nextDouble());

        System.out.println("Informe a terceira nota do aluno: ");
        aluno.setNota3(sc2.nextDouble());

        aluno.exibirDetalhesAluno();
    }
}