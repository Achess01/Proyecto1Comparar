/*
 * Welcome
 */
package com.achess.client.attribute;

import com.achess.client.jsonMembers.Comment;
import com.achess.client.jsonMembers.JavaClass;
import com.achess.client.jsonMembers.Method;
import com.achess.client.jsonMembers.Score;
import com.achess.client.jsonMembers.Variable;
import com.achess.client.error.Error;
import com.achess.client.result.Result;
import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class ValidateJson {
    public static void validate(ArrayList<Attribute> attributes){   
        boolean error = false;
        Score score = null;
        ArrayList<Method> methods = null;
        ArrayList<Variable> variables = null;
        ArrayList<JavaClass> classes = null;
        ArrayList<Comment> comments = null;
        if(attributes.size() != 5){
            Error.getError().log("Error sintáctico\nCantidad de elementos incorrecta ln"+attributes.get(0).getLine());
            error = true;
        }
        for(Attribute attr: attributes){
            switch(attr.getType()){
                case Attribute.CLASSES:
                    if(classes != null){
                       Error.getError().log("Error sintáctico\nClases ya definidas ln"+attr.getLine());
                       error = true;
                    }else{
                        classes = (ArrayList<JavaClass>) attr.getAttribute();
                    }
                    break;
                case Attribute.METHODS:
                    if(methods != null){
                       Error.getError().log("Error sintáctico\nMetodos ya definidas ln"+attr.getLine());
                       error = true;
                    }else{
                        methods = (ArrayList<Method>) attr.getAttribute();
                    }
                    break;
                case Attribute.VARIABLES:
                    if(variables != null){
                       Error.getError().log("Error sintáctico\nVariables ya definidas ln"+attr.getLine());
                       error = true;
                    }else{
                        variables = (ArrayList<Variable>) attr.getAttribute();
                    }
                    break;
                case Attribute.COMMENTS:
                    if(comments != null){
                       Error.getError().log("Error sintáctico\nComentarios ya definidas ln"+attr.getLine());
                       error = true;
                    }else{
                        comments = (ArrayList<Comment>) attr.getAttribute();
                    }
                    break;
                case Attribute.SCORE:
                    if(score != null){
                       Error.getError().log("Error sintáctico\nScore ya definido ln"+attr.getLine());
                       error = true;
                    }else{
                        score = (Score) attr.getAttribute();
                    }
                    break;
            }
        }
        
        if(!error){
            Result.set(score, classes, methods, variables, comments);
        }
    }
}
