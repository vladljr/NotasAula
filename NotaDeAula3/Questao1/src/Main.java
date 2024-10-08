import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Programador programador = new Programador();

        int menu;

        do {
            System.out.println("\nAdministrador de Funcionários");
            System.out.println("Qual operação você deseja realizar?\nDigite [1] para Cadastrar Programador\nDigite [2] para Cadastrar Gerente\nDigite [3] para Consultar Funcionários Cadastrados\nDigite [0] para SAIR");

            menu = sc1.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Informe o nome do Programador: ");
                    programador.setNome(sc.nextLine());
                    System.out.println("Informe o ano de nascimento do Programador: ");
                    programador.setNasc(sc1.nextInt());
                    System.out.println("Informe o salário do Programador: ");
                    programador.setSalario(sc1.nextDouble());
                    System.out.println("Informe a linguagem (ou linguagens) de programação: ");
                    programador.setLinguagem(sc.nextLine());

                    System.out.println("Programador " + programador.getNome() + " cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Informe o nome do Gerente: ");
                    gerente.setNome(sc.nextLine());
                    System.out.println("Informe o ano de nascimento do Gerente: ");
                    gerente.setNasc(sc1.nextInt());
                    System.out.println("Informe o salário do Gerente: ");
                    gerente.setSalario(sc1.nextDouble());
                    System.out.println("Informe o Projeto do Gerente: ");
                    gerente.setProjeto(sc.nextLine());

                    System.out.println("Gerente " + gerente.getNome() + " cadastrado com sucesso!");
                    break;
                case 3:
                    System.out.println("Programador: " + programador.getNome());
                    System.out.println("Nascimento: " + programador.getNasc());
                    System.out.println("Idade: " + programador.calcularIdade());
                    System.out.println("Salario: " + programador.getSalario());
                    System.out.println("Linguagem: " + programador.informarLinguagem());
                    System.out.println("------------------------------------------------\n");
                    System.out.println("Gerente: " + gerente.getNome());
                    System.out.println("Nascimento: " + gerente.getNasc());
                    System.out.println("Idade: " + gerente.calcularIdade());
                    System.out.println("Salario: " + gerente.getSalario());
                    System.out.println("Projeto: " + gerente.informarProjeto());
                    break;
                case 0:
                    System.out.println("Você escolheu SAIR. Até logo!");
                    break;
            }
        } while (menu != 0);
    }
}