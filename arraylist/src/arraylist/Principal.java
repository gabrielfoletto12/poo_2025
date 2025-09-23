package arraylist;
import java.util.ArrayList;

public class Principal {
	
	public static void main(String[] args)
	{
		ArrayList<String> veiculos = new ArrayList<String>();
		veiculos.add("Monza");
		veiculos.add("Marea");
		
		

		for(int i = 0; i < veiculos.size();i++) {
			System.out.println(veiculos.get(i));
		}
		
		veiculos.set(0, "Vectra");
		
		System.out.println(veiculos);
		
		veiculos.remove(1);
		
		System.out.println(veiculos);

	}

}
 