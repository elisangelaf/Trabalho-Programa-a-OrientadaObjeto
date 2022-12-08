
 public class ContaEspecial extends Conta {
         
	 private double limite;
	 
	 public ContaEspecial( Pessoa cliente) {
		 super (cliente);
		 this.limite = 500;
		 this.numero += "S";
	 }
	 
	 public ContaEspecial(Pessoa cliente, double saldo) {
		 this (cliente);
		 this.saldo = saldo;
	 }
	 
	 public void setlimite(double valor) {
		 this.limite = valor;
	 }
	 
	 public void setlimite(String valor) {
		 double num =
			Double.parseDouble(valor);
		 this.limite = num;
				 
	 }
	 
	 public double getLimite() {
		 return this.limite;
	 }
	 
	 public void debitar(double valor) {
		 double saldoTotal = saldo +limite;
		 
		 if(valor<= saldoTotal) {
			 this.saldo = this.saldo - valor;
		 }
		 
	 }
	 
	 public String toString() {
		 return super.toString()+ 
				 "\nlimite: "+this.limite+ 
				 "\nSaldo Total:" +(this.limite + this.saldo)+
				"\n--------------\n" ;
	 }
}
