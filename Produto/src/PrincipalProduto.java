
import java.util.Scanner;
public class PrincipalProduto {
	public static void main (String []args) {
		Scanner in = new Scanner(System.in);
		Produto p1 = new Produto();
		
		String nome;
		int codigo;
		double precoCusto;
	    double precoVenda;
		int quantidade;
		double margemLucro;
		int entrada, saida;
		 
		System.out.println("Digite o nome do Produto:");
		//nome = in.next();
		p1.setNome(in.next());
		
		System.out.println("Digite o codigo do Produto:");
		codigo = in.nextInt();
		p1.setCodigo(codigo);
		
		System.out.println("Digite o Pre�o do Custo:");
		precoCusto = in.nextDouble();
		p1.setPrecoCusto(precoCusto);
		
		System.out.println("Digite a quantidade do produto:");
	    quantidade = in.nextInt();
		p1.setQuantidade(quantidade);
		
		System.out.println("Digite a margem do lucro:");
		margemLucro = in.nextDouble();
		p1.setMargemLucro(margemLucro);
		
		p1.calcularPrecoVenda();
		
		System.out.println("Registre a Entrada de Unidades:");
		entrada = in.nextInt();
		
		System.out.println("QUANTIDADES ENTRADA PRODUTOS: " +p1.registrarEntrada(entrada));
		
		System.out.println("Registre a Sa�da de Unidades:");
		saida = in.nextInt();
		
		System.out.println("QUANTIDADE SA�DA PRODUTOS: " +p1.registrarSaida(saida) );
		
		System.out.println();
		p1.exibirDados();
		
		
		System.out.println("Definir um novo valor de venda:");
		precoVenda=in.nextDouble();
	    p1.definirPrecoVenda(precoVenda);
		
	    System.out.println();
		p1.exibirDados();
		
		
		
		
		
		
		
		
		
	}
}
