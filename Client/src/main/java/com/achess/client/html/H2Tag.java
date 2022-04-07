/*
 * Welcome
 */
package com.achess.client.html;

/**
 *
 * @author achess
 */
public class H2Tag extends NoTag{

    public H2Tag(String value, boolean identifier) {
        super(value, identifier);
    }
    
        
    @Override
    public String run() {        
        return "<h2>" + super.run() + "</h2>";
    }
}
