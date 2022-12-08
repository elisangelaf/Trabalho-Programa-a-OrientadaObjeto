
public class PessoaFisica extends Pessoa{

	
	public PessoaFisica(String nome, String sobrenome,int idade) {
		 super(nome,sobrenome,idade);
	 }
	
	protected String cpf;
    protected String sobrenome;
    

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    
    public String toString() {
        return super.toString()+
        "\nPessoaFisica:"+
        "\nCpf: "+this.cpf+
        "\nSobrenome: "+this.sobrenome+
        "\n-----------------\n";
    }
}
	
	
	
	
	


