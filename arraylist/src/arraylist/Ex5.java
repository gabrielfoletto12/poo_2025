package arraylist;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Ex5 {
 // Crie uma fun��o que receba um ArrayList de strings e retorne o n�mero de ocorr�ncias de uma string espec�fica na lista.
	
	public static void main(String [] args)
	{
	
		ArrayList<String> palavras = new ArrayList<>();
		palavras.add("Teste");
		palavras.add("Maria");
		palavras.add("Joao");
		palavras.add("Jose");
		palavras.add("Sistema");
		palavras.add("carro");
		palavras.add("Computador");
		palavras.add("Teclado");
		
		String pesquisa = JOptionPane.showInputDialog("Informe a palavra");
		int quantidade = 0;
		for (String palavra : palavras) {
			if(pesquisa.equals(palavra)) {
				quantidade++;
			}

	}
	 
	System.out.println("A palavra " + pesquisa + " foi encontrada " + quantidade + " vez(es)");
	}
}