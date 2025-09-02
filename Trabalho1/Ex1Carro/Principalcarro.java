
public class Principalcarro {
	public static void main(String[] args) {
		
		List<Veiculo> veiculos = new ArrayList<>();
	
		Carro carro1 = new Carro();
		carro1.setMarca("Toyota");
        carro1.setModelo("Corolla");
        carro1.setAno(2020);
        carro1.setPlaca("ABC-1234");
        carro1.setValorDiaria(150.0);
        
        Moto moto1 = new Moto();
        moto1.setMarca("Honda");
        moto1.setModelo("CB500");
        moto1.setAno(2022);
        moto1.setPlaca("XYZ-9876");
        moto1.setValorDiaria(100.0);
        
        Caminhao caminhao1 = new Caminhao();
        caminhao1.setMarca("Volvo");
        caminhao1.setModelo("FH 540");
        caminhao1.setAno(2019);
        caminhao1.setPlaca("JKL-4567");
        caminhao1.setValorDiaria(300.0);
        
        int dias = 5;

        for (Veiculo v : veiculos) {
            System.out.println("Modelo: " + v.getModelo());
            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Valor do aluguel por " + dias + " dias: R$ " + v.calcularAluguel(dias));
            System.out.println("-----------------------------------");
		
	}

}
