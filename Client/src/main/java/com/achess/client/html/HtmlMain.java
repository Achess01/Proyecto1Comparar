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
        //System.out.println(this);
        StringBuilder sb = new StringBuilder();
        for(HtmlElement e: elements){
            sb.append(e.run());
            sb.append('\n');
        }        
        return "<html>\n" +  sb.toString() + "</html>";
    }

    public void setElements(ArrayList<HtmlElement> elements) {
        this.elements = elements;
    }

    @Override
    public String toString() {
        return "HtmlMain{" + "elements=" + elements + '}';
    }
    
        
}
