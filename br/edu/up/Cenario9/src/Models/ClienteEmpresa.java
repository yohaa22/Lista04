package up.Cenario9.src.Models;




public class ClienteEmpresa {
    private String nome;
    private String cnpj;
    private double vlrEmprestado;
    private static final double MAX_CREDITO = 25000.00;

    public ClienteEmpresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.vlrEmprestado = 0.0;
    }

    public void emprestar(double valor) {
        if (vlrEmprestado + valor <= MAX_CREDITO) {
            vlrEmprestado += valor;
            System.out.println("Empréstimo de R$" + valor + " realizado para " + nome + " (CNPJ: " + cnpj + ")");
        } else {
            System.out.println("Empréstimo não autorizado. Limite de crédito excedido.");
        }
    }

    public void devolver(double valor) {
        if (vlrEmprestado >= valor) {
            vlrEmprestado -= valor;
            System.out.println("Devolução de R$" + valor + " realizado para " + nome + " (CNPJ: " + cnpj + ")");
        } else {
            System.out.println("Devolução não autorizada. Valor excede o montante emprestado.");
        }
    }

    @Override
    public String toString() {
        return "Cliente Empresa: Nome = " + nome + ", CNPJ = " + cnpj + ", Valor emprestado = R$" + vlrEmprestado;
    }
}
