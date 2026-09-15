
import java.util.Scanner;

public class Desafio01ChatGpt {
    public static void main(String[] args) {
        Scanner scanner = new
        Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scanner.next();

        System.out.println("Qual sua idade?");
        int number = scanner.nextInt();

        System.out.println("Ola " + nome + "\nVoce tem " + number + " anos");
    }
}
