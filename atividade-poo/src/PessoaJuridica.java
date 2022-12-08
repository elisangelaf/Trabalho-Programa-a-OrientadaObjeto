
public class PessoaJuridica extends Pessoa{
	
	public PessoaJuridica(String nome) {
		super(nome);
		
	}
	
	protected double cnpj;
	protected String razaoSocial;
	
	public double getCnpj() {
		return cnpj;
	}
	public void setCnpj(double cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	
	
	

}
