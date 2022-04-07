/*
 * Welcome
 */
package com.achess.server.UI;

import com.achess.server.classAndMembers.JavaProject;
import com.achess.server.lexer.JavaLexer;
import com.achess.server.parser.JavaParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class ProjectsJava {
    private static ProjectsJava pj;
    
    private ArrayList<String> pj1;
    private ArrayList<String> pj2;
    private ProjectsJava(){
        pj1 = new ArrayList();
        pj2 = new ArrayList();
    }
    
    public static ProjectsJava getPJ(){
        if(pj == null){
            pj = new ProjectsJava();
        }
        return pj;
    }

    public ArrayList<String> getPj1() {
        return pj1;
    }

    
    public void addFile(String text, boolean isP1){
        if(isP1){
            pj1.add(text);
        }else{
            pj2.add(text);
        }
    }
    
    
    public void setPj1(ArrayList<String> pj1) {
        this.pj1 = pj1;
    }

    public ArrayList<String> getPj2() {
        return pj2;
    }

    public void setPj2(ArrayList<String> pj2) {
        this.pj2 = pj2;
    }

    @Override
    public String toString() {
        return "ProjectsJava{" + "pj1=" + pj1 + ", \n\npj2=" + pj2 + '}';
    }
        
    public void parse(){           
           for(String f: pj1){
                Reader reader = new StringReader(f);
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
           
           for(String f: pj2){
                Reader reader = new StringReader(f);
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
           
           JavaProject.compare();
    }
}
