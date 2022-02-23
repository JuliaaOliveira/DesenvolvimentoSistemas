import java.util.Scanner;
public class Triangulo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int base, altura, perimetro, area, lados;
		
		System.out.println("Insira o valor da base: ");
		base =  in.nextInt();
		
		System.out.println("Insira o valor da altura: ");
		altura =  in.nextInt();
		
		area = (base*altura)/2;
		
		System.out.println("Insira o valor dos lados: ");
		lados =  in.nextInt();
		
		perimetro = lados+lados+lados;
		
		System.out.println("O valor da area é: "+area);
		
		System.out.println("O valor da perimetro é: "+perimetro);
		
		
	}

}
