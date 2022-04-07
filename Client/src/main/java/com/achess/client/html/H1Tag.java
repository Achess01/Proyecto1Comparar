/*
 * Welcome
 */
package com.achess.client.html;

/**
 *
 * @author achess
 */
public class H1Tag implements HtmlElement{
    private String value;
    
    @Override
    public String run() {
        return "<h1>" + value + "</h1>";
    }
    
}
