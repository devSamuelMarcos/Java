import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new 
        Scanner(System.in);
 //
  //          System.out.println("Soma dos numeros:\n");
 //           int soma = 0;
  //          for (int variavel = 0; variavel <= 20; variavel++) {
  //              soma = soma + variavel;
  //              System.out.println(soma);
  //          }

//------------------------------------------------------------

     System.out.println("Tabuada de um numero");
     System.out.println("Digite um numero:");
     int numero = scanner.nextInt();
     for (int y = 0; y <= 10; y++) {
        System.out.println(y + " x " + numero + " = " + y * numero);
     }
     scanner.close();
    }
}
