/*
 * Welcome
 */
package com.achess.server.error;
import com.achess.server.UI.MainForm;

/**
 *
 * @author achess
 */
public class JavaError {
    private boolean errorFounded;
    private static JavaError error;
    
    private JavaError(){
        errorFounded = false;
    }
    
    public static JavaError getError(){
        if(error == null){
            error = new JavaError();
        }
        return error;
    }
    
    public void log(String text){
        errorFounded = true;
        MainForm.getForm().log(text);        
    }

    public boolean isErrorFounded() {
        return errorFounded;
    }
    
    public static void clear(){
        error = null;
    }
}
