package arraylist;
import java.util.ArrayList;
import java.util.HashSet;


public class Ex2 {
	public static int contarUnicos(ArrayList<String> lista){
		HashSet<String> unicos = new HashSet<>(lista); // remove duplicados
	       return unicos.size();
	}
	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Ma��");
        frutas.add("Banana");
        frutas.add("Ma��");
        frutas.add("Laranja");
        frutas.add("Banana");

        System.out.println("N�mero de elementos �nicos: " + contarUnicos(frutas));
	}

			
}
