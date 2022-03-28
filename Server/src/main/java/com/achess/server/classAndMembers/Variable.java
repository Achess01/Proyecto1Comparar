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
    private boolean counted;
        
    public Variable(String name, String type) {
        super(name, type);
        this.counted = false;
    }
        

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
    
    

    public boolean isCounted() {
        return counted;
    }

    public void setCounted(boolean counted) {
        this.counted = counted;
    }

    @Override
    public String toString() {
        return type + " " + name + " - " + scope;
    }
    
    
    
}
