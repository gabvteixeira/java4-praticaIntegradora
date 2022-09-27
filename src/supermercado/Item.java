package supermercado;

public class Item {

    private int codigo, quantidade;
    private double custoUnitario;
    private String nome;

    public Item(int codigo, int quantidade, double custoUnitario, String nome) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.custoUnitario = custoUnitario;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getCustoUnitario() {
        return custoUnitario;
    }

    public void setCustoUnitario(double custoUnitario) {
        this.custoUnitario = custoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
