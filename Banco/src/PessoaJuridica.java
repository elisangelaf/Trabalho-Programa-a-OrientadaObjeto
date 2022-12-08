
public class PessoaJuridica extends Pessoa{
	
	protected String Cnpj;
	protected String RazaoSocial;
	
	
	public PessoaJuridica(String nome, String sobrenome, int idade) {
        super( nome, sobrenome, idade);
    }

	
	public String getCnpj() {
		return this.Cnpj;
	}
	
	public void setCnpj(String Cnpj) {
		this.Cnpj = Cnpj;
	}
	
	public String getRazaoSocial() {
		return this.RazaoSocial;
	}
	
	public void setRazaoSocial(String RazaoSocial) {
		this.RazaoSocial = RazaoSocial;
	}

	public String toString() {
		return super.toString() + 
				"\nPessoaJuridica" +
				"\nCnpj: " + this.Cnpj +
				"\nRazãoSocial: " + this.RazaoSocial +
				"\n-------------------\n";
	}
	}
	
