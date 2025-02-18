package estoque;

import java.io.IOException;
import java.util.List;

public class EstoqueAdmin extends Estoque {

    public EstoqueAdmin(String filePath) throws IOException {
        super(filePath);
    }
    
    public boolean addProdutoAdmin(String secao, Produto produto) {
        return super.addProduto(secao, produto);
    }
    
    public boolean updatePrecoProdutoAdmin(String secao, String codigo, double novoPreco) {
        return super.updatePrecoProduto(secao, codigo, novoPreco);
    }

    public String getLastProductCode(String secao) {
        List<Produto> lista = super.getProdutos(secao);
        return lista.get(lista.size() - 1).getCodigo();
    }
}