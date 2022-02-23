import java.util.Scanner;
public class SalLiquIfElse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aula;
		float hora;
		double descont, salario;
		
		System.out.println("Insira o valor da hora aula:");
		hora = input.nextFloat();
		System.out.println("Insira o número de aulas ministradas: ");
		
		aula = input.nextInt();
		salario = hora*aula;
		if(salario<=1212) {
			descont = 7.5;
		}else if(salario >=1212.01 && salario <=2427.35) {
			descont = 9;
		}else if(salario >=2427.36 && salario <=3641.03) {
			descont = 12;
		}else if(salario >=3641.04 && salario <=7087.22) {
			descont = 14;
		}else if(salario >=7087.23 && salario <=12136.79) {
			descont = 14.5;
		}else if(salario >=12136.80 && salario <=24273.57) {
			descont = 16.5;
		}else if(salario >=24273.58 && salario <=47333.46) {
			descont = 19;
		}else {
			descont= 22;
		}
		salario = salario-(salario/100*descont);
		System.out.println("Valor do Slario liquido é : "+salario);
	
	}
}
