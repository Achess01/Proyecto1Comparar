/*
 * Welcome
 */
package com.achess.client.result;

import com.achess.client.copy.*;
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
        CopyVariable cv = new CopyVariable("~result~score", Value.STRING);
        cv.setValue(new Value(score.getValue(), Value.STRING));
        ParseCopy.getCopy().addVariable(cv);
        
        for(int x = 0; x < classes.size(); x++){
            String name1 = "~result~clases-0-"+x;            
            CopyVariable cv1 = new CopyVariable(name1, Value.STRING);
            cv1.setValue(new Value(classes.get(x).getValue(), Value.STRING));
            ParseCopy.getCopy().addVariable(cv1);            
        }
        
        for(int x = 0; x < methods.size(); x++){
            String name1 = "~result~metodos-0-"+x;            
            CopyVariable cv1 = new CopyVariable(name1, Value.STRING);
            cv1.setValue(new Value(methods.get(x).getValue(), Value.STRING));
            ParseCopy.getCopy().addVariable(cv1);
            
            String name2 = "~result~metodos-1-"+x;
            CopyVariable cv2 = new CopyVariable(name2, Value.STRING);
            cv2.setValue(new Value(methods.get(x).getType(), Value.STRING));
            ParseCopy.getCopy().addVariable(cv2);   
            
            String name3 = "~result~metodos-2-"+x;
            CopyVariable cv3 = new CopyVariable(name3, Value.INTEGER);
            cv3.setValue(new Value(String.valueOf(methods.get(x).getParameters()), Value.INTEGER));
            ParseCopy.getCopy().addVariable(cv3);
        }
        
        
        for(int x = 0; x < variables.size(); x++){
            String name1 = "~result~variables-0-"+x;            
            CopyVariable cv1 = new CopyVariable(name1, Value.STRING);
            cv1.setValue(new Value(variables.get(x).getValue(), Value.STRING));
            ParseCopy.getCopy().addVariable(cv1);
            
            String name2 = "~result~variables-1-"+x;
            CopyVariable cv2 = new CopyVariable(name2, Value.STRING);
            cv2.setValue(new Value(variables.get(x).getType(), Value.STRING));
            ParseCopy.getCopy().addVariable(cv2);   
            
            String name3 = "~result~variables-2-"+x;
            CopyVariable cv3 = new CopyVariable(name3, Value.STRING);
            cv3.setValue(new Value(variables.get(x).getFunction(), Value.STRING));
            ParseCopy.getCopy().addVariable(cv3);
        }
        
        for(int x = 0; x < classes.size(); x++){
            String name1 = "~result~comentarios-0-"+x;            
            CopyVariable cv1 = new CopyVariable(name1, Value.STRING);
            cv1.setValue(new Value(comments.get(x).getValue(), Value.STRING));
            ParseCopy.getCopy().addVariable(cv1);            
        }
        System.gc();
    }               
}
