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
    private ArrayList<Method> methods;    
    private ArrayList<Variable> variables;

    public JavaClass(String name) {
        this.name = name;        
        this.methods = new ArrayList();
        this.variables = new ArrayList();
    }

    public void setMembers(ArrayList<Member> members) {
        members.forEach(member -> {
            if(member instanceof Variable){                
                variables.add((Variable) member);
            }else if(member instanceof Method){
                Method m = (Method) member;
                variables.addAll(m.getParams());
                variables.addAll(m.getVariables());
                m.getVariables().clear();
                methods.add(m);
            }
        });
    }
    
    

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("JavaClass:\n");
        str.append("\t"+name+"\n");
        str.append("\t-Vars\n");
        for(Member m: variables){
            str.append("\t"+m.toString()+"\n");
        }        
        str.append("\t-Methods\n");
        for(Member m: methods){
            str.append(m.toString());
        }                                
        return str.toString();
    }
        
    
}
