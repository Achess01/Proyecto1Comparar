/*
 * Welcome
 */
package com.achess.client.html;

/**
 *
 * @author achess
 */
public class ThTag extends NoTag{

    public ThTag(String value, boolean identifier) {
        super(value, identifier);
    }
    
    @Override
    public String run() {
        
        return "<th>" + super.run() + "</th>";
    }
}
