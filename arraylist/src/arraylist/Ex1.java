package arraylist;
import java.util.ArrayList;

public class Ex1 {
	public static void main(String [] args)
	{
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Cozinha");
		lista.add("Banheiro");
		lista.add("Quarto");
		
		System.out.println(lista.size());
		
		if (lista.contains("Cozinho")) {
			System.out.println("Cozinho" + " Esta na lista");		
		}else {
			System.out.println("Cozinho" + " Não Esta na lista");	
			
		}
	}

}
