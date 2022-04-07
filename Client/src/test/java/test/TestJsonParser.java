/*
 * Welcome
 */
package test;

import com.achess.client.error.ClientError;
import com.achess.client.jsonParserLexer.JsonLexer;
import com.achess.client.jsonParserLexer.JsonParser;
import com.achess.client.ui.FileManagment;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.StringReader;

/**
 *
 * @author achess
 */
public class TestJsonParser {
    public static void main(String[] args) {
        parse();
    }
   
    private static void parse(){            
        Reader reader = new StringReader(FileManagment.def);            
        JsonLexer lexer = new JsonLexer(reader);                
        JsonParser parser = new JsonParser(lexer);             
        ClientError.reset();
        try{                
            parser.parse();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }                             
}
        
