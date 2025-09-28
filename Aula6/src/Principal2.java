
public class Principal2 {
	public static void main(String[] args) {
		
		Endereco e1 = new Endereco();
		e1.setCep("72007625");
		e1.setLogradouro("72007625");
		e1.setNumero(3);
		
		String nome = "Maria da Conceição";
		
		Aluno a1 = new Aluno(nome, e1);
		a1.setRa("12345678");
		
		System.out.println(a1.getNome() + " - " +
							a1.getRa() + " - " +	
							a1.getEndereco().getLogradouro());
	}

}
