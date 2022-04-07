/*
 * Welcome
 */
package com.achess.client.html;

/**
 *
 * @author achess
 */
public class TdTag extends NoTag{
    public TdTag(String value, boolean identifier) {
        super(value, identifier);
    }
    
    @Override
    public String run() {
        
        return "<td>" + super.run() + "</td>";
    }
    
}
