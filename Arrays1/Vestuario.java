public class Vestuario extends Loja {
    private boolean produtosImportados;

    //construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados, int capacidadeEstoque){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.produtosImportados = produtosImportados;
    }

    // getters e setters
    public boolean getProdutosImportados() {
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }
    
    //toString
    @Override
    public String toString() {
        return "Vestuario [produtosImportados=" + produtosImportados + ", isProdutosImportados()="
                + getProdutosImportados() + "]";
    }
}
