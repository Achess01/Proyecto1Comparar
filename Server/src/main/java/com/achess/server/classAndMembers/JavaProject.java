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
    
    private JavaProject(){
        classes = new ArrayList();
    }
    
    public void addClass(JavaClass jc){
        classes.add(jc);
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
    
    public static void compare(JavaProject first, JavaProject second){
        
    }
}
