package estoque;

import java.io.*;
import java.util.*;

public class Estoque {

    private String codAdm;
    private Map<String, List<Produto>> secoes = new LinkedHashMap<>();
    protected File file;

    public Estoque(String filePath) throws IOException {
        file = new File(filePath);
        lerEstoque();
    }

    private void lerEstoque() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String linha;
        // Lê o código admin
        if ((linha = br.readLine()) != null) {
            if (linha.startsWith("cod_adm")) {
                String[] parts = linha.split("\\s+");
                codAdm = parts[1];
            }
        }

        // Pula linhas em branco
        while ((linha = br.readLine()) != null && linha.trim().isEmpty()) {}

        String secaoAtual = null;
        while (linha != null) {
            if (linha.trim().isEmpty()) {
                linha = br.readLine();
                continue;
            }
            // Se a linha não inicia com um dígito, é o nome da seção
            if (!linha.matches("^\\d.*")) {
                secaoAtual = linha.trim();
                secoes.put(secaoAtual, new ArrayList<>());
            } else {
                // Linha com dados do produto: código, nome, quantidade e preço
                String[] parts = linha.split("\\s+");
                if (parts.length >= 4) {
                    String codigo = parts[0];
                    String nome = parts[1];
                    for (int i = 2; i < parts.length - 2; i++) {
                        nome += " " + parts[i];
                    }
                    int quantidade = Integer.parseInt(parts[parts.length - 2]);
                    String precoAux = parts[parts.length - 1].replace(",", ".");
                    double preco = Double.parseDouble(precoAux);
                    Produto p = new Produto(codigo, nome, quantidade, preco);
                    if (secaoAtual != null) {
                        secoes.get(secaoAtual).add(p);
                    }
                }
            }
            linha = br.readLine();
        }
        br.close();
    }

    public String getCodAdm() {
        return codAdm;
    }

    public List<Produto> getProdutos(String secao) {
        return secoes.getOrDefault(secao, new ArrayList<>());
    }

    // Métodos de alteração que só o admin deve usar - protected
    protected boolean addProduto(String secao, Produto produto) {
        List<Produto> lista = secoes.get(secao);
        if (lista == null) {
            lista = new ArrayList<>();
            secoes.put(secao, lista);
        }
        lista.add(produto);
        return true;
    }

    protected boolean updatePrecoProduto(String secao, String codigo, double novoPreco) {
        List<Produto> lista = secoes.get(secao);
        if (lista != null) {
            for (Produto p : lista) {
                if (p.getCodigo().equals(codigo)) {
                    p.setPreco(novoPreco);
                    return true;
                }
            }
        }
        return false;
    }

    public void save() throws IOException {
        List<String> lines = new ArrayList<>();
        lines.add("cod_adm " + codAdm);
        lines.add("");
    
        Iterator<Map.Entry<String, List<Produto>>> it = secoes.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, List<Produto>> entry = it.next();
            lines.add(entry.getKey());
            for (Produto p : entry.getValue()) {
                lines.add(String.format("%s %s %d %.2f", 
                            p.getCodigo(), p.getNome(), p.getQuantidade(), p.getPreco()));
            }
            if (it.hasNext()) {
                lines.add("");
            }
        }
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < lines.size(); i++) {
            bw.write(lines.get(i));
            if (i < lines.size() - 1){
                bw.newLine();
            }
        }
        bw.close();
    }
}