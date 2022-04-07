/*
 * Welcome
 */
package com.achess.client.html;

import java.util.ArrayList;
import com.achess.client.copy.*;
import com.achess.client.error.*;

/**
 *
 * @author achess
 */
public class ForTag implements HtmlElement{
    private ArrayList<HtmlElement> elements;
    private String iterador;
    private String hasta;

    public ForTag(ArrayList<HtmlElement> elements, String iterador, String hasta) {
        this.elements = elements;
        this.iterador = iterador;
        this.hasta = hasta;
    }
            
    @Override
    public String run() {
        StringBuilder sb = new StringBuilder();
        if(isNumber(iterador) ||  isNumber(hasta)){
            ClientError.getError().log("Copy\nLos iteradores del for deben de ser variables");
        }else{
            CopyVariable vI = ParseCopy.getCopy().getVariable(iterador);
            CopyVariable vH = ParseCopy.getCopy().getVariable(hasta);                   
            Integer actualValue = vI.getValue().getIntegerValue();        
            if(actualValue <= vH.getValue().getIntegerValue()){
                while(vI.getValue().getIntegerValue() <= vH.getValue().getIntegerValue()){
                    for(HtmlElement e: elements){
                        sb.append(e.run());
                        sb.append('\n');
                    }
                    actualValue++;
                    vI.getValue().setValue(actualValue.toString());
                    actualValue = vI.getValue().getIntegerValue();
                }
            }else{
                sb.append("Loop infinito no ejecutado");
            }             
        }
                          
        return sb.toString();
    }
    
}
