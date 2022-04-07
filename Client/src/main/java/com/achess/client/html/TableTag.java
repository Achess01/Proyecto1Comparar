/*
 * Welcome
 */
package com.achess.client.html;

import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class TableTag implements HtmlElement{
    private ArrayList<HtmlElement> elements;

    public TableTag(ArrayList<HtmlElement> elements) {
        this.elements = elements;
    }
        
    protected String getElementsHtml(){
        StringBuilder sb = new StringBuilder();
        for(HtmlElement e: elements){
            sb.append(e.run());
            sb.append('\n');
        }
        return sb.toString();
    }
    
    @Override
    public String run() {
        
        return "<table>" + getElementsHtml() + "</table>";
    }
    
}
