import java.util.Scanner;

public class sge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("====== Cadastro de Usuário ======");

        System.out.println("");

        System.out.println("Digite o seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        nomeCompleto = nomeCompleto.toLowerCase();

        String[] nomeArray = nomeCompleto.split(" ");
        String ultimoNome = nomeArray[nomeArray.length - 1];
        char primeiraLetraDoNome = nomeCompleto.charAt(0);

        String usuario = "Usuário: " + primeiraLetraDoNome + "_" + ultimoNome;
        System.out.println(usuario);

        System.out.println();

        String username = (primeiraLetraDoNome + "_" + ultimoNome);

        Scanner in = new Scanner(System.in);

        System.out.println("Digite enter para continuar");
        in.nextLine();


        boolean senhaErrada = true;

        String senha = null;

        while (senhaErrada) {
            System.out.println("Digite sua senha, é necessário no minimo: \n* 8 caracteres \n* 1 letra maiúscula \n* 1 letra minúscula \n* Números \n* 1 destes caracteres especiais: - ! @ ");
            senha = scanner.nextLine();
            String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@!-])(?=\\S+$).{8,}";
            boolean padraoSenha = senha.matches(pattern);

            if (padraoSenha) {
                senhaErrada = false;
            } else {
                System.out.println("Senha não segue o padrão");
            }

        }

        System.out.println("Login");

        System.out.println("");


        boolean wrongLogin = true;

        while (wrongLogin) {
            System.out.println("Digite seu úsuario");
            String login = scanner.nextLine();

            System.out.println("Digite sua senha");
            String password = scanner.nextLine();

            if (login.equals(username) && senha.equals(password)) {
                System.out.println("Acesso permitido");
                wrongLogin = false;
            }else {
                System.out.println("Login ou senha diferente da informada no cadastro");
            }
        }
    }
}