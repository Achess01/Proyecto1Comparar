/*
 * Welcome
 */
package com.achess.server;

import com.achess.server.UI.MainForm;
import com.achess.server.classAndMembers.JavaProject;
import com.achess.server.classAndMembers.Member;
import com.achess.server.classAndMembers.Variable;
import com.achess.server.lexer.JavaLexer;
import com.achess.server.parser.JavaParser;
import com.achess.server.repeatedMembers.Repeated;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class MainTest {
    
     public static void main(String[] args) { 
         //
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
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
                MainForm.getForm().setVisible(true);                
            }
        });
         //                
    }
     
    private static void clear(){
        //Limpiar singletons
    }
     
    private static void parse(String file1, String file2){    
        try{
            FileInputStream stream = new FileInputStream("/home/achess/Documents/Tareas/Compi1/Proyecto1/JavaParserLexer/"+file1+".java");
            Reader reader = new InputStreamReader(stream);            
            JavaLexer lexer = new JavaLexer(reader);    
            lexer.setFirstProject(true);
            JavaParser parser = new JavaParser(lexer, true);             
            try{                
                parser.parse();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        try{
            FileInputStream stream = new FileInputStream("/home/achess/Documents/Tareas/Compi1/Proyecto1/JavaParserLexer/"+file2+".java");
            Reader reader = new InputStreamReader(stream);            
            JavaLexer lexer = new JavaLexer(reader);    
            lexer.setFirstProject(false);
            JavaParser parser = new JavaParser(lexer, false);             
            try{                
                parser.parse();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        }
        
        JavaProject.compare();        
    }
}
