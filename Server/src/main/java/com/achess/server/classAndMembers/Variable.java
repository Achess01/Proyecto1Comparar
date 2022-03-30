/*
 * Welcome
 */
package com.achess.server.classAndMembers;

/**
 *
 * @author achess
 */
public class Variable extends Member{    
    private String scope;        
        
    public Variable(String name, String type) {
        super(name, type);             
    }
               
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
        
    @Override
    public String toString() {
        return type + " " + name + " - " + scope;
    }
            
}
