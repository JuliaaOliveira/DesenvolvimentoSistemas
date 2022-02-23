import java.util.Scanner;
public class Preco {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float val, por, venda;
		String cont="S";
		while (! cont.equals("N")) {
			System.out.println("Insira o valor do produto:");
			val = input.nextFloat();
			
			System.out.println("Insira o valor da margem de lucro do produto :");
			por = input.nextFloat();
			por = por/100*val;
			venda = val+por;
			
			System.out.println("Valor da venda deste produto é : "+venda);
			System.out.println("Você deseja continuar? (S/N)?");
			cont = input.next();
		}
	
	}
}