/*
 * Welcome
 */
package com.achess.server.classAndMembers;

import com.achess.server.repeatedMembers.*;
import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class JavaClass {
    private boolean counted;
    private String name;
    private ArrayList<Method> methods;    
    private ArrayList<Variable> variables;

    public JavaClass(String name) {
        this.name = name;        
        this.methods = new ArrayList();
        this.variables = new ArrayList();
        this.counted = false;
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
    
    public void getRepeatedVariables(ArrayList<Variable> variables2){        
        for(Variable v: variables){
            
            RepeatedVariable rv = new RepeatedVariable(v.getType(), v.getName());
            rv.addPlace(v.getScope());
            v.setCounted(true);            
            
            for(Variable v2: variables2){                
                if(v.equals(v2)){                    
                    rv.addPlace(v2.getScope());
                    rv.repeated();
                    if(!v2.counted){
                        v2.setCounted(true);
                        rv.addCount();
                    }                    
                }                
            }
            if(rv.isRepeated()){                
                Repeated.getRepeated().addVariable(rv);
                Repeated.getRepeated().setRepeatedVariables(rv.getCounted());
            }
        }
                
    }
    
    public void getRepeatedMethods(ArrayList<Method> methods2){
        for(Method m: methods){            
            RepeatedMethod rm = new RepeatedMethod(m.getType(), m.getName(), m.getParams().size());
            m.setCounted(true);            
            
            for(Method m2: methods2){     
                System.out.println("-----------------------------");
                System.out.println(m);
                System.out.println(m2);
                System.out.println("-----------------------------");
                if(m.equals(m2)){                                       
                    rm.repeated();
                    if(!m2.counted){
                        m2.setCounted(true);
                        rm.addCount();
                    }                    
                }                
            }
            if(rm.isRepeated()){                
                Repeated.getRepeated().addMethod(rm);
                Repeated.getRepeated().setRepeatedMethods(rm.getCounted());
            }
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Method> getMethods() {
        return methods;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
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
        
    public int totalVariables(){
        return variables.size();
    }
    
    public int totalMethods(){
        return methods.size();
    }
}
