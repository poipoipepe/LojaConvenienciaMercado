package estoque;

public class Produto {
    private String codigo;
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String code, String name, int quantity, double price) {
        this.codigo = code;
        this.nome = name;
        this.quantidade = quantity;
        this.preco = price;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String code) {
        this.codigo = code;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = name;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantity) {
        this.quantidade = quantity;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double price) {
        this.preco = price;
    }
}
