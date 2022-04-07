/*
 * Welcome
 */
package com.achess.client.html;

import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class ForTag implements HtmlElement{
    private ArrayList<HtmlElement> elements;

    public ForTag(ArrayList<HtmlElement> elements) {
        this.elements = elements;
    }
    
        
    @Override
    public String run() {
        StringBuilder sb = new StringBuilder();
        for(HtmlElement e: elements){
            sb.append(e.run());
            sb.append('\n');
        }
        return sb.toString();
    }
    
}
