
import java.util.ArrayList;
import java.util.Collections;

public class Principal {
	public static void main(String [] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		
		Produto p1 = new Produto();
		p1.setNome("Televisão");
		p1.setPreco(5000);
		
		Produto p2 = new Produto();
		p2.setNome("PS5");
		p2.setPreco(6000);
		
		Produto p3 = new Produto();
		p3.setNome("Celular");
		p3.setPreco(3000);
		
		produtos.add(p1);
		produtos.add(p2);
		produtos.add(p3);
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + " - " + produto.getPreco());
			
		}
		
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + " - " + produto.getPreco());	
			
		}
	}

}
