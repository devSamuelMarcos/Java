import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Olá! Seja bem-vindo a minha calculadora teste! \nVamos testar? \nDigite o primeiro número:");
            int num1 = scanner.nextInt();
            
            System.out.println("Digite o segundo número:");
            int num2 = scanner.nextInt();
            
            System.out.println("Agora digite a operação:\n+ (soma) \n- (subtração) \n* (vezes) \n/ (dividir) \n% (resto da divisão)");
            String operacao = scanner.next();

            if (operacao.equals("+")) {
                System.out.println("Resultado: " + (num1 + num2));
                break;

            } else if (operacao.equals("-")) {
                System.out.println("Resultado: " + (num1 - num2));
                break;

            } else if (operacao.equals("*")) {
                System.out.println("Resultado: " + (num1 * num2));
                break;

            } else if (operacao.equals("/")) {
                // Prevenindo erro de divisão por zero
                if (num2 == 0) {
                    System.out.println("Erro: Não é possível dividir por zero.");
                } else {
                    System.out.println("Resultado: " + (num1 / num2));
                }
                break;

            } else if (operacao.equals("%")) {
                System.out.println("Resultado: " + (num1 % num2));
                break;

            } else {
                System.out.println("Operação inválida. Tente novamente.\n");
            }
        }
        
        scanner.close(); // É uma boa prática fechar o scanner no final
    }
}