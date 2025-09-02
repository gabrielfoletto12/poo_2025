package exercicio5;

public class ProdutoPerecivel extends Produto {
	private String dataValidade;
	
	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double calcularPrecoFinal() {
	double preco = getPrecoBase();
	return (preco*0.8);
	}
}
