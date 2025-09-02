package exercicio5;

public class ProdutoImportado extends Produto{
	private String paisOrigem;

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	public double calcularPrecoFinal() {
		double preco = getPrecoBase();
		return (preco*1.15);
	}
	

}
