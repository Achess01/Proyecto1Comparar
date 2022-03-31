/*
 * Welcome
 */
package com.achess.server.classAndMembers;

import com.achess.server.repeatedMembers.*;
import java.util.ArrayList;
import java.util.Objects;

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

    public boolean isCounted() {
        return counted;
    }

    public void setCounted(boolean counted) {
        this.counted = counted;
    }

    public void clear(){
        variables.clear();
        //methods.clear();
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
    
    /*
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
                        System.out.println(v2.getName() +"- Contado - " + rv.getCounted());
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
    */

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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final JavaClass other = (JavaClass) obj;
        
        if(other.methods.size() != this.methods.size()){
            return false;
        }
        boolean founded = true;
        for(Method m: this.methods){
            founded = false;
            boolean comparated[] = new boolean[other.methods.size()];
            for(int i = 0; i < other.methods.size(); i++){  
                Method m2 = other.methods.get(i);                
                if(!comparated[i] && m.getName().equals(m2.getName())){
                    comparated[i] = true;
                    founded = true;
                    break;
                }
            }
            if(!founded) return false;
        }
        
        return Objects.equals(this.name, other.name);
    }
    
    
        
    public int totalVariables(){
        return variables.size();
    }
    
    public int totalMethods(){
        return methods.size();
    }
}
