/*
 * Welcome
 */
package com.achess.client.error;

/**
 *
 * @author achess
 */
public class Error {
    private static Error error;
    private boolean errorFounded;
    
    public static Error getError(){
        if(error == null){
            error = new Error();
        }
        return error;
    }
    
    public static void reset(){
        getError().errorFounded = false;
    }
    
    private Error(){
        errorFounded = false;
    }
    
    public void log(String error){
        errorFounded = true;
        System.out.println(error);
    }   

    public boolean isErrorFounded() {
        return errorFounded;
    }
    
    
}
