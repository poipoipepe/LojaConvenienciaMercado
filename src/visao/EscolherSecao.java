/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

import estoque.EstoqueAdmin;
import estoque.EstoqueCliente;

/**
 *
 * @author melis
 */
public class EscolherSecao extends javax.swing.JFrame {

    private EstoqueAdmin estoqueAdmin;
    private EstoqueCliente estoqueCliente;
    private String secao;

    public EscolherSecao(EstoqueAdmin estoqueAdmin, EstoqueCliente estoqueCliente) {
        this.estoqueAdmin = estoqueAdmin;
        if (estoqueAdmin == null) {
            if (estoqueCliente == null) {
                try {
                    this.estoqueCliente = new EstoqueCliente("src/Estoque.txt");
                } catch (Exception e) {
                    javax.swing.JOptionPane.showMessageDialog(this, "Erro ao carregar o estoque!");
                    System.exit(1);
                }
            } else {
                this.estoqueCliente = estoqueCliente;
            }
        }
        initComponents();
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
        limpeza = new javax.swing.JRadioButton();
        higiene = new javax.swing.JRadioButton();
        seguir = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        alimento = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escolher Seção");

        jPanel1.setBackground(new java.awt.Color(255, 235, 211));

        limpeza.setForeground(new java.awt.Color(204, 160, 78));
        limpeza.setText("Itens de limpeza");
        limpeza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpezaActionPerformed(evt);
            }
        });

        higiene.setForeground(new java.awt.Color(204, 160, 78));
        higiene.setText("Higiene pessoal");
        higiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                higieneActionPerformed(evt);
            }
        });

        seguir.setBackground(new java.awt.Color(255, 149, 57));
        seguir.setForeground(new java.awt.Color(255, 255, 255));
        seguir.setText("Seguir");
        seguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seguirSeguir(evt);
            }
        });

        voltar.setBackground(new java.awt.Color(255, 149, 57));
        voltar.setForeground(new java.awt.Color(255, 255, 255));
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarVoltar(evt);
            }
        });

        sair.setBackground(new java.awt.Color(255, 149, 57));
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
            }
        });

        jLabel1.setForeground(new java.awt.Color(204, 160, 78));
        jLabel1.setText("Escolha a seção");

        alimento.setForeground(new java.awt.Color(204, 160, 78));
        alimento.setText("Alimentos");
        alimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sair)
                        .addGap(18, 18, 18)
                        .addComponent(seguir))
                    .addComponent(higiene)
                    .addComponent(limpeza)
                    .addComponent(alimento)
                    .addComponent(jLabel1))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(alimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(limpeza)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(higiene)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(sair)
                    .addComponent(seguir))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alimentoActionPerformed
        if (alimento.isSelected()) {
            limpeza.setSelected(false);
            higiene.setSelected(false);
            secao = "alimentos";
        } else {
            secao = "";
        }
    }//GEN-LAST:event_alimentoActionPerformed

    private void higieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_higieneActionPerformed
        if (higiene.isSelected()) {
            limpeza.setSelected(false);
            alimento.setSelected(false);
            secao = "higiene pessoal";
        } else {
            secao = "";
        }
    }//GEN-LAST:event_higieneActionPerformed

    private void limpezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpezaActionPerformed
        if (limpeza.isSelected()) {
            alimento.setSelected(false);
            higiene.setSelected(false);
            secao = "itens de limpeza";
        } else {
            secao = "";
        }
    }//GEN-LAST:event_limpezaActionPerformed

    private void seguirSeguir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seguirSeguir
        if (secao.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma seção!");
        } else {
            if(estoqueAdmin != null) {
                new Escolher(estoqueAdmin, secao).setVisible(true);
            } else {
                new AdicionarNoCarrinho(estoqueCliente, secao).setVisible(true);
            }
            this.dispose();
        }
    }//GEN-LAST:event_seguirSeguir

    private void voltarVoltar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarVoltar
        if(estoqueAdmin != null) {
            new Adm(estoqueAdmin).setVisible(true);
        } else {
            new BemVindo().setVisible(true);
        }
        this.dispose();
    }//GEN-LAST:event_voltarVoltar

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton alimento;
    private javax.swing.JRadioButton higiene;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton limpeza;
    private javax.swing.JButton sair;
    private javax.swing.JButton seguir;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
