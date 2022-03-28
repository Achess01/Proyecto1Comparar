/*
 * Welcome
 */
package com.achess.server.classAndMembers;

import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class Method extends Member{        
    private ArrayList<Variable> params;
    private ArrayList<Variable> variables;

    public Method(String name, String type) {
        super(name, type);
        params = new ArrayList();
        variables = new ArrayList();
    }

    public void setParams(ArrayList<Variable> params) {        
        this.params = params;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }
          
    
    public ArrayList<Variable> getParams() {
        return params;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();        
        str.append("\t"+type + " " + name+"\n");
        str.append("\t\t-Params\n");
        for(Variable p: params){
            str.append("\t\t\t"+p.toString()+"\n");
        }
        str.append("\t\t-Variables\n");
        for(Variable p: variables){
            str.append("\t\t\t"+p.toString()+"\n");
        }
        return str.toString();
    }
    
    
    
    
    
}
