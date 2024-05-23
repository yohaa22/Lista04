

package up.Cenario5.src;

import up.Cenario5.src.controls.ControladorEvento;
import up.Cenario5.src.controls.ControladorReserva;
import up.Cenario5.src.view.View;

public class Programa {
    public static void main(String[] args) {
        ControladorEvento controladorEvento = new ControladorEvento();
        ControladorReserva controladorReserva = new ControladorReserva();
        
        View view = new View(controladorEvento, controladorReserva);
        view.exibirMenu();
    }
}
