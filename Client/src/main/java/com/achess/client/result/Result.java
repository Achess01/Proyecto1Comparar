/*
 * Welcome
 */
package com.achess.client.result;

import com.achess.client.jsonMembers.JavaClass;
import com.achess.client.jsonMembers.Variable;
import com.achess.client.jsonMembers.Comment;
import com.achess.client.jsonMembers.Method;
import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class Result {
    private static Result result;
    
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
    
    private Result(){
        classes = new ArrayList();
        methods = new ArrayList();
        variables = new ArrayList();
        comments = new ArrayList();
    }
    
    
}
