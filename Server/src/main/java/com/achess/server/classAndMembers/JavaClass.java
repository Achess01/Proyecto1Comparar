/*
 * Welcome
 */
package com.achess.server.classAndMembers;

import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class JavaClass {
    private String name;
    private ArrayList<Variable> variables;
    private ArrayList<Method> methods;

    public JavaClass(String name, ArrayList<Variable> variables, ArrayList<Method> methods) {
        this.name = name;
        this.variables = variables;
        this.methods = methods;
    }
        
}
