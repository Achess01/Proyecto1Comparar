/*
 * Welcome
 */
package com.achess.client;

import com.achess.client.ui.ComparePanel;
import com.achess.client.ui.FileManagment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author achess
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private boolean openCopy(){
        String pattern = "(.+)\\/([^\\/]+),(.+)\\/([^\\/]+)";
        boolean withErrors = true;
        JFileChooser upload = new JFileChooser();
        String extensions[] = {"copy", ".copy"};
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("copy",extensions);
        upload.setFileFilter(filtro);
        upload.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        upload.showOpenDialog(null);        
        FileReader fr = null;
        try{
            File file = upload.getSelectedFile();
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);                            
            String line;
            if((line = br.readLine()) != null){                
                if(line.matches(pattern)) loadCopyFiles(line);
            }
        }
        catch (Exception ex){
              //ex.printStackTrace(System.out);
              withErrors = false;
        }
        finally{
            try{
                if(fr!=null){
                fr.close();
                }
            }catch(Exception ex){
                //ex.printStackTrace(System.out);
                withErrors = false;
            }                
        }
        return withErrors;
    }
    
    private void loadCopyFiles(String line){
        String pathFiles[] = line.split(",");
        if(!FileManagment.openJson(pathFiles[0]) || !FileManagment.openDef(pathFiles[1])){
            JOptionPane.showMessageDialog(null,"Error al cargar los archivos");
        } else{
           JOptionPane.showMessageDialog(null,"Cargado con éxito");
          //Open copy  
            this.mainPanel.removeAll();
            this.mainPanel.add(ComparePanel.getCompare());
            System.out.println("Agregado");
            SwingUtilities.updateComponentTreeUI(this);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(772, 459));

        mainPanel.setLayout(new java.awt.BorderLayout());
        getContentPane().add(mainPanel, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Comparar proyectos");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        openCopy();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables
}