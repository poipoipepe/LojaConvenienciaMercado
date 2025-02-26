package visao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import estoque.EstoqueCliente;
import estoque.Produto;
public class AdicionarNoCarrinho extends javax.swing.JFrame {

    EstoqueCliente estoqueCliente;
    String secao;
    private DefaultListModel<String> listEstoque;
    private Map<String, Integer> carrinhoItens = new HashMap<>();

    public AdicionarNoCarrinho(EstoqueCliente estoqueCliente, String secao) {
        this.estoqueCliente = estoqueCliente;
        this.secao = secao;
        initComponents();
        carregarProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        addcarrinho = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        quantidadeCompra = new javax.swing.JSpinner();
        carrinho = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adicionar ao Carrinho");

        jPanel1.setBackground(new java.awt.Color(255, 235, 211));

        jLabel2.setForeground(new java.awt.Color(204, 160, 78));
        jLabel2.setText("Informe o código e a quantidade");

        voltar.setBackground(new java.awt.Color(255, 149, 57));
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 160, 78));
        jLabel1.setText(" Conviniência Condomínio CEFET");

        addcarrinho.setBackground(new java.awt.Color(255, 149, 57));
        addcarrinho.setForeground(new java.awt.Color(255, 255, 255));
        addcarrinho.setText("Adicionar no carrinho");
        addcarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcarrinhoActionPerformed(evt);
            }
        });

        sair.setBackground(new java.awt.Color(255, 149, 57));
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        carrinho.setBackground(new java.awt.Color(255, 149, 57));
        carrinho.setForeground(new java.awt.Color(255, 255, 255));
        carrinho.setText("Ir ao carrinho");
        carrinho.setFocusable(false);
        carrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoActionPerformed(evt);
            }
        });

        jScrollPane1.setForeground(new java.awt.Color(204, 160, 78));

        Lista.setBackground(new java.awt.Color(255, 235, 211));
        Lista.setBorder(null);
        Lista.setForeground(new java.awt.Color(204, 160, 78));
        Lista.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(Lista);

        jLabel3.setForeground(new java.awt.Color(204, 160, 78));
        jLabel3.setText("do item que deseja comprar:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(quantidadeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(addcarrinho)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(carrinho)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carrinho)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantidadeCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(addcarrinho)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sair)
                            .addComponent(voltar))
                        .addGap(51, 51, 51))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        new EscolherSecao(null, estoqueCliente).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void carregarProdutos() {
        List<Produto> produtos = estoqueCliente.getProdutos(secao);
        listEstoque = new DefaultListModel<>();
        for (Produto p : produtos) {
            listEstoque.addElement(p.getCodigo() + " - " + p.getNome() + " | Quant: " + p.getQuantidade() + " | Preço: R$ " + p.getPreco());
        }
        Lista.setModel(listEstoque);
    }

    private void addcarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcarrinhoActionPerformed
        String codigo = jTextFieldCodigo.getText().trim();
        int qtd;
        try {
            qtd = (int) quantidadeCompra.getValue();
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Quantidade inválida!");
            return;
        }
        
        // Verifica se o produto existe e se há estoque suficiente
        boolean encontrou = false;
        for(Produto p : estoqueCliente.getProdutos(secao)) {
            if(p.getCodigo().equals(codigo)) {
                if(p.getQuantidade() < qtd) {
                    JOptionPane.showMessageDialog(this, "Quantidade insuficiente do produto!");
                    return;
                } if (qtd <= 0) {
                    JOptionPane.showMessageDialog(this, "Quantidade inválida!");
                    return;
                }
                encontrou = true;
                break;
            }
        }
        if(!encontrou) {
            JOptionPane.showMessageDialog(this, "Produto não encontrado!");
            return;
        }
        int atual = carrinhoItens.getOrDefault(codigo, 0);
        carrinhoItens.put(codigo, atual + qtd);
        JOptionPane.showMessageDialog(this, "Item adicionado com sucesso!");

        jTextFieldCodigo.setText("");
        quantidadeCompra.setValue(0);
    }//GEN-LAST:event_addcarrinhoActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void carrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoActionPerformed
        new Carrinho(estoqueCliente, secao, carrinhoItens).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_carrinhoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    private javax.swing.JButton addcarrinho;
    private javax.swing.JButton carrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JSpinner quantidadeCompra;
    private javax.swing.JButton sair;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
