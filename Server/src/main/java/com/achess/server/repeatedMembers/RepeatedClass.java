/*
 * Welcome
 */
package com.achess.server.repeatedMembers;

/**
 *
 * @author achess
 */
public class RepeatedClass extends RepeatedMember{    

    public RepeatedClass(String name) {
        super("class", name);
    }

    @Override
    public String toString() {
        return "{\"Nombre\":" +"\"" +name + "\"}";
    }
    
    
}
