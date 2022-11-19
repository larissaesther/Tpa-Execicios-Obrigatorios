import java.util.Scanner;
public class RaizQuadrada {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i, a[], b[];
        final int TAM = 5;
        //alocar o tamanho dos vetores
        a = new int[TAM];
        b = new int[5];
        //ler o vetor A e calcular o vetor B
        for(i=0; i<TAM; i++) {
            System.out.println("entre com o "+(i+1)+ "o. valor");
            a[i] = in.nextInt();
            b[i] = a[i]*a[i];
        }
        //Apresentar o vetor A
                for(i=0; i<TAM; i++) {
                    if(i==0) {
                        System.out.print("A = ["+a[i]+" ");
                    }else if (i==(TAM-1)) {
                        System.out.println(a[i]+"]");
                    }else {
                        System.out.print(a[i]+" ");
                }
            }
        System.out.println(); // para pular uma linha <br>
        //Apresentar o vetor B
        for(i=0; i<TAM; i++) {
            if(i==0) {
                System.out.print("B = ["+b[i]+" ");
            }else if (i==(TAM-1)) {
                System.out.println(b[i]+"]");
            }else {
                System.out.print(b[i]+" ");
        }
    }
    }
}
