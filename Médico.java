package poliformismo;

public abstract class Médico extends ProfissionalSaude {

	
	private String crm;

	public Médico(String nome, String especialidade, int valorConsulta, String crm) {
		super(nome, especialidade, valorConsulta);
		this.setCrm(crm);
	
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	@Override
	public abstract void agendarConsulta();
	
	public void exibir () {
		super.exibir();
		System.out.println("CRM : " +crm+ "|");
	}	
	

	
	
	
}
