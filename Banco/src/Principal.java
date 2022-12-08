
public class Principal  {
	
	public static void main(String[] args) {
		Pessoa jeova = new Pessoa("Jeová", "Tavares", 37);
		Conta c = new Conta(jeova);
		c.creditar(2000.0);
		c.debitar(100);

		Pessoa samuel = new Pessoa("Samuel", "Rodrigues", 37);
		ContaEspecial c2 =
			new ContaEspecial(samuel, 200);
		c2.debitar(500);
		
		ContaPoupanca c3 = new ContaPoupanca(
				new Pessoa("Agamenon", "Quinderé", 25), 
				10000);
		
		c3.rendeJuros();

		PessoaFisica Elisangela = new PessoaFisica("Elisangela", "Ferreira",35);
		Elisangela.setCpf("100.222.789-32");
		Elisangela.setSobrenome("Ferreira");
		Conta c4 = new Conta(Elisangela, 100);
		c4.creditar(3000.0);
		c4.debitar(100);

		PessoaJuridica Kymbilym = new PessoaJuridica("Kymbilym", "Santos",20);
		Kymbilym.setCnpj("123.387.333.012-23");
		Kymbilym.setRazaoSocial("Alguma RazãoSocial ai");
		Conta c5 = new Conta(Kymbilym, 300);
		c5.creditar(5000.0);
		
				
		System.out.println(c);

		System.out.println(c2);
		
		System.out.println(c3);
		
		System.out.println(Elisangela + c4.toString());

		System.out.println(Kymbilym + c5.toString());
	}

}
