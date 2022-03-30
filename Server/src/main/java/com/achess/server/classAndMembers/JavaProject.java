/*
 * Welcome
 */
package com.achess.server.classAndMembers;

import com.achess.server.repeatedMembers.Repeated;
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
    private int totalVariables;
    private int totalMethods;
    
    private JavaProject(){
        classes = new ArrayList();
        comments = new ArrayList();
        totalVariables = 0;
        totalMethods = 0;
    }        
    
    public void addClass(JavaClass jc){
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
            for(JavaClass jc2: secondProject.classes){
                jc.getRepeatedVariables(jc2.getVariables());
                jc.getRepeatedMethods(jc2.getMethods());
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
