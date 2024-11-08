package poliformismo;

public abstract class Dentista extends ProfissionalSaude {
	
	private String cro;

	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
		super(nome, especialidade, valorConsulta);
		this.setCro(cro);
	
	}
	
	public String getCro() {
		return cro;
	}	
	
	public void setCro(String cro) {
		this.cro = cro;
	}

	
	@Override
	public abstract void agendarConsulta();
	
	public void exibir () {
		super.exibir();
		System.out.println("CRO : " +cro+ "|");
	}	
}

