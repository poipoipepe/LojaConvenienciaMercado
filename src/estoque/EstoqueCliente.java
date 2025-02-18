package estoque;

import java.io.IOException;
import java.util.List;

public class EstoqueCliente extends Estoque {

    public EstoqueCliente(String filePath) throws IOException {
        super(filePath);
    }
    
    public boolean comprarProduto(String secao, String codigo, int qtdComprada) {
        List<Produto> lista = super.getProdutos(secao);
        for (Produto p : lista) {
            if (p.getCodigo().equals(codigo)) {
                if (p.getQuantidade() >= qtdComprada) {
                    p.setQuantidade(p.getQuantidade() - qtdComprada);
                    return true;
                }
            }
        }
        return false;
    }
}