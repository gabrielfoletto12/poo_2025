package exercicio5;

public class ProdutoNacional extends Produto{
	private String fabricante;

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	public double calcularPrecoFinal() {
		double preco = getPrecoBase();
		return (preco);
	}

}
