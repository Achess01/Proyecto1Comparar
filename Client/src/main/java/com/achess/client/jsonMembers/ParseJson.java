/*
 * Welcome
 */
package com.achess.client.jsonMembers;

import com.achess.client.error.ClientError;
import com.achess.client.jsonParserLexer.JsonLexer;
import com.achess.client.jsonParserLexer.JsonParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

/**
 *
 * @author achess
 */
public class ParseJson {
        
     public static void parse(String code){                        
            ClientError.reset();
            Reader reader = new StringReader(code);            
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
