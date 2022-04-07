/*
 * Welcome
 */
package com.achess.client.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


/**
 *
 * @author achess
 */
public class FileManagment {
    public static boolean isJson = true;
    public static String json="";
    public static String def="";
    
    public static boolean openDef(String path){             
        boolean withErrors = true;        
        FileReader fr = null;
        try{            
            File file = new File(path);
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            def = "";
            String line;
            while((line = br.readLine()) != null){                
                def += line + "\n";
            }
        }
        catch (Exception ex){
              ex.printStackTrace(System.out);
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
    
    
    public static boolean openJson(String path){     
        
        boolean withErrors = true;        
        FileReader fr = null;
        try{            
            File file = new File(path);
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);      
            json = "";
            String line;
            while((line = br.readLine()) != null){                
                json += line + "\n";
            }
        }
        catch (Exception ex){
              ex.printStackTrace(System.out);
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
}
