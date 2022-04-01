/*
 * Welcome
 */
package com.achess.server.repeatedMembers;

/**
 *
 * @author achess
 */
public class RepeatedMethod extends RepeatedMember{
    private int parametersAmount;
    
    public RepeatedMethod(String type, String name, int parametersAmount){
        super(type, name);
        this.parametersAmount = parametersAmount;
    }

    @Override
    public String toString() {
         StringBuilder str = new StringBuilder();
        str.append('{');
        
        str.append(super.toString());
        //"Nombre":"nombre","Tipo","tipo",
                
        str.append('"');
        str.append("Parametros");
        str.append('"');        
        str.append(':');                
        
        str.append(parametersAmount);
                                
        str.append('}');
        return str.toString();
    }
    
    
        
}
