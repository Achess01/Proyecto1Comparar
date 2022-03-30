/*
 * Welcome
 */
package com.achess.server.classAndMembers;

import java.util.ArrayList;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Method other = (Method) obj;
        if(this.params.size() != other.params.size()){
            return false;
        }
        boolean founded;        
        for(Variable v: this.params){
            founded = false;
            boolean comparated[] = new boolean[other.params.size()];
            for(int i = 0; i < other.params.size(); i++){  
                Variable v2 = other.params.get(i);                
                if(!comparated[i] && v.equals(v2)){
                    comparated[i] = true;
                    founded = true;
                    break;
                }
            }
            if(!founded) return false;
        }
        
        return super.equals(obj);
    }
        
}
