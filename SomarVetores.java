import java.util.Scanner;
public class SomarVetores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a[], b[], c[], i;
		final int TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		for (i=0;i<TAM;i++) {
			System.out.println("Insira o" +(i+1)+"numero do vetor A");
			a[i] = input.nextInt();
		}
		for (i=0;i<TAM;i++) {
			System.out.println("Insira o "+(i+1)+"número do vetor B ");
			b[i] = input.nextInt();
		}
		for (i=0;i<TAM;i++) {
			c[i] = a[i]+b[i];
			System.out.println("A soma do vetor C é: "+(i+1)+" = "+c[i]);
		}
	}
}