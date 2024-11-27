public class Alimentacao extends Loja{
    private Data dataAlvara;

     //construtor
    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int capacidadeEstoque) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, capacidadeEstoque);
        this.dataAlvara = dataAlvara;
    }

    //getters e setters
    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
    }

    //toString
    @Override
    public String toString() {
        return "Alimentacao [dataAlvara=" + dataAlvara + ", getDataAlvara()=" + getDataAlvara() + "]";
    }
    

    
}
/*• Crie uma classe chamada Alimentacao, que é um tipo de loja, representando 
uma loja de alimentação. As lojas de alimentação possuem como atributo (além 
de tudo que uma Loja tem) um valor do tipo Data chamado dataAlvara, 
que indica a data que a loja de alimentação recebeu o alvará de funcionamento. 
Crie um construtor para a classe, que receba informações para inicializar todos 
os atributos. Além disso, crie os métodos de acesso dos atributos (os métodos 
que ainda não existem) e sobrescreva o método toString, incluindo a 
informação específica da classe. */
