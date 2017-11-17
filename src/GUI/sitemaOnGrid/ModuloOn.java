/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.sitemaOnGrid;

import GUI.utils.Mensagem;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Marlon
 */
public class ModuloOn extends javax.swing.JFrame {

    /**
     * Creates new form Modulo
     */

    public ModuloOn() {
        initComponents();
        this.setLocationRelativeTo(null);
        URL url = this.getClass().getResource("/GUI/utils/imagens/logo.jpeg");  
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);  
        this.setIconImage(iconeTitulo);
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
        jLabel1 = new javax.swing.JLabel();
        consumoMM = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        radiacaoSolar = new javax.swing.JFormattedTextField();
        jLabel12 = new javax.swing.JLabel();
        calcularConsumo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        eficiencia = new javax.swing.JFormattedTextField();
        add4 = new javax.swing.JButton();
        potencia = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        area = new javax.swing.JFormattedTextField();
        jLabel14 = new javax.swing.JLabel();
        tensaoCA = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();

        setTitle("SEDSS");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 1, 1));
        jLabel2.setText("SEDSS");

        jLabel1.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(195, 15, 11));
        jLabel1.setText("SISTEMA ON GRID ");

        consumoMM.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        consumoMM.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(2, 130, 65));
        jLabel9.setText("Consumo médio mensal (kWh)");

        jLabel10.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(2, 130, 65));
        jLabel10.setText("Radiação solar (kWh/m2/dia)");

        radiacaoSolar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        radiacaoSolar.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        radiacaoSolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiacaoSolarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(2, 130, 65));
        jLabel12.setText("Eficiência (%)");

        calcularConsumo.setBackground(new java.awt.Color(1, 127, 66));
        calcularConsumo.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        calcularConsumo.setForeground(new java.awt.Color(254, 254, 254));
        calcularConsumo.setText("Calcular");
        calcularConsumo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calcularConsumoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                calcularConsumoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                calcularConsumoMouseReleased(evt);
            }
        });
        calcularConsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularConsumoActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/utils/imagens/logo_FOTODIM.jpeg"))); // NOI18N

        eficiencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        eficiencia.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        add4.setBackground(new java.awt.Color(1, 127, 66));
        add4.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        add4.setForeground(new java.awt.Color(254, 254, 254));
        add4.setText("Calcular");
        add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add4ActionPerformed(evt);
            }
        });

        potencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        potencia.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        jLabel13.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(2, 130, 65));
        jLabel13.setText("Potência (W)");

        area.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        area.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(2, 130, 65));
        jLabel14.setText("Área da superfície (m2)");

        tensaoCA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        tensaoCA.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("UnGraphic", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(2, 130, 65));
        jLabel15.setText("Tensão de circuito aberto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(consumoMM, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcularConsumo))
                            .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radiacaoSolar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tensaoCA, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(add4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radiacaoSolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(consumoMM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calcularConsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(3, 3, 3)
                                .addComponent(eficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(3, 3, 3)
                                .addComponent(potencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(3, 3, 3)
                        .addComponent(area, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(3, 3, 3)
                        .addComponent(tensaoCA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(add4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularConsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularConsumoActionPerformed
        CalcularEquipamentos ce = new CalcularEquipamentos();
        ce.setVisible(true);
    }//GEN-LAST:event_calcularConsumoActionPerformed

    private void radiacaoSolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiacaoSolarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiacaoSolarActionPerformed

    private void add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add4ActionPerformed
        try {
            Double consumoMensal = Double.parseDouble(consumoMM.getValue().toString());
            Double radicao = Double.parseDouble(radiacaoSolar.getValue().toString());
            Double potenciaModulo = Double.parseDouble(potencia.getValue().toString());
            Double eficienciaModulo = Double.parseDouble(eficiencia.getValue().toString());
            Double areaModulo = Double.parseDouble(area.getValue().toString());
            Double tensao = Double.parseDouble(tensaoCA.getValue().toString());
            
            if (consumoMensal > 0 && radicao > 0 &&
                radicao > 0 && potenciaModulo > 0 &&
                eficienciaModulo > 0 && eficienciaModulo > 0 && 
                areaModulo > 0) {
                
                Double energiaDiaria = radicao*areaModulo*(eficienciaModulo/100);
                energiaDiaria /= 1000;
                energiaDiaria *= 30;
                
                Double numeroModulo = consumoMensal/energiaDiaria;
                long numeroInteiro = Math.round(numeroModulo);
                Double tensaoESInversor = numeroInteiro*tensao*1.1;
                Double potenciaInversor = numeroInteiro*potenciaModulo;
                
                Mensagem m = new Mensagem("para produzir "+consumoMensal+" kWh/mês são necessários "+numeroInteiro+
                                          " módulos fotovoltaicos de "+potenciaModulo+" W.\n"+
                                                  
                                          "Dimensionamento do inversor:\n\n"+
                                          "Então o inversor deve ser capaz de suportar a potência"+
                                          " máxima de "+potenciaInversor+" W"+
                                          " e a tensão de entrada de "+tensaoESInversor+" V.",
                                          
                                          "Dados do sistema on grid");
                m.setVisible(true); 
                
            }else{
                Mensagem m = new Mensagem("Houve um erro, tente novamente!", "Dados do circuito");
                m.setVisible(true);
            }
        } catch (NumberFormatException e) {
            Mensagem m = new Mensagem("Houve um erro, tente novamente!", "Dados do circuito");
            m.setVisible(true);
        }
    }//GEN-LAST:event_add4ActionPerformed

    private void calcularConsumoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularConsumoMouseReleased

    }//GEN-LAST:event_calcularConsumoMouseReleased

    private void calcularConsumoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularConsumoMouseExited

    }//GEN-LAST:event_calcularConsumoMouseExited

    private void calcularConsumoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calcularConsumoMouseEntered
        calcularConsumo.setToolTipText("Calcular o consumo médio mensal do sistema");
    }//GEN-LAST:event_calcularConsumoMouseEntered

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModuloOn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ModuloOn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add4;
    private javax.swing.JFormattedTextField area;
    private javax.swing.JButton calcularConsumo;
    private javax.swing.JFormattedTextField consumoMM;
    private javax.swing.JFormattedTextField eficiencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField potencia;
    private javax.swing.JFormattedTextField radiacaoSolar;
    private javax.swing.JFormattedTextField tensaoCA;
    // End of variables declaration//GEN-END:variables
}
