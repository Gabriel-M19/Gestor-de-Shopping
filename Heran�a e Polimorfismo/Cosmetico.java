public class Cosmetico extends Loja{
    private double taxaComercializacao;

    //construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao){
        super(nome, quantidadeFuncionarios, endereco, dataFundacao);
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
