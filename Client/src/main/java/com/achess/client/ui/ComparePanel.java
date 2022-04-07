/*
 * Welcome
 */
package com.achess.client.ui;

import com.achess.client.error.ClientError;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author achess
 */
public class ComparePanel extends javax.swing.JPanel {
    private static ComparePanel panel;
    private int actualView = -1;
    /**
     * Creates new form ComparePanel
     */
    private ComparePanel() {
        initComponents();
        addJson();
    }
    
    
    private void addJson(){
        if(this.actualView != 0){
            this.actualView = 0;
            this.panelCopy.removeAll();            
            this.panelCopy.add(EditorPanel.getEditor());
            EditorPanel.getEditor().getjTextArea1().setText(FileManagment.json);
            FileManagment.isJson = true;
            SwingUtilities.updateComponentTreeUI(this);
        }
    }
    public static ComparePanel getCompare(){
        if(panel == null){
            panel = new ComparePanel();
        }
        return panel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MenuCopy = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        button3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        panelCopy = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(772, 436));

        jButton1.setText("JSON");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DEF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        button3.setText("REPORTES");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jButton3.setText("Consola");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuCopyLayout = new javax.swing.GroupLayout(MenuCopy);
        MenuCopy.setLayout(MenuCopyLayout);
        MenuCopyLayout.setHorizontalGroup(
            MenuCopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuCopyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton3)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        MenuCopyLayout.setVerticalGroup(
            MenuCopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuCopyLayout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(MenuCopyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(button3)
                    .addComponent(jButton3)))
        );

        panelCopy.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MenuCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MenuCopy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCopy, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        addJson();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(this.actualView != 1){
            this.actualView = 1;
            this.panelCopy.removeAll();            
            this.panelCopy.add(EditorPanel.getEditor());
            FileManagment.isJson = false;
            EditorPanel.getEditor().getjTextArea1().setText(FileManagment.def);
            SwingUtilities.updateComponentTreeUI(this);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
        if(this.actualView != 2 && !ClientError.getError().isErrorFounded()){
            this.actualView = 2;
            this.panelCopy.removeAll();            
            this.panelCopy.add(HtmlPanel.getHtml());            
            SwingUtilities.updateComponentTreeUI(this);
        }else{
            JOptionPane.showMessageDialog(null,"Se compiló con erroes");
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(this.actualView != 3){
            this.actualView = 3;
            this.panelCopy.removeAll();            
            this.panelCopy.add(ErroresPanel.getErrores());            
            SwingUtilities.updateComponentTreeUI(this);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenuCopy;
    private javax.swing.JButton button3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel panelCopy;
    // End of variables declaration//GEN-END:variables
}
