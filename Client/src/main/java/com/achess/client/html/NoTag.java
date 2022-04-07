/*
 * Welcome
 */
package com.achess.client.html;

/**
 *
 * @author achess
 */
public class NoTag implements HtmlElement{
    private String value;

    public NoTag(String value) {
        this.value = value;
    }
            
    @Override
    public String run() {
        return value;
    }
    
}
