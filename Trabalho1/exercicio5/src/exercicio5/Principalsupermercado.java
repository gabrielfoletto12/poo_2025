package exercicio5;

public class Principalsupermercado {
	public static void main(String[] args) {
		ProdutoPerecivel leite = new ProdutoPerecivel();
        leite.setCategoria("Alimento Perecivel");
        leite.setNome("Leite Integral");
        leite.setCodigoBarras("111222333444");
        leite.setPrecoBase(5.50);
        

    
        ProdutoNacional arroz = new ProdutoNacional();
        arroz.setCategoria("Alimento Nacional");
        arroz.setNome("Arroz Branco 5kg");
        arroz.setCodigoBarras("555666777888");
        arroz.setPrecoBase(22.00);

        
        ProdutoImportado vinho = new ProdutoImportado();
        vinho.setCategoria("Bebida");
        vinho.setNome("Vinho Chileno");
        vinho.setCodigoBarras("999000111222");
        vinho.setPrecoBase(80.00);
        
        //Leite
          System.out.printf(
                "Categoria: " + leite.getCategoria() +
                "\nNome: " + leite.getNome() +
                "\nCodigoBarras: " + leite.getCodigoBarras() +
                "\nPrecoBase: " + leite.getPrecoBase() +
                "\nPrecoFinal com 20 por cento de desconto: " + leite.calcularPrecoFinal() +
                "\n                         \n"
            );

            // Arroz
            System.out.printf(
                "Categoria: " + arroz.getCategoria() +
                "\nNome: " + arroz.getNome() +
                "\nCodigoBarras: " + arroz.getCodigoBarras() +
                "\nPrecoBase: " + arroz.getPrecoBase() +
                "\nPrecoFinal sem alterações: " + arroz.calcularPrecoFinal() +
                "\n                             \n"
            );

            // Vinho
            System.out.printf(
                "Categoria: " + vinho.getCategoria() +
                "\nNome: " + vinho.getNome() +
                "\nCodigoBarras: " + vinho.getCodigoBarras() +
                "\nPrecoBase: " + vinho.getPrecoBase() +
                "\nPrecoFinal com 15 por cento de acrescimo: " + vinho.calcularPrecoFinal() +
                "\n                      \n"
            );

  }
}
