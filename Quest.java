import java.util.*;

public class Quest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] perguntas = {
            {"Qual é a capital do Brasil?", "Brasília", "São Paulo", "Rio de Janeiro", "Salvador"},
            {"Quanto é 150 divido por 2?", "75", "80", "70", "Nao e possivel dividir 150 por 2"},
            {"Qual planeta é conhecido como planeta vermelho?", "Marte", "Júpiter", "Vênus", "Saturno"}
        };

        System.out.println("Olá, seja bem-vindo ao meu primeiro quiz!\n");

        int pontuacao = 0;

        for (int number = 0; number < perguntas.length; number++) {
            System.out.println("----------------------------------------");
            System.out.println("Pergunta " + (number + 1) + ": " + perguntas[number][0]);
            
            String respostaCorreta = perguntas[number][1]; 

            String[] respostas = {
                perguntas[number][1],
                perguntas[number][2],
                perguntas[number][3],
                perguntas[number][4]
            };

            List<String> lista = Arrays.asList(respostas);
            Collections.shuffle(lista);   

            for (int i = 0; i < lista.size(); i++) {
                char letra = (char) ('a' + i);
                System.out.println(letra + ") " + lista.get(i));
            }

            System.out.print("\nDigite sua resposta (a, b, c, d): ");
            char resposta = scanner.next().toLowerCase().charAt(0);

            int indiceEscolhido = resposta - 'a';

            if (indiceEscolhido >= 0 && indiceEscolhido < lista.size()) {
                String respostaDoUsuario = lista.get(indiceEscolhido);
                
                if (respostaDoUsuario.equals(respostaCorreta)) {
                    System.out.println("Parabéns! Você acertou! 🎉\n");
                    pontuacao++;
                } else {
                    System.out.println("Que pena, você errou. 😢 A resposta correta era: " + respostaCorreta + "\n");
                }
            } else {
                System.out.println("Opção inválida! Pergunta considerada incorreta.\n");
            }
        }

        System.out.println("========================================");
        System.out.println("Fim do Quiz! Você acertou " + pontuacao + " de " + perguntas.length + " perguntas.");
        System.out.println("========================================");

        scanner.close();
    }
}