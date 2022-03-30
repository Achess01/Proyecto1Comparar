/*
 * Welcome
 */
package com.achess.server.classAndMembers;

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
    
    private JavaProject(){
        classes = new ArrayList();
        comments = new ArrayList();
    }
    
    public void addClass(JavaClass jc){
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
    
    public static void compare(JavaProject first, JavaProject second){
        //Crear objeto de repetido y contar apariciones > 1 para agregarlos a repetidos
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
