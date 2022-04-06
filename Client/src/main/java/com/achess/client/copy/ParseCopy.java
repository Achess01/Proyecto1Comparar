/*
 * Welcome
 */
package com.achess.client.copy;

import com.achess.client.copyParserLexer.CopyLexer;
import com.achess.client.copyParserLexer.CopyParser;
import com.achess.client.jsonParserLexer.JsonLexer;
import com.achess.client.jsonParserLexer.JsonParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author achess
 */
public class ParseCopy {
    
    public static void run(){
        parse("Test");
    }
    private static void parse(String file1){    
        try{
            FileInputStream stream = new FileInputStream("/home/achess/Documents/Tareas/Compi1/Proyecto1/CopyParserLexer/"+file1+".def");
            Reader reader = new InputStreamReader(stream);            
            CopyLexer lexer = new CopyLexer(reader);                
            CopyParser parser = new CopyParser(lexer);             
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
