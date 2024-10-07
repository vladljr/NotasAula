import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto produto = new Produto();

        int menu;
        int quantidadeVenda;
        int menuVenda;
        double precoVenda;
        double totalVenda;

        do {
            System.out.println("\n __ ADMINISTRADOR DE INVENTÁRIO TABAJARA 3.000 __");
            System.out.println("| Digite [1] para Fazer uma Venda                |");
            System.out.println("| Digite [2] para Cadastrar um Novo Produto      |");
            System.out.println("| Digite [3] para Consultar Produto Cadastrado   |");
            System.out.println("| Digite [0] para SAIR                           |");
            System.out.println("|________________________________________________|");
            System.out.println("Opção:");
            menu = sc2.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Produto disponível: \n");
                    produto.consulta();
                    do {
                        System.out.println("\nQuantas unidades serão compradas?");
                        quantidadeVenda = sc2.nextInt();
                        if (quantidadeVenda > produto.getEstoque()) {
                            System.out.println("\nQuantidade inválida! Existem apenas (" + produto.getEstoque() + ") unidades do produto disponíveis em estoque.");
                        }
                    } while (quantidadeVenda > produto.getEstoque());

                    System.out.println("\nDigite [1] para Pagamento em Pix, Transferência ou Débito (5% de desconto)\nDigite [2] para pagamento em Espécie\nDigite [3] para Pagamento em Crédito (em até 3 parcelas)");
                    menuVenda = sc2.nextInt();
                    switch (menuVenda) {
                        case 1:
                            System.out.println("================== NOTA  FISCAL ==================");
                            System.out.println("Produto: " + produto.getNome());
                            System.out.println("Quantidade: " + quantidadeVenda);
                            System.out.println("Preço por Unidade: " + produto.getValor());
                            totalVenda = ((produto.getValor() * quantidadeVenda) * 0.95);
                            System.out.println("VALOR TOTAL: R$ " + totalVenda);
                            System.out.println("Venda realizada com Sucesso!\n");
                            System.out.println("==================================================");
                            produto.reduzirEstoque(quantidadeVenda);
                            break;
                        case 2:
                            System.out.println("================== NOTA  FISCAL ==================");
                            System.out.println("Produto: " + produto.getNome());
                            System.out.println("Quantidade: " + quantidadeVenda);
                            System.out.println("Preço por Unidade: " + produto.getValor());
                            totalVenda = ((produto.getValor() * quantidadeVenda) * 0.95);
                            System.out.println("VALOR TOTAL: R$ " + totalVenda);
                            System.out.println("\nValor recebido do cliente: R$ ");
                            precoVenda = sc2.nextDouble();
                            if (precoVenda >= totalVenda) {
                                System.out.println("Troco: R$ " + (precoVenda - totalVenda));
                            }
                            else {
                                System.out.println("Pagamento insuficiente!");
                                System.out.println("Total da compra: R$ " + totalVenda);
                                System.out.println("Pagamento recebido: R$ " + precoVenda);
                                System.out.println("Valor Restante: R$ " + (totalVenda - precoVenda));
                            }
                            System.out.println("Venda realizada com Sucesso!\n");
                            System.out.println("==================================================");
                            produto.reduzirEstoque(quantidadeVenda);
                            break;
                        case 3:
                            System.out.println("================== NOTA  FISCAL ==================");
                            System.out.println("Produto: " + produto.getNome());
                            System.out.println("Quantidade: " + quantidadeVenda);
                            System.out.println("Preço por Unidade: " + produto.getValor());
                            totalVenda = (produto.getValor() * quantidadeVenda);
                            System.out.println("VALOR TOTAL: R$ " + totalVenda);
                            System.out.println("Deseja pagar em quantas parcelas (máximo 3)? ");
                            int parcelas = sc2.nextInt();
                            System.out.println("Valor de cada parcela:" + (totalVenda / parcelas));
                            System.out.println("Venda realizada com Sucesso!\n");
                            System.out.println("==================================================");
                            produto.reduzirEstoque(quantidadeVenda);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Digite o NOME do produto:                         ");
                    produto.setNome(sc.nextLine());
                    System.out.println("Digite o CÓDIGO do produto:                       ");
                    produto.setCodigo(sc2.nextInt());
                    System.out.println("Digite o TAMANHO do produto:                      ");
                    produto.setTamanho(sc2.nextDouble());
                    System.out.println("Digite o PESO do produto:                         ");
                    produto.setPeso(sc2.nextDouble());
                    System.out.println("Digite a COR do produto:                          ");
                    produto.setCor(sc.nextLine());
                    System.out.println("Digite o VALOR do produto:                        ");
                    produto.setValor(sc2.nextDouble());
                    System.out.println("Digite a QUANTIDADE do produto em estoque:        ");
                    produto.setEstoque(sc2.nextInt());
                    System.out.println("O produto foi cadastrado com sucesso! Confira as informações abaixo:");
                    produto.consulta();
                    break;
                case 3:
                    produto.consulta();
            }
        } while (menu != 0);

    }
}