import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        while (true) {
            System.out.println("Menu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Digite a sua opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    loja = criarLoja(scanner);
                    break;
                case 2:
                    produto = criarProduto(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida");
            }

            if (loja != null && produto != null) {
                verificarProdutoVencido(produto);
                System.out.println(loja.toString());
            }
        }
    }

    public static Loja criarLoja(Scanner scanner) {
        System.out.print("Digite o nome da loja: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de funcionários: ");
        int quantidadeFuncionarios = scanner.nextInt();

        System.out.print("Digite o salário base dos funcionários: ");
        double salarioBaseFuncionario = scanner.nextDouble();
        scanner.nextLine();  // Limpar o buffer do scanner

        System.out.print("Digite o nome da rua: ");
        String nomeDaRua = scanner.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o estado: ");
        String estado = scanner.nextLine();

        System.out.print("Digite o país: ");
        String pais = scanner.nextLine();

        System.out.print("Digite o CEP: ");
        String cep = scanner.nextLine();

        System.out.print("Digite o número: ");
        String numero = scanner.nextLine();

        System.out.print("Digite o complemento: ");
        String complemento = scanner.nextLine();

        Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

        System.out.print("Digite o dia de fundação: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de fundação: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano de fundação: ");
        int ano = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner

        Data dataFundacao = new Data(dia, mes, ano);

        return new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
    }

    public static Produto criarProduto(Scanner scanner) {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite o dia de validade: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mês de validade: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano de validade: ");
        int ano = scanner.nextInt();
        scanner.nextLine();  // Limpar o buffer do scanner

        Data dataValidade = new Data(dia, mes, ano);

        return new Produto(nome, preco, dataValidade);
    }

    public static void verificarProdutoVencido(Produto produto) {
        Data dataVerificacao = new Data(20, 10, 2023);
        if (produto.estaVencido(dataVerificacao)) {
            System.out.println("PRODUTO VENCIDO");
        } else {
            System.out.println("PRODUTO NÃO VENCIDO");
        }
    }
}
