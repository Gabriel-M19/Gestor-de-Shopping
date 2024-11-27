public class Informatica extends Loja{
    private double seguroEletronicos;

    //construtor
    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int capacidadeEstoque, double seguroEletronicos){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getValorSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setValorSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return "Informatica [seguroEletronicos=" + seguroEletronicos + ", getSeguroEletronicos()="
                + getValorSeguroEletronicos() + "]";
    }

    public int getSeguroEletronicos() {
       
        throw new UnsupportedOperationException("Unimplemented method 'getSeguroEletronicos'");
    }

    public void setSeguroEletronicos(int i) {
     
        throw new UnsupportedOperationException("Unimplemented method 'setSeguroEletronicos'");
    }
    
    
}
/*Crie uma classe chamada Informatica, que é um tipo de loja, representando 
uma loja de informática. As lojas de informática possuem como atributos (além 
de tudo que uma Loja tem) um valor do tipo double chamado 
seguroEletronicos, que representa um seguro que lojas que vendem 
aparelhos eletrônicos devem pagar mensalmente. Crie um construtor para a 
classe, que receba informações para inicializar todos os atributos. Além disso, crie 
os métodos de acesso dos atributos (os métodos que ainda não existem) e 
sobrescreva o método toString, incluindo a informação específica da classe. */
