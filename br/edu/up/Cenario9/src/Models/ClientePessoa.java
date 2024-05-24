package up.Cenario9.src.Models;

// ClientePessoa.java


public class ClientePessoa {
    private String nome;
    private String cpf;
    private double vlrEmprestado;
    private static final double MAX_CREDITO = 10000.00;

    public ClientePessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.vlrEmprestado = 0.0;
    }

    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= MAX_CREDITO) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo de R$" + valor + " realizado para " + nome + " (CPF: " + cpf + ")");
        } else {
            System.out.println("Empréstimo não autorizado. Limite de crédito excedido.");
        }
    }

    public void devolver(double valor) {
        if (vlrEmprestado >= valor) {
            vlrEmprestado -= valor;
            System.out.println("Devolução de R$" + valor + " realizado para " + nome + " (CPF: " + cpf + ")");
        } else {
            System.out.println("Devolução não autorizada. Valor excede o montante emprestado.");
        }
    }

    @Override
    public String toString() {
        return "Cliente Pessoa: Nome = " + nome + ", CPF = " + cpf + ", Valor emprestado = R$" + vlrEmprestado;
    }
}
