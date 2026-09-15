import java.util.*;
import java.util.regex.Pattern;

public class Cadastro {
    static String emailSalvo;
    static String usuarioSalvo;
    static String senhaSalva;

    public static boolean emailValido(String email) {
        String regex = "^[\\w.+-]+@[\\w-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex, email);
    }

    public static void email(String email) {
        emailSalvo = email;
    }

    public static void usuario(String usuario) {
        usuarioSalvo = usuario;
    }

    public static void senha(String senha) {
        senhaSalva = senha;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        menuPrincipal: // <- label do loop externo
        while (true) {

            System.out.println("Ola seja bem vindo ao meu primeiro sistema de cadastro!");
            System.out.println("Voce deseja criar ou logar em uma conta?");
            String opcao = scanner.next().toLowerCase();

            if ("criar".equals(opcao)) {
                usuario:
                while (true) {
                    System.out.println("Digite o usuario: ");
                        String usuario = scanner.next();
                        if (usuario.length() < 5) {
                            System.out.println("Minimo de caracteres: 5");
                            continue usuario; // agora funciona: volta pro topo desse while
                        }
                    usuario(usuario);
                    break; // usuario válido, sai do loop
                }
                senha:
                while (true) {
                    System.out.println("Digite a senha:\n(digite C para cancelar)");
                    String senha = scanner.next().toLowerCase();
                    if ("c".equals(senha)) {
                        System.out.println("Cancelando..");
                        continue menuPrincipal; // <- volta pro loop externo, ignora o resto
                    } else if (senha.length()<5) {
                        System.out.println("Minimo de caracteres: 5");
                        continue senha;
                    }
                    System.out.println("Repita a senha:\n(digite C para cancelar)");
                    String senha2 = scanner.next().toLowerCase();
                    if ("c".equals(senha2)) {
                        System.out.println("Cancelando..");
                        continue menuPrincipal;
                    } else if (senha.length()<5) {
                        System.out.println("Minimo de caracteres: 5");
                        continue senha;
                    } else if(senha.equals(senha2)) {
                        senha(senha);
                        break;
                    } else {
                        System.out.println("Senha incorreta!");
                    }
                }

                String email;
                while (true) {
                    System.out.println("Digite o email:\n(digite C para cancelar)");
                    email = scanner.next().toLowerCase();
                    if (emailValido(email)) {
                        System.out.println("Cadastro concluido agora so logar!");
                        email(email);
                        break;
                    } else if ("c".equals(email)) {
                        System.out.println("Cancelando..");
                        continue menuPrincipal;
                    }
                    System.out.println("Email invalido! Tente novamente.");
                }
            } else if ("logar".equals(opcao)) {
                System.out.println("Digite o usuario ou o email:\nDigite C para cancelar");
                String login = scanner.next();
                if ("c".equals(login)) {
                        System.out.println("Cancelando..");
                        continue menuPrincipal; // <- volta pro loop externo, ignora o resto
                } else if (login.equals(usuarioSalvo) || login.equals(emailSalvo)) {
                    System.out.println("Digite a senha: ");
                    String tentativaSenha = scanner.next();
                    if (tentativaSenha.equals(senhaSalva)) {
                        System.out.println("Logado com sucesso!");
                        return;
                    }
                }
            }
        }
    }
}