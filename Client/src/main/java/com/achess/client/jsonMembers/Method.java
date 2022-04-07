/*
 * Welcome
 */
package com.achess.client.jsonMembers;

/**
 *
 * @author achess
 */
public class Method extends Member{    
    private String type;
    private int parameters;
    public Method(String name, String type, int parameters){
        super(name);
        this.type = type;
        this.parameters = parameters;
    }

    public String getType() {
        return type;
    }

    public int getParameters() {
        return parameters;
    }

    
    
    @Override
    public String toString() {
        return "Method{" + "name=" + value + ", type=" + type + ", parameters=" + parameters + '}';
    }
    
    
}
