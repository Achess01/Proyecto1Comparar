/*
 * Welcome
 */
package test;

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
public class TestJsonParser {
    public static void main(String[] args) {
        parse("Test");
    }
   
     private static void parse(String file1){    
        try{
            FileInputStream stream = new FileInputStream("/home/achess/Documents/Tareas/Compi1/Proyecto1/JsonParserLexer/"+file1+".json");
            Reader reader = new InputStreamReader(stream);            
            JsonLexer lexer = new JsonLexer(reader);                
            JsonParser parser = new JsonParser(lexer);             
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
