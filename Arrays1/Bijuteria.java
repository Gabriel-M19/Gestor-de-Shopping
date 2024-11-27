public class Bijuteria extends Loja {
    private double metaVendas;

    //construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.metaVendas = metaVendas;
    }
    //getters e setters

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    //toString

    @Override
    public String toString() {
        return "Bijuteria [metaVendas=" + metaVendas + ", getMetaVendas()=" + getMetaVendas() + "]";
    }
}
