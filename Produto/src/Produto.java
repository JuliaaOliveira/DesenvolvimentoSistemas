
public class Produto {
	
	// ATRIBUTOS
	
	private String nome;
	private int codigo;
	private double precoCusto;
	private double precoVenda;
	private int quantidade;
	private double margemLucro;
	
	// METODOS ACESSORES
	
	// NOME
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// CODIGO
	
	public int getCodigo() {
		return this.codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	// PRECO CUSTO
	
	public double getPrecoCusto() {
		return this.precoCusto;
	}
	
	public void setPrecoCusto(double PrecoCusto) {
		this.precoCusto = precoCusto;
	}
	
	// precoVenda
	
	public double getPrecoVenda() {
		return this.precoVenda;
	}
	
	public void setPrecoVenda(double PrecoVenda) {
		this.precoVenda = precoVenda;
	}
	
	// precoVenda
	
		public int getQuantidade() {
			return this.quantidade;
		}
		
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		
		// precoVenda
		
			public double getmargemLucro() {
				return this.margemLucro;
			}
			
			public void setMargemLucro (double margemLucro) {
				this.margemLucro = margemLucro;
			}
		
	
	
	
	
	//METODOS 
	
	public int registrarSaida(int quantidade) {
			
			if (this.quantidade <= quantidade){
				System.out.println("Quantidade Indisponivel: " +this.quantidade);
				
			}else {
				
				this.quantidade =  this.quantidade - quantidade;
				
			}

			return this.quantidade ;
		
	}
	
	public int registrarEntrada (int quantidade) {
		
		this.quantidade = this.quantidade+quantidade  ;
		
		return this.quantidade ;
	
	}
	 
	public void calcularPrecoVenda() {
		
		this.precoVenda = precoCusto+(precoCusto/100*margemLucro);
		 
		}
	
	public double definirPrecoVenda (double precoVenda) {
		
	 this.precoVenda = precoVenda;
	 
	 if(precoVenda<precoCusto) {
		 System.out.println("Preço de venda esta a baixo do preço do custo");
	 }
	 
	 return this.precoVenda;
	 
	}
	
	public void exibirDados() {
			
		System.out.println("Dados do produto:");
		System.out.println("Nome: "+this.nome);
		System.out.println("Codigo: "+this.codigo);
		System.out.println("Preço de Custo: "+this.precoCusto);
		System.out.println("Margem de Lucro: "+this.margemLucro);
		System.out.println("Quantidade: "+this.quantidade);
		System.out.println("Preço de venda: "+this.precoVenda);
	}

}

