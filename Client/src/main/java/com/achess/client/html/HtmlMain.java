/*
 * Welcome
 */
package com.achess.client.html;

import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class HtmlMain implements HtmlElement{
    private static HtmlMain html;
    
    private String finalHtml;
    
    public static HtmlMain getHtml(){
        if(html == null){
            html = new HtmlMain();
        }
        return html;
    }
    
    public static void clear(){
        html = null;
    }
    
    private ArrayList<HtmlElement> elements;

    @Override
    public String run() {
        
        if(finalHtml == null){
            StringBuilder sb = new StringBuilder();
                for(HtmlElement e: elements){
                sb.append(e.run());
                sb.append('\n');
            }
            finalHtml = "<html>"+sb.toString() + "</html>";
        }                                         
        return finalHtml;        
    }

    public void setElements(ArrayList<HtmlElement> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "HtmlMain{" + "elements=" + elements + '}';
    }
    
        
}
