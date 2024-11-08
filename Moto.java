package poliformismo;

public class Moto extends Veiculo {

	private int cilindrada;

	
	public Moto(String marca, String modelo, String cor, int ano, int cilindrada) {
		super(marca, modelo, cor, ano);
		this.cilindrada = cilindrada;
	}

	public void exibirinfo (){
		super.exibirinfo();
		System.out.println("Cilindrada: " +cilindrada);
		
	};
	

}
