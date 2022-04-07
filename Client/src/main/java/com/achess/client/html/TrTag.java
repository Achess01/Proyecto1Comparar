/*
 * Welcome
 */
package com.achess.client.html;

import java.util.ArrayList;

/**
 *
 * @author achess
 */
public class TrTag extends TableTag{

    public TrTag(ArrayList<HtmlElement> elements) {
        super(elements);
    }
    
     @Override
    public String run() {        
        return "<tr>\n" + getElementsHtml() + "</tr>";
    }
}
