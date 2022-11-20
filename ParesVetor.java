import java.util.Scanner;
public class ParesVetor {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[], i;
		final int TAM = 10;
		a = new int[TAM];
		for (i = 0; i<TAM ; i++) {
			System.out.println("Digite o número "+(i+1)+ ":");
            a[i] = in.nextInt();
          }
		for (i = 0; i < TAM; i++) {
			if (i == 0 ) {
				System.out.print("Vetor A = ["+a[i]+ ",");
			}else if (i == (TAM-1)) {
				System.out.println(a[i]+"]");
			}else {
				System.out.print(a[i]+",");
			}
			
		} //o junin ensinou simm, entendi, blz, tá bom, pode ser 
		System.out.print("O vetores pares de A são: ");
		for (i = 0; i<TAM ; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + "|");
			}
          }
	}

}
//