/*
 * Welcome
 */
package com.achess.client.copy;

import com.achess.client.copyParserLexer.CopyLexer;
import com.achess.client.copyParserLexer.CopyParser;
import com.achess.client.error.ClientError;
import com.achess.client.jsonParserLexer.JsonLexer;
import com.achess.client.jsonParserLexer.JsonParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.HashMap;

/**
 *
 * @author achess
 */
public class ParseCopy {
    private static ParseCopy copy;
            
    public static ParseCopy getCopy(){
        if(copy == null){
            copy = new ParseCopy();            
        }
        return copy;
    }
    
    public static void run(){
        clear();
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
        
    public static void clear(){
        copy = null;
        System.gc();
    }
    
    private HashMap<String, CopyVariable> symbolTable;
    private ParseCopy(){
        symbolTable = null;
    }
    
    
    
    public void addVariable(String name, int type){
        symbolTable.put(name, new CopyVariable(name, type));
    }
    
    public void addVariable(String name, int type, Operation operation){
        Value val = operation.run();
        if(val == null || val.getType() != type){
            ClientError.getError().log("COPY\nEl tipo de la variable no coincide el valor. ln:" + operation.getLine());
        }
        else{
            symbolTable.put(name, new CopyVariable(name, type, val));
        }        
    }
    
    public void reAssignVariable(String name, Operation operation){
        CopyVariable variable = symbolTable.get(name);
        if(variable == null){
            ClientError.getError().log("COPY\nLa variable no está definida" + operation.getLine());
        }
        else{
            Value val = operation.run();
            if(val == null || val.getType() != variable.getType()){
                ClientError.getError().log("COPY\nEl tipo de la variable no coincide el valor. ln:" + operation.getLine());
            }
            else{
                variable.setValue(val);
            }
        }
    }
}
