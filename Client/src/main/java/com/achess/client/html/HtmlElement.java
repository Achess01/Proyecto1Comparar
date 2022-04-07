/*
 * Welcome
 */
package com.achess.client.html;

/**
 *
 * @author achess
 */
public interface HtmlElement {
    public String run();
    default boolean isNumber(String n){
        try{
            Integer.parseInt(n);
            return true;
        }catch(Exception ex){
            return false;
        }
    }
}
