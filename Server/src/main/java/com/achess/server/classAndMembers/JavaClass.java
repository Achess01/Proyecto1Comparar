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
    private ArrayList<Member> members;    

    public JavaClass(String name) {
        this.name = name;        
        this.members = new ArrayList();
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
    
    

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("JavaClass:\n");
        str.append("\t"+name+"\n");
        str.append("\t-Vars and Methods\n");
        for(Member m: members){
            str.append(m.toString());
        }        
        
        
        
        return str.toString();
    }
        
    
}
