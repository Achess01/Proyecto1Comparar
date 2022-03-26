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
    private ArrayList<Variable> parameters;
    private ArrayList<Variable> variables;

    public Method(String name, String type) {
        super(name, type);        
    }

    public void setParameters(ArrayList<Variable> parameters) {
        this.parameters = parameters;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }
          
    
    public ArrayList<Variable> getParameters() {
        return parameters;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }
    
    
    
    
}
