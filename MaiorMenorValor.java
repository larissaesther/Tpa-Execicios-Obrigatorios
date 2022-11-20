import java.util.Scanner;
public class MaiorMenorValor {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[], i, maior = 0, menor = 0;
        final int TAM = 10; 
        a = new int[TAM]; 
        for (i = 0; i < TAM; i++) {
        	System.out.println("Digite o valor "+(i+1)+":");
        	a[i] = in.nextInt();
        }
        menor = a[0];
        for (i = 0; i < TAM; i++) {
        	if (a[i] > maior) {
        		maior = a[i];
        	}else if (a[i] < menor) {
        		menor = a[i];
        	}
        }
        for (i = 0; i < TAM; i++) {
			if (i == 0 ) {
				System.out.print("Vetor A = ["+a[i]+ ",");
			}else if (i == (TAM-1)) {
				System.out.println(a[i]+"]");
			}else {
				System.out.print(a[i]+",");
			}
	}
        System.out.println("O menor valor é " + menor);
        System.out.println("O maior valor é " + maior);

	}
}
