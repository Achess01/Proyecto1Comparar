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
        return "Method{" + super.toString()+ '}';
    }
    
    
    
    
    
}
