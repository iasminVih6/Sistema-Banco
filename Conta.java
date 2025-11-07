public class Conta {
    private String nome;
    private String login;
    private String senha;
    private double saldo;

    public Conta(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.saldo = 0.0;
    }

    public boolean validarLogin(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }
}


