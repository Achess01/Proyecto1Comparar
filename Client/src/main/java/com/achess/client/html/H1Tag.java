/*
 * Welcome
 */
package com.achess.client.html;

import com.achess.client.copy.CopyVariable;
import com.achess.client.copy.ParseCopy;
import com.achess.client.copy.Value;
import com.achess.client.error.*;

/**
 *
 * @author achess
 */
public class H1Tag extends NoTag{    

    public H1Tag(String value, boolean identifier) {
        super(value, identifier);        
    }
        
    
    @Override
    public String run() {
        super.run();        
        return "<h1>" + value + "</h1>";
    }
    
}
