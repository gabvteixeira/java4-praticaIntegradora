package supermercado.interfaces;

import supermercado.Cliente;

import java.util.ArrayList;

public interface RemoverCliente {
    boolean remover(int id, ArrayList<Cliente> clientes);
}
