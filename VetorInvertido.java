import java.util.Scanner;
public class VetorInvertido{
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        final int TAM = 3;
        int j=TAM-1, i, a[], b[];
        a = new int [TAM];
        b = new int [TAM];
        
        for (i=0; i<TAM; i++){
            System.out.println("Digite o"+(i+1)+"numero");
            a[i] = in.nextInt();
        }
        
        for(i=0; i<TAM; i++){
            b[i] = a[j];
            j--;
        }
        for (i=0; i<TAM; i++){
            System.out.println(b[i]);
        }
    }
}