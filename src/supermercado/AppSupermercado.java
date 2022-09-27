package supermercado;

import supermercado.interfaces.BuscarCliente;
import supermercado.interfaces.RemoverCliente;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppSupermercado {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>() {{
            add(new Cliente(1, "Gabriel", "Teixeira"));
            add(new Cliente(2, "Felipe", "Shinkae"));
            add(new Cliente(3, "Matheus", "Araujo"));
        }};

        int option, id;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("======== MENU DE CLIENTES ========");
            System.out.println("Selecione uma opção: ");
            System.out.print("1 - Exibir todos os clientes\n" + "2 - Remover cliente pelo id\n" + "3 - Buscar cliente pelo id\n" + "4 - Finalizar execução\n");
            option = getOptionFromKeyboard();
            switch (option) {
                case 1:
                    System.out.println("======== Listando todos os clientes ========");
                    clientes.stream().forEach(System.out::println);
                    break;
                case 2:
                    System.out.println("Digite o id desejado para realizar a remoção:");
                    id = getOptionFromKeyboard();
                    if (removerCliente(id, clientes)) {
                        System.out.println("Cliente com id " + id + " removido com sucesso!");
                    } else {
                        System.out.println("Cliente com id " + id + " não encontrado");
                    }
                    break;
                case 3:
                    System.out.println("Digite o id desejado para realizar a busca:");
                    id = getOptionFromKeyboard();
                    Cliente cliente = buscarCliente(id, clientes);
                    if(cliente != null) {
                        System.out.println(cliente);
                    } else {
                        System.out.println("Cliente não encontrado!");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida! Tente novamente");
            }
        }
    }

    public static boolean removerCliente(int id, ArrayList<Cliente> clientes) {
        RemoverCliente removerCliente = (idRemovido, clientesList) -> clientesList.removeIf(c -> c.getId() == idRemovido);
        return removerCliente.remover(id, clientes);
    }

    public static Cliente buscarCliente(int id, ArrayList<Cliente> clientes) {
        BuscarCliente buscarCliente = (idBuscado, clientesList) -> {
            Cliente encontrado = clientesList.stream().filter(c -> c.getId() == idBuscado).findFirst().orElse(null);

            if (encontrado != null) {
                return encontrado;
            }

            return null;
        };
        return buscarCliente.buscar(id, clientes);
    }

    public static int getOptionFromKeyboard() {
        int option;
        while(true) {
            Scanner scanner = new Scanner(System.in);
            try {
                option = scanner.nextInt();
                return option;
            } catch (InputMismatchException ex) {
                System.out.println("Digite um valor válido");
            }
        }
    }

}
