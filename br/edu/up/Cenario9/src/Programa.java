package up.Cenario9.src;

import up.Cenario9.src.controls.ClienteController;
import up.Cenario9.src.view.ClienteView;

public class Programa {
    public static void main(String[] args) {
        ClienteController clienteController = new ClienteController();
        ClienteView clienteView = new ClienteView(clienteController);

        clienteView.menu();
    }
}
