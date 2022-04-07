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

    public String getScore() {
        return score.getValue();
    }

    public void setScore(Score score) {
        this.score = score;
    }
    
    

    public String getClasses(int index) {
        if(index >=0 && index < classes.size()){
            return classes.get(index).getValue();
        }
        return null;
    }

    public void setClasses(ArrayList<JavaClass> classes) {
        this.classes = classes;
    }

    public String getMethods(int index, int param) {
        if(index >=0 && index < methods.size()){
            switch(param){
                case 0:
                    return methods.get(index).getValue();                    
                case 1:
                    return methods.get(index).getType();
                case 2:
                    return String.valueOf(methods.get(index).getParameters());
            }
            
        }
        return null;
    }

    public void setMethods(ArrayList<Method> methods) {
        this.methods = methods;
    }

    public String getVariables(int index, int param) {
        if(index >=0 && index < variables.size()){
            switch(param){
                case 0:
                    return variables.get(index).getValue();                    
                case 1:
                    return variables.get(index).getType();
                case 2:
                    return variables.get(index).getFunction();
            }            
        }        
        return null;
    }

    public void setVariables(ArrayList<Variable> variables) {
        this.variables = variables;
    }

    public String getComments(int index) {
        if(index >=0 && index < comments.size()){
            return comments.get(index).getValue();
        }        
        return null;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Result{\n" + "classes=" + classes + ",\nmethods=" + methods + ",\nvariables=" + variables + ",\ncomments=" + comments + ",\nscore=" + score + '}';
    }
    
        
}
