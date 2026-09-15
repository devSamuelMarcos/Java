import java.util.*;

public class ImparOuPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        while (true) {
            System.out.println("Digite um numero: ");
            int number = scanner.nextInt();
            if (number % 2 != 0){
                System.out.println(number +" é impar");
            } else {
                System.out.println(number +" é par");
            }
        }
    }
}
