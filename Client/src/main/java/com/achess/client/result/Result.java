/*
 * Welcome
 */
package com.achess.client.result;

import com.achess.client.jsonMembers.JavaClass;
import com.achess.client.jsonMembers.Variable;
import com.achess.client.jsonMembers.Comment;
import com.achess.client.jsonMembers.Method;
import com.achess.client.jsonMembers.Score;
import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class Result {
    private static Result result;
            
    public static void set(Score score, ArrayList<JavaClass> classes, ArrayList<Method> methods, ArrayList<Variable> variables, ArrayList<Comment> comments) {
        getResult().setClasses(classes);
        getResult().setMethods(methods);
        getResult().setVariables(variables);
        getResult().setComments(comments);
        getResult().setScore(score);
    }
            
    public static Result getResult(){
        if(result == null){
            result = new Result();
        }
        return result;
    }
    
    public static void clear(){
        result = null;
    }
            
    
    private ArrayList<JavaClass> classes;
    private ArrayList<Method> methods;
    private ArrayList<Variable> variables;
    private ArrayList<Comment> comments;
    private Score score;
    
    private Result(){
        classes = new ArrayList();
        methods = new ArrayList();
        variables = new ArrayList();
        comments = new ArrayList();        
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
    
    

    public ArrayList<JavaClass> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<JavaClass> classes) {
        this.classes = classes;
    }

    public ArrayList<Method> getMethods() {
        return methods;
    }

    public void setMethods(ArrayList<Method> methods) {
        this.methods = methods;
    }

    public ArrayList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Result{\n" + "classes=" + classes + ",\nmethods=" + methods + ",\nvariables=" + variables + ",\ncomments=" + comments + ",\nscore=" + score + '}';
    }
    
        
}
