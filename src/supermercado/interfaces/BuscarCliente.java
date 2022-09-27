package supermercado.interfaces;

import supermercado.Cliente;

import java.util.ArrayList;

public interface BuscarCliente {
   Cliente buscar(int id, ArrayList<Cliente> clientes);
}
