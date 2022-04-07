/*
 * Welcome
 */
package com.achess.client.html;

import com.achess.client.copy.CopyVariable;
import com.achess.client.copy.ParseCopy;
import com.achess.client.error.ClientError;

/**
 *
 * @author achess
 */
public class NoTag implements HtmlElement{
    protected String value;
    protected boolean identifier;

    public NoTag(String value, boolean identifier) {
        this.value = value;
        this.identifier = identifier;
    }

    public String getValue() {
        return value;
    }

    public boolean isIdentifier() {
        return identifier;
    }
    
    
            
    @Override
    public String run() {
        String newVar = value;
        if(identifier){            
            String vname[] = value.split(",");  
            if(vname.length == 2){                
                if(isNumber(vname[1])){
                    CopyVariable v = ParseCopy.getCopy().getVariable(vname[0] + vname[1]);
                    newVar = vname[0] + vname[1];
                }else{
                    CopyVariable variable = ParseCopy.getCopy().getVariable(vname[1]);                    
                    newVar = vname[0] + variable.getValue().getValue();                    
                }                 
            }                                    
            CopyVariable v = ParseCopy.getCopy().getVariable(newVar);
            if(v == null){
                ClientError.getError().log("COPY\nLa variable " + newVar + " no existe");     
                newVar="";
            }
            else if(v.getValue() == null){
                ClientError.getError().log("COPY\n" + value + " No tiene ningún valor");                  
                newVar="";
            }
            else{
                newVar = v.getValue().getValue();
            }               
        }
        
        return newVar;
    }
    
}
