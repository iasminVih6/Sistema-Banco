public class Banco {
    private Conta contaCadastrada = null;

    public void cadastrarConta(String nome, String login, String senha) {
        contaCadastrada = new Conta(nome, login, senha);
        System.out.println("Conta criada com sucesso!");
    }

    public Conta fazerLogin(String login, String senha) {
        if (contaCadastrada != null && contaCadastrada.validarLogin(login, senha)) {
            System.out.println("Login realizado com sucesso!");
            return contaCadastrada;
        } else {
            System.out.println("Login ou senha incorretos!");
            return null;
        }
    }
}


