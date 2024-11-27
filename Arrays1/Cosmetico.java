public class Cosmetico extends Loja{
    private double taxaComercializacao;

    //construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.taxaComercializacao = taxaComercializacao;
        
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return "Cosmetico [taxaComercializacao=" + taxaComercializacao + ", getTaxaComercializacao()="
                + getTaxaComercializacao() + ", getNome()=" + getNome() + ", getEndereco()=" + getEndereco()
                + ", getDataFundacao()=" + getDataFundacao() + ", getQuantidadeFuncionarios()="
                + getQuantidadeFuncionarios() + ", getSalarioBaseFuncionario()=" + getSalarioBaseFuncionario() + "]";
    }
}
