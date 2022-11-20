import java.util.Scanner;
public class Invertidos {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	 int i = 0, a[], b[];
     final int TAM = 10;
     a = new int[TAM];
     b = new int[10];
     for (i = 0; i<TAM ; i++) {
			System.out.println("Digite o número "+(i+1)+ ":");
         a[i] = in.nextInt();
       }
     for (i = 0; i < TAM; i++) {
    	 b[i] = a[TAM - i - 1];
     	}
     for(i=0; i<TAM; i++) {
         if(i==0) {
             System.out.print("A = ["+a[i]+",");
         }else if (i==(TAM-1)) {
             System.out.println(a[i]+"]");
         }else {
             System.out.print(a[i]+",");
     }
 }
     for(i=0; i<TAM; i++) {
         if(i==0) {
             System.out.print("B = ["+b[i]+",");
         }else if (i==(TAM-1)) {
             System.out.println(b[i]+"]");
         }else {
             System.out.print(b[i]+",");
     }
 }
	}
	
}
