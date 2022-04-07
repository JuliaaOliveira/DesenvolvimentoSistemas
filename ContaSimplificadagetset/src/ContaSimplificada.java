public class ContaSimplificada {
	
	 private int numeroConta;
	 private String nomeCorrentista;
	 private double saldo;
	 
	 
	
	//METODOS ACESSORES
	 
	 // NUMERO CONTA
	
	public int getnumeroConta () {
		return this.numeroConta;
	}
	
	public void setnumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	// NOME CORRENTISTA
	
	public String getnomeCorrentista () {
		return this.nomeCorrentista;
	}
	
	public void setnomeCorrentista(String nomeCorrentista) {
		this.nomeCorrentista = nomeCorrentista;
	}
	
	// SALDO
	
	public double getsaldo () {
		return this.saldo;
	}
	
	public void setsaldo (double saldo) {
		this.saldo = saldo;
	}
	
	
	
	//METODOS
	
	//01
	public void abreConta ( int numeroConta,String nomeCorrentista, double saldo) {
	
		setnumeroConta(numeroConta);
		setnomeCorrentista(nomeCorrentista);
		setsaldo(saldo);
	}
	
	//02
	public void depositaValor (double valor ) {
		
		this.saldo = this.saldo + valor;
		
		
	}
	
	//03
	public void  retiraValor(double valor) {
		
		if(valor > this.saldo) {
			 System.out.println("O seu valor não pode ser retirado");
			 
		 }else {
				
				this.saldo =  this.saldo - valor;
				
			}
	
	}
	
	//04
	public double retiraValorRetornaSaldo (double valor ) {
		
		if(valor > this.saldo) {
			 System.out.println("O seu valor não pode ser retirado");
			 
		 }else {
				
				this.saldo =  this.saldo - valor;
				
			}
	
		return this.saldo;
	}
	
	//05 
	public void exibirSaldo () {
		System.out.println("Saldo Atual da Conta: "+this.saldo);
		}
	
	
	
}
