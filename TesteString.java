public class TesteString {
    public static void main(String[] args) {
        String nome = "Samuel";
        String sobrenome = "Marcos";

        System.out.println("Concatenando: " + nome + sobrenome);
        System.out.println("Tudo maiuscula "+ nome.toUpperCase());
        System.out.println("Tudo minuscula "+ nome.toLowerCase());
        System.out.println("Retorna o caractere da posiçao: "+ nome.charAt(4));
        System.out.println("Retorna a quantidade de caracteres: "+ nome.length());
        System.out.println("Recebe um int e retorna de acordo com a posiçao "+ nome.substring(3));
        System.out.println("Recebe um char e retorna a posiçao da primeira letra "+ nome.indexOf("m"));
        System.out.println("Verifica se termina com o valor especificado "+ nome.endsWith("uel"));
        System.out.println("Verifica se começa com o valor especificado "+ nome.toLowerCase().startsWith("sam"));
    }
}
