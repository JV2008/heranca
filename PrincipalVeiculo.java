package poliformismo;

public class PrincipalVeiculo {

	public static void main(String[] args) {
		Automovel carro1 = new Automovel(": Bugatti |  ", ": Chiron |", ": Azul |",  2020, 2, ": V16"); 
		
		carro1.exibirinfo();
	
		Moto moto1 = new Moto (": Honda |",": Hornet |",": Vermelha |", 2015, 600);
	
		moto1.exibirinfo();
	
	
	}
}