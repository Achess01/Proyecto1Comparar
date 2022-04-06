/*
 * Welcome
 */
package com.achess.client.error;

/**
 *
 * @author achess
 */
public class ClientError {
    private static ClientError error;
    private boolean errorFounded;
    
    public static ClientError getError(){
        if(error == null){
            error = new ClientError();
        }
        return error;
    }
    
    public static void reset(){
        getError().errorFounded = false;
    }
    
    private ClientError(){
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
