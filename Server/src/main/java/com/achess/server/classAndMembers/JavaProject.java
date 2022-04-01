/*
 * Welcome
 */
package com.achess.server.classAndMembers;

import com.achess.server.UI.MainForm;
import com.achess.server.error.JavaError;
import com.achess.server.repeatedMembers.*;
import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class JavaProject {
    private static JavaProject firstProject;
    private static JavaProject secondProject;
    private ArrayList<JavaClass> classes;
    private ArrayList<JavaComment> comments; 
    private ArrayList<Variable> variables;
    private ArrayList<Method> methods;
    private int totalVariables;
    private int totalMethods;
    
    private JavaProject(){
        classes = new ArrayList();
        comments = new ArrayList();
        //Esperando respuesta
        variables = new ArrayList();
        methods = new ArrayList();
        //
        totalVariables = 0;
        totalMethods = 0;
    }        
    
    public void addClass(JavaClass jc){                 
        totalVariables += jc.totalVariables();
        totalMethods += jc.totalMethods();
        //
        variables.addAll(jc.getVariables());
        methods.addAll(jc.getMethods());
        jc.clear();
        //
        
        classes.add(jc);        
    }
    
    public void addComment(String comment){        
        comments.add(new JavaComment(comment));
    }
    
    public static JavaProject getProject(boolean firstProject){
        if(firstProject) return getFirst();
        return getSecond();
    }
    
    private static JavaProject getFirst(){
        if(firstProject == null){
            firstProject = new JavaProject();
        }
        return firstProject;
    }
    
    private static JavaProject getSecond(){
        if(secondProject == null){
            secondProject = new JavaProject();
        }
        return secondProject;
    }
    
    public static void clear(){
        firstProject = null;
        secondProject = null;
    }
        
    private static void getRepeatedVariables(ArrayList<Variable> variables, ArrayList<Variable> variables2){        
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
    
    private static void getRepeatedMethods(ArrayList<Method> methods, ArrayList<Method> methods2){
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
    
    private static void getRepeatedClasses(ArrayList<JavaClass> classes, ArrayList<JavaClass> classes2){
         for(JavaClass jc: classes){
            RepeatedClass rc = new RepeatedClass(jc.getName());            
            for(JavaClass jc2: classes2){                
                if(jc.equals(jc2)){
                    rc.repeated();
                    if(!jc2.isCounted()){
                        jc2.setCounted(true);
                        rc.addCount();
                    }
                }
            }
            if(rc.isRepeated()){                
                Repeated.getRepeated().addClass(rc);
                Repeated.getRepeated().setRepeatedClasses(rc.getCounted());
            }
        }
    }
    
    private static void getRepeatedComments(ArrayList<JavaComment> comments, ArrayList<JavaComment> comments2){
        for(JavaComment jc: comments){
            RepeatedComment rc = new RepeatedComment(jc.getComment());            
            for(JavaComment jc2: comments2){                
                if(jc.equals(jc2)){
                    rc.repeated();
                    if(!jc2.isCounted()){
                        jc2.setCounted(true);
                        rc.addCount();
                    }
                }
            }
            if(rc.isRepeated()){                
                Repeated.getRepeated().addComment(rc);
                Repeated.getRepeated().setRepeatedComments(rc.getCounted());
            }
        }
    }
    
    
    public static void compare(){
        if(!JavaError.getError().isErrorFounded()){
            doCompare();
            MainForm.getForm().log("------- SIN ERRORES -------\n");
            MainForm.getForm().log(Repeated.getRepeated().toString());
            MainForm.getForm().log("------- DETALLES QUITAR -------\n");
            MainForm.getForm().log(Repeated.getRepeated().getDetails());
        }
    }
    private static void doCompare(){
        //Crear objeto de repetido y contar apariciones > 1 para agregarlos a repetidos
        Repeated.clear();
        Repeated.getRepeated().addTotalVariables(firstProject.totalVariables);
        Repeated.getRepeated().addTotalVariables(secondProject.totalVariables);
        
        Repeated.getRepeated().totalMethods(firstProject.totalMethods);
        Repeated.getRepeated().totalMethods(secondProject.totalMethods);
        
        Repeated.getRepeated().totalClasses(firstProject.classes.size());
        Repeated.getRepeated().totalClasses(secondProject.classes.size());
        
        Repeated.getRepeated().totalComments(firstProject.comments.size());
        Repeated.getRepeated().totalComments(secondProject.comments.size());
        
        //Variables
        getRepeatedVariables(firstProject.variables, secondProject.variables);
        //Methods
        getRepeatedMethods(firstProject.methods, secondProject.methods);                
        //Classes
        getRepeatedClasses(firstProject.classes, secondProject.classes);
        //Comments
        getRepeatedComments(firstProject.comments, secondProject.comments);
        Repeated.getRepeated().score();
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for(JavaClass jc: classes){
            str.append(jc.toString());
        }
        str.append("\n\n");
        for(JavaComment jc: comments){
            str.append(jc.toString());
        }        
        return str.toString();
    }
       
}
