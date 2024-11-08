package poliformismo;

public abstract class Fisioterapeuta extends ProfissionalSaude {
	
	private String crefito;
	
	public Fisioterapeuta(String nome, String especialidade, int valorConsulta, String crefito) {
		super(nome, especialidade, valorConsulta);
		this.setCrefito(crefito);
	}
	
	public String getCrefito() {
		return crefito;
	}
	
	public void setCrefito(String crefito) {
		this.crefito = crefito;
	}
	
	@Override
	public abstract void agendarConsulta();
	
	public void exibir () {
		super.exibir();
		System.out.println("CREFITO : " +crefito+ "|");
	}	

}
