

package up.Cenario9.src.controls;

import java.util.HashMap;
import java.util.Map;

import up.Cenario9.src.Models.ClienteEmpresa;
import up.Cenario9.src.Models.ClientePessoa;

public class ClienteController {
    private Map<String, ClientePessoa> clientesPessoa;
    private Map<String, ClienteEmpresa> clientesEmpresa;

    public ClienteController() {
        clientesPessoa = new HashMap<>();
        clientesEmpresa = new HashMap<>();
    }

    public void cadastrarClientePessoa(String nome, String cpf) {
        clientesPessoa.put(cpf, new ClientePessoa(nome, cpf));
    }

    public void cadastrarClienteEmpresa(String nome, String cnpj) {
        clientesEmpresa.put(cnpj, new ClienteEmpresa(nome, cnpj));
    }

    public ClientePessoa buscarClientePessoa(String cpf) {
        return clientesPessoa.getOrDefault(cpf, null);
    }

    public ClienteEmpresa buscarClienteEmpresa(String cnpj) {
        return clientesEmpresa.getOrDefault(cnpj, null);
    }

    public void emprestarClientePessoa(String cpf, double valor) {
        ClientePessoa cliente = clientesPessoa.get(cpf);
        if (cliente != null) {
            cliente.emprestar(valor);
        }
    }

    public void emprestarClienteEmpresa(String cnpj, double valor) {
        ClienteEmpresa cliente = clientesEmpresa.get(cnpj);
        if (cliente != null) {
            cliente.emprestar(valor);
        }
    }

    public void devolverClientePessoa(String cpf, double valor) {
        ClientePessoa cliente = clientesPessoa.get(cpf);
        if (cliente != null) {
            cliente.devolver(valor);
        }
    }

    public void devolverClienteEmpresa(String cnpj, double valor) {
        ClienteEmpresa cliente = clientesEmpresa.get(cnpj);
        if (cliente != null) {
            cliente.devolver(valor);
        }
    }
}
