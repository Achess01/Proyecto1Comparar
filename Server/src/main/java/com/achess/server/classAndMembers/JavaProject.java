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
        System.out.println("----------Agregando-------");
        System.out.println(jc.getName());
        System.out.println(jc.totalVariables());
        System.out.println(jc.totalMethods());
        System.out.println("---------------------------");                
        //Esperando respuesta
            variables.addAll(jc.getVariables());
            methods.addAll(jc.getMethods());
            jc.clear();
        //Para comparar todas cambiar los métodos de comparación
        totalVariables += jc.totalVariables();
        totalMethods += jc.totalMethods();
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
        
    
    public static void compare(){
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
        
        //Variables and methods
        for(JavaClass jc: firstProject.classes){
            RepeatedClass rc = new RepeatedClass(jc.getName());
            for(JavaClass jc2: secondProject.classes){
                jc.getRepeatedVariables(jc2.getVariables());
                jc.getRepeatedMethods(jc2.getMethods());
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
