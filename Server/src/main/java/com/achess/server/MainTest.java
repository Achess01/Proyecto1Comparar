/*
 * Welcome
 */
package com.achess.server;

import com.achess.server.classAndMembers.Member;
import com.achess.server.classAndMembers.Variable;
import com.achess.server.lexer.JavaLexer;
import com.achess.server.parser.JavaParser;
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
        try{
            FileInputStream stream = new FileInputStream("/home/achess/Documents/Tareas/Compi1/Proyecto1/JavaParserLexer/Test.java");
            Reader reader = new InputStreamReader(stream);            
            JavaLexer lexer = new JavaLexer(reader);            
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
    }
}
