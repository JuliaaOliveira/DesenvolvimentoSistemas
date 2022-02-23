import java.util.Scanner;
public class SalarioLiqNoIfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aulas;
		float hora, descri, salario;
		
		System.out.println("Insira o valor da hora aula:");
		hora = input.nextFloat();
		
		System.out.println("Insira o número de aulas ministradas: ");
		aulas = input.nextInt();
		
		System.out.println("Insira desconto:");
		descri = input.nextFloat();
		
		salario = hora*aulas;
		salario = salario-(salario/100*descri);
		
		System.out.println(salario);
		
	}
}
