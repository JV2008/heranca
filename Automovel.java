package poliformismo;

public class Automovel extends Veiculo {

	private int numeroPortas; 	
	private String motor;


	public Automovel(String marca, String modelo, String cor, int ano, int numeroPortas, String motor) {
		super(marca, modelo, cor, ano);
		this.numeroPortas = numeroPortas;
		this.motor = motor;
	}


	public void exibirinfo () {
		super.exibirinfo();
		System.out.println("Numero de Portas: " +numeroPortas+ "|" + " Motor: " +motor +"|");
	}
}