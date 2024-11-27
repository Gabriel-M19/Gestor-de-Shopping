import java.util.Arrays;

public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor que recebe o nome, endereço e capacidade máxima de lojas
    public Shopping(String nome, Endereco endereco, int capacidadeLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[capacidadeLojas];
    }

    // Métodos de acesso para os atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    // Método toString para representação textual do objeto Shopping
    @Override
    public String toString() {
        return "Shopping{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                ", lojas=" + Arrays.toString(lojas) +
                '}';
    }

    // Método para inserir uma nova loja no shopping
    public boolean insereLoja(Loja loja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = loja;
                return true;
            }
        }
        return false;  // Não há espaço disponível para mais lojas no shopping
    }

    // Método para remover uma loja do shopping pelo nome
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false;  // Loja não encontrada no shopping
    }

    // Método para contar a quantidade de lojas por tipo
    public int quantidadeLojasPorTipo(String tipo) {
        int count = 0;
        for (Loja loja : lojas) {
            if (loja != null && loja.getClass().getSimpleName().equals(tipo)) {
                count++;
            }
        }
        if (tipo.equals("Cosmetico") || tipo.equals("Vestuario") || tipo.equals("Bijuteria") || tipo.equals("Alimentacao") || tipo.equals("Informatica")) {
            return count;
        } else {
            return -1;  // Tipo de loja inválido
        }
    }

    // Método para encontrar a loja de informática com maior valor de seguro
    public Informatica lojaSeguroMaisCaro() {
        Loja lojaMaisCara = null;
        double maiorValorSeguro = 0;

        for (Loja loja : lojas) {
            if (loja instanceof Informatica) {
                Informatica informatica = (Informatica) loja;
                if (informatica.getValorSeguroEletronicos() > maiorValorSeguro) {
                    maiorValorSeguro = informatica.getValorSeguroEletronicos();
                    lojaMaisCara = informatica;
                }
            }
        }

        return (Informatica) lojaMaisCara;
    }
}
