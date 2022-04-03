/*
 * Welcome
 */
package com.achess.client.jsonMembers;

/**
 *
 * @author achess
 */
public class JavaClass extends Member{
    
    public JavaClass(String name){
        super(name);
    }

    @Override
    public String toString() {
        return "JavaClass{"  + "name=" + value + '}';
    }
    
    
}
