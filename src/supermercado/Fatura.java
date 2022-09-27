package supermercado;

public class Fatura {
    private Cliente cliente;
    private Item itens;
    private double total;

    public Fatura(Cliente cliente, Item itens, double total) {
        this.cliente = cliente;
        this.itens = itens;
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item getItens() {
        return itens;
    }

    public void setItens(Item itens) {
        this.itens = itens;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
