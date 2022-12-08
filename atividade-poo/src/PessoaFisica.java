
public class PessoaFisica extends Pessoa{
	
	public PessoaFisica(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	protected double cpf;
	protected String sobrenome;
	
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	

}
